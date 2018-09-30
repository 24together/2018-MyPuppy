/*
 *	Project My Puppy Story
 *	Core Class
 *	
 *	Team N1 _ Oh EunSeok, Kim MinYeong, Yoon GeonHwi
 *	Since 17.09.12
 *	
 *	Version 0.1.8 Beta
 *	Last update : 17.10.09
 */
package TMGC;
import java.util.*;
import java.text.*;
import java.io.*;

public class TMGC{
	public void play() {
		int tmpLV, tmpEXP, tmpHP, tmpStress;
		tmpLV=TMGCSYS.tmgcLV;
		tmpEXP=TMGCSYS.tmgcEXP;
		tmpHP=TMGCSYS.tmgcHP;
		tmpStress=TMGCSYS.tmgcStress;
		
		if(TMGCSYS.tmgcDeath==1) {
			System.out.println("[System] 펫이 세상을 떠났습니다.\n게임을 다시 시작하세요.\n");
		}else {
			if(TMGCSYS.tmgcStress>=50) System.out.println("[System] 펫이 스트레스를 너무 많이 받았습니다. 잠자기으로 피로도를 풀어주세요.\n");
			
			TMGCGAME.minigame();
		}
	}
	public void eat() {
		int tmpLV, tmpEXP, tmpHP, tmpStress;
		tmpLV=TMGCSYS.tmgcLV;
		tmpEXP=TMGCSYS.tmgcEXP;
		tmpHP=TMGCSYS.tmgcHP;
		tmpStress=TMGCSYS.tmgcStress;
		
		if(TMGCSYS.tmgcDeath==1) {
			System.out.println("[System] 펫이 세상을 떠났습니다.\n게임을 다시 시작하세요.\n");
		}else {
			if(TMGCSYS.tmgcStress>=50) System.out.println("[System] 펫이 스트레스를 너무 많이 받았습니다. 잠자기로 피로도를 풀어주세요.\n");
			if(TMGCSYS.tmgcLimitEat>=3) {
				System.out.println("[System] 너무 많이 먹었습니다. 잠자기 또는 산책하기로 포만감을 해소하세요.\n");
			}else {
				if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
					TMGCSYS.tmgcEXP += (1+TMGCSYS.tmgcLV);
					TMGCSYS.tmgcHP += (5-TMGCSYS.tmgcFeel);
					TMGCSYS.tmgcStress += (5+TMGCSYS.tmgcFeel);
				}
				
				TMGCSYS.tmgcLimitEat+=1;
				TMGCSYS.tmgcLimitSleep=0;
				
				if(TMGCSYS.tmgcLimitEat>=3)	TMGCSYS.tmgcCheckRegularHealth+=1;
					
				TMGC.setlevel();
				
				TMGC.playMotion("eat","잠시만 기다려 주세요... 펫이 밥을 먹고 있습니다...");
				TMGC.playMotion("eat_down","잠시만 기다려 주세요... 펫이 밥을 먹고 있습니다...");
				TMGC.playMotion("eat","잠시만 기다려 주세요... 펫이 밥을 먹고 있습니다...");
				TMGC.playMotion("eat_down","잠시만 기다려 주세요... 펫이 밥을 먹고 있습니다...");
				System.out.println("주인님! 잘 먹었습니다!\n(레벨 : "+tmpLV+"->"+TMGCSYS.tmgcLV+", 경험치 : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", 체력 : "+tmpHP+"->"+TMGCSYS.tmgcHP+", 스트레스 : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
			}
		}
	}
	public void sleep() {
		int tmpLV, tmpEXP, tmpHP, tmpStress;
		tmpLV=TMGCSYS.tmgcLV;
		tmpEXP=TMGCSYS.tmgcEXP;
		tmpHP=TMGCSYS.tmgcHP;
		tmpStress=TMGCSYS.tmgcStress;
		
		if(TMGCSYS.tmgcDeath==1) {
			System.out.println("[System] 펫이 세상을 떠났습니다.\n게임을 다시 시작하세요.\n");
		}else {
			if(TMGCSYS.tmgcLimitSleep>=1 && TMGCSYS.tmgcStress<=50) {
				System.out.println("[System] 이미 충분히 잤습니다. 펫이 활동하도록 도와주세요.\n");
			}else {
				if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
					TMGCSYS.tmgcEXP += (3+TMGCSYS.tmgcLV);
					TMGCSYS.tmgcHP += (15-TMGCSYS.tmgcFeel);
					TMGCSYS.tmgcStress = (20+TMGCSYS.tmgcFeel);
				}
				
				if(TMGCSYS.tmgcCheckRegularHealth>=3) {
					//규칙적인 생활을 할 경우 건강 지수 올림
					TMGC.setability(0, 0, 0, 1);
					TMGCSYS.tmgcCheckRegularHealth=0;
				}
				
				TMGCSYS.tmgcCheckRegularHealth+=1;
				
				TMGCSYS.tmgcLimitEat=0;
				TMGCSYS.tmgcLimitSleep=1;
				TMGCSYS.tmgcLimitWalk=0;
				TMGCSYS.tmgcLimitStudy=0;
				
				TMGC.setlevel();
				TMGCSYS.tmgcFeel=TMGC.setrnd(10);
				
				TMGC.playMotion("sleep","쉿! 펫이 자고 있습니다... 깨우지 말아주세요...");
				TMGC.playMotion("sleep_reverse","쉿! 펫이 자고 있습니다... 깨우지 말아주세요...");
				TMGC.playMotion("sleep","쉿! 펫이 자고 있습니다... 깨우지 말아주세요...");
				TMGC.playMotion("sleep_reverse","쉿! 펫이 자고 있습니다... 깨우지 말아주세요...");
				switch(TMGCSYS.tmgcFeel) {
					case 1 :
					case 2:
					case 3:
						System.out.println("주인님~ 안녕히 주무셨어요? ^0^");
						break;
					case 4 :
					case 5:
					case 6:
						System.out.println("주인님... 자고 일어났는데도 뭔가 찝찝한 하루네요... 안녕히 주무셨어요...");
						break;
					case 7 :
					case 8:
					case 9:
						System.out.println("무서운 악몽을 꾸는 바람에 잘 못잤어요... ㅜ_ㅜ...");
						break;
					case 10:
						System.out.println("오늘은 기분이 정말 안좋아요... 좀 쉬었으면 좋겠어요...");
						break;
					default:
						System.out.println("주인님, 안녕히 주무셨나요?");
						break;
				}
				System.out.println("(레벨 : "+tmpLV+"->"+TMGCSYS.tmgcLV+", 경험치 : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", 체력 : "+tmpHP+"->"+TMGCSYS.tmgcHP+", 스트레스 : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
			}
		}
	}
	public void walk() {
		int tmpLV, tmpEXP, tmpHP, tmpStress;
		tmpLV=TMGCSYS.tmgcLV;
		tmpEXP=TMGCSYS.tmgcEXP;
		tmpHP=TMGCSYS.tmgcHP;
		tmpStress=TMGCSYS.tmgcStress;
		
		if(TMGCSYS.tmgcDeath==1) {
			System.out.println("펫이 세상을 떠났습니다.\n게임을 다시 시작하세요.\n");
		}else {
			if(TMGCSYS.tmgcStress>=50) System.out.println("[System] 펫이 스트레스를 너무 많이 받았습니다. 잠자기로 피로도를 풀어주세요.\n");
			if(TMGCSYS.tmgcLimitWalk>=2) {
				System.out.println("[System] 너무 많이 걸었습니다. 잠자기로 펫이 피로하지 않도록 해주세요.\n");
			}else {
				if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
					TMGCSYS.tmgcEXP += (20+TMGCSYS.tmgcLV);
					TMGCSYS.tmgcHP -= (20+TMGCSYS.tmgcFeel);
					TMGCSYS.tmgcStress += (7+TMGCSYS.tmgcFeel);
				}
				
				TMGCSYS.tmgcLimitWalk+=1;
				TMGCSYS.tmgcLimitSleep=0;
				
				if(TMGCSYS.tmgcLimitWalk>=2)	TMGCSYS.tmgcCheckRegularHealth+=1;
				
				TMGC.setlevel();
				TMGC.setability(1, 1, 0, 0);
				
				TMGC.playMotion("play","펫이 당신과 야외에서 즐겁게 산책중입니다... 산책이 끝날때까지 기다려주세요~");
				TMGC.playMotion("play_up","펫이 당신과 야외에서 즐겁게 산책중입니다... 산책이 끝날때까지 기다려주세요~");
				TMGC.playMotion("play","펫이 당신과 야외에서 즐겁게 산책중입니다... 산책이 끝날때까지 기다려주세요~");
				TMGC.playMotion("play_up","펫이 당신과 야외에서 즐겁게 산책중입니다... 산책이 끝날때까지 기다려주세요~");
				System.out.println("주인님~ 가끔식 운동도 괜찮은 것 같아요 ㅎㅎ\n(레벨 : "+tmpLV+"->"+TMGCSYS.tmgcLV+", 경험치 : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", 체력 : "+tmpHP+"->"+TMGCSYS.tmgcHP+", 스트레스 : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
			}
		}
	}
	public void study() {
		int tmpLV, tmpEXP, tmpHP, tmpStress;
		tmpLV=TMGCSYS.tmgcLV;
		tmpEXP=TMGCSYS.tmgcEXP;
		tmpHP=TMGCSYS.tmgcHP;
		tmpStress=TMGCSYS.tmgcStress;
		
		if(TMGCSYS.tmgcDeath==1) {
			System.out.println("펫이 세상을 떠났습니다.\n게임을 다시 시작하세요.\n");
		}else {
			if(TMGCSYS.tmgcStress>=50) System.out.println("[System] 펫이 스트레스를 너무 많이 받았습니다. 잠자기로 피로도를 풀어주세요.\n");
			if(TMGCSYS.tmgcLimitStudy>=1) {
				System.out.println("[System] 이미 공부를 했습니다. 다른 활동을 하도록 해주세요.\n");
			}else {
				TMGCQNA.question();
			}
		}
	}
	public void setdata(String tmpName) {
		TMGCSYS.tmgcName = tmpName;
	}
	public void print() {
		//String tmpStr = String.format("%.2f", stdCredit);
		//stdCredit = Double.parseDouble(tmpStr);
		System.out.println("[System] 펫 정보입니다.\n         이름 : "+TMGCSYS.tmgcName+", 레벨 : "+TMGCSYS.tmgcLV+", 경험치 : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", 체력 : "+TMGCSYS.tmgcHP+", 스트레스 : "+TMGCSYS.tmgcStress);
	}
	public void print_dev() {
		//String tmpStr = String.format("%.2f", stdCredit);
		//stdCredit = Double.parseDouble(tmpStr);
		System.out.println(
									"[System] 펫 정보입니다.\n         이름 : "+TMGCSYS.tmgcName
								+	", 레벨 : "+TMGCSYS.tmgcLV+", 경험치 : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)
								+	", 체력 : "+TMGCSYS.tmgcHP+", 스트레스 : "+TMGCSYS.tmgcStress+"\n\n\n"
								+	"         Function Limit Count\n"
								+	"         Eat : "+TMGCSYS.tmgcLimitEat+", Sleep : "+TMGCSYS.tmgcLimitSleep
								+	", Walk : "+TMGCSYS.tmgcLimitWalk+", Study : "+TMGCSYS.tmgcLimitStudy+"\n\n\n"
								+	"         Character Ability\n"
								+	"         STR : "+TMGCSYS.tmgcSTR+", INT : "+TMGCSYS.tmgcINT
								+	", DEB : "+TMGCSYS.tmgcDEB+", HET : "+TMGCSYS.tmgcHET+"\n\n\n"
								+	"         Character Job : "+TMGCSYS.tmgc2ndJob
								);
	}
	public static void setlevel() {
		if(TMGCSYS.tmgcEXP>=(100*TMGCSYS.tmgcLV)) {
			TMGCSYS.tmgcLV+=1;
			TMGCSYS.tmgcEXP=0;
		}
		if(TMGCSYS.tmgcHP<=0) TMGCSYS.tmgcDeath=1;
		if(TMGCSYS.tmgcHP>=100) TMGCSYS.tmgcHP=100;
		if(TMGCSYS.tmgcStress>=100) TMGCSYS.tmgcDeath=1;
		if(TMGCSYS.tmgcStress<=0) TMGCSYS.tmgcStress=0;
	}
    public static void setability(int tmpSTR, int tmpINT, int tmpDEB, int tmpHET){
    	//힘, 지적능력, 방탕함, 건강지수
    	//STR, INT, Debauchery, Heart
    	TMGCSYS.tmgcSTR+=tmpSTR;
    	TMGCSYS.tmgcINT+=tmpINT;
    	TMGCSYS.tmgcDEB+=tmpDEB;
    	TMGCSYS.tmgcHET+=tmpHET;
    	if(TMGCSYS.tmgcSTR<=0) TMGCSYS.tmgcSTR=0;
    	if(TMGCSYS.tmgcSTR>=100) TMGCSYS.tmgcSTR=100;
    	if(TMGCSYS.tmgcINT<=0) TMGCSYS.tmgcINT=0;
    	if(TMGCSYS.tmgcINT>=100) TMGCSYS.tmgcINT=100;
    	if(TMGCSYS.tmgcDEB<=0) TMGCSYS.tmgcDEB=0;
    	if(TMGCSYS.tmgcDEB>=100) TMGCSYS.tmgcDEB=100;
    	if(TMGCSYS.tmgcHET<=0) TMGCSYS.tmgcHET=0;
    	if(TMGCSYS.tmgcHET>=100) TMGCSYS.tmgcHET=100;
    }
    public static void setsleep(int tmpTime){
		try{
			Thread.sleep(tmpTime * 100);
							//입력한 시간 * 0.1초
		} catch (InterruptedException e) { }
    }
    public static void playMotion(String motionType, String motionText){
    	switch(motionType){
    		case "normal":
		    	System.out.println(
		    				"□□□■■□■□□□□□□□□\n"
		    			+	"□□■□□■□■□□□□□□□\n"
		    			+	"□□■□■■■■□□□□□□□\n"
		    			+	"□□□■■□□□■□□□□□□\n"
		    			+	"□□■□□□□■□■□□□□□\n"
		    			+	"□□■□□□□■□□■□□■□\n"
		    			+	"□■□□□□□□□□■□■□□\n"
		    			+	"□■□□■□□□□■□□■□□\n"
		    			+	"□■□□□■■■■□□■□□□\n"
		    			+	"□■□□□□□□■□□■□□□\n"
		    			+	"□□■□■□■□■□□■□□□\n"
		    			+	"□□■□■□■■□■■□□□□\n"
		    			+	"□□□■■■■□□□□□□□□\n\n"
		    			+	motionText	+	"\n\n");
		    	break;
    		case "normal_reverse":
		    	System.out.println(
		    				"□□□□□□□□■□■■□□□\n"
		    			+	"□□□□□□□■□■□□■□□\n"
		    			+	"□□□□□□□■■■■□■□□\n"
		    			+	"□□□□□□■□□□■■□□□\n"
		    			+	"□□□□□■□■□□□□■□□\n"
		    			+	"□■□□■□□■□□□□■□□\n"
		    			+	"□□■□■□□□□□□□□■□\n"
		    			+	"□□■□□■□□□□■□□■□\n"
		    			+	"□□□■□□■■■■□□□■□\n"
		    			+	"□□□■□□■□□□□□□■□\n"
		    			+	"□□□■□□■□■□■□■□□\n"
		    			+	"□□□□■■□■■□■□■□□\n"
		    			+	"□□□□□□□□■■■■□□□\n\n"
		    			+	motionText	+	"\n\n");
		    	break;
    		case "eat":
		    	System.out.println(
		    			"□□□□□□□□□□□□□□□□\n"
	    			+	"□□□□□□□□□□□□□□□□\n"
	    			+	"□□□□□□□□□□□□□□□□\n"
	    			+	"□□□□□□□□□□□□□□□□\n"
	    			+	"□□□■■□□□□□□■■□□□\n"
	    			+	"□□■□□■■■■■■□□■□□\n"
	    			+	"□□■□□□□□□□□□□■□□\n"
	    			+	"□□■□□■■■■■■□□■□□\n"
	    			+	"□□□■■□□□□□□■■□□□\n"
	    			+	"□□□□□□□□□□□□□□□□\n"
	    			+	"□□□□□□□□□□□□□□□□\n"
	    			+	"□□□□□□□□□□□□□□□□\n"
	    			+	"□□□□□□□□□□□□□□□□\n\n"
	    			+	motionText	+	"\n\n");
		    	break;
    		case "eat_down":
		    	System.out.println(
		    			"□□□□□□□□□□□□□□□□\n"
	    			+	"□□□□■■□□□■■□□□□□\n"
	    			+	"□□□■□□■□■□□■□□□□\n"
	    			+	"□□□■□■■■■■□■□□□□\n"
	    			+	"□□□□■□□□□□■□□□□□\n"
	    			+	"□□□■□■□□□■□■□□□□\n"
	    			+	"□□□■■□■□■□■■□□□□\n"
	    			+	"□□□■□□□□□□□■□■□□\n"
	    			+	"□□□□■□■■■□■□■□□□\n"
	    			+	"□□□□□■■■■■□■■□□□\n"
	    			+	"□□□□■□■□■□■□□□□□\n"
	    			+	"□□□□■□■□■□■□□□□□\n"
	    			+	"□□□□□■□□□■□□□□□□\n\n"
	    			+	motionText	+	"\n\n");
		    	break;
    		case "play":
		    	System.out.println(
		    			"□□□□□□□□□□□□□□□□\n"
	    			+	"□□□□□■■□□□■■□□□□\n"
	    			+	"□□□□■□□■□■□□■□□□\n"
	    			+	"□□□□■□■■■■■□■□□□\n"
	    			+	"□□□□□■□□□□□■□□□□\n"
	    			+	"□□□□■□■□□□■□■□□□\n"
	    			+	"□□□□■□■□□□■□■□□□\n"
	    			+	"□□□□■□□□□□□□■□■□\n"
	    			+	"□□□□□■□□□□□■□■□□\n"
	    			+	"□□□□□□■■■■■□■■□□\n"
	    			+	"□□□□□■□■■■□■□□□□\n"
	    			+	"□□□□□■□■□■□■□□□□\n"
	    			+	"□□□□□□■□□□■□□□□□\n\n"
	    			+	motionText	+	"\n\n");
		    	break;
    		case "play_up":
		    	System.out.println(
		    				"□■□□□■■□□□■■□□□□\n"
		    			+	"□■■□■□□■□■□□■□□□\n"
		    			+	"□■□□■□■■■■■□■□□□\n"
		    			+	"■■□□□■□□□□□■□□□□\n"
		    			+	"■■□□■□■□□□■□■□□□\n"
		    			+	"□□□□■■□■□■□■■□□□\n"
		    			+	"□□□□■□□□□□□□■□■□\n"
		    			+	"□■□□□■□□□□□■□■□□\n"
		    			+	"□■■□□□■■■■■□■■□□\n"
		    			+	"□■□□□■□■□■□■□□□□\n"
		    			+	"■■□□■□■□□□■□■□□□\n"
		    			+	"■■□□■■□□□□□■■□□□\n"
		    			+	"□□□□□□□□□□□□□□□□\n\n"
		    			+	motionText	+	"\n\n");
		    	break;
    		case "sleep":
		    	System.out.println(
		    				"□□□□□□□□■□■■□□□\n"
		    			+	"□□□□□□□■□■□□■□□\n"
		    			+	"□□□□□□□■■■■□■□□\n"
		    			+	"□□□□□□■□□□■■□□□\n"
		    			+	"□□□□□■□□□□□□■□□\n"
		    			+	"□■□□■□□■■□□□■□□\n"
		    			+	"□□■□■□□□□□□□□■□\n"
		    			+	"□□■□□■□□□□■□□■□\n"
		    			+	"□□□■□□■■■■□□□■□\n"
		    			+	"□□□■□□■□□□□□□■□\n"
		    			+	"□□□■□□■□■□■□■□□\n"
		    			+	"□□□□■■□■■□■□■□□\n"
		    			+	"□□□□□□□□■■■■□□□\n\n"
		    			+	motionText	+	"\n\n");
		    	break;
    		case "sleep_reverse":
		    	System.out.println(
		    				"□□□□□□□□□□□□□□□\n"
		    			+	"□■■■□□□□■□■■□□□\n"
		    			+	"□□■□□□□■□■□□■□□\n"
		    			+	"□■■■□□□■■■■□■□□\n"
		    			+	"□□□□□□■□□□■■□□□\n"
		    			+	"□□□□□■□□□□□□■□□\n"
		    			+	"□□□□■□□■■□□□■□□\n"
		    			+	"□■□□■□□□□□□□□■□\n"
		    			+	"□□■□□■□□□□■□□■□\n"
		    			+	"□□■■□□■■■■□□□■□\n"
		    			+	"□□□■□□■□□□□□□■□\n"
		    			+	"□□□■□□■□□□□□■□□\n"
		    			+	"□□□□■■□■■■■■□□□\n\n"
		    			+	motionText	+	"\n\n");
		    	break;
    		case "study":
		    	System.out.println(
		    			"□□□□□□□□□□□□□□□□\n"
	    			+	"□□□□□■■□□□■■□□□□\n"
	    			+	"□□□□■□□■□■□□■□□□\n"
	    			+	"□□□□■□■■■■■□■□□□\n"
	    			+	"□□□□□■□□□□□■□□□□\n"
	    			+	"□□□□■□■□□□■□■□□□\n"
	    			+	"□□□□■□■□□□■□■□□□\n"
	    			+	"□□□□■□□□□□□□■□■□\n"
	    			+	"□□□□□■□□□□□■□■□□\n"
	    			+	"□□□□□□■■■■■□■■□□\n"
	    			+	"□□□□□■□■□■□■□□□□\n"
	    			+	"□□□□□■□■□■□■□□□□\n"
	    			+	"□□□□□□■□□□■□□□□□\n\n"
	    			+	motionText	+	"\n\n");
		    	break;
    		case "study_down":
		    	System.out.println(
		    			"□□■□□□□□□□□□□□□□\n"
		    	    +	"□■■■□□□□□□□□□□□□\n"
	    			+	"□□■□□■■□□□■■□□□□\n"
	    			+	"□□■□■□□■□■□□■□□□\n"
	    			+	"□□□□□■□■■■□■□□□□\n"
	    			+	"□□□□■□□□□□□□■□□□\n"
	    			+	"□□□□■□■□□□■□■□□□\n"
	    			+	"□□□□■□■□□□■□■□■□\n"
	    			+	"□□□□□■□□□□□■□■□□\n"
	    			+	"□□□□□□■■■■■□■■□□\n"
	    			+	"□□□□□■□■□■□■□□□□\n"
	    			+	"□□□□□■□■□■□■□□□□\n"
	    			+	"□□□□□□■□□□■□□□□□\n\n"
	    			+	motionText	+	"\n\n");
		    	break;
    	}
    	int tmpClear;
		for(tmpClear=0;tmpClear<7;tmpClear++) {
			System.out.println("");
		}
		TMGC.setsleep(5);
    }
    public static int setrnd(int tmpNum){
    	int tmpRndNum=(int) (Math.random() * tmpNum) + 1;
    	return tmpRndNum;
    }
	public static void nocmd() {
		System.out.println(
				"[System] 해당 명령어는 존재하지 않습니다.\n"
			+	"         다시 한번 확인해주세요.");
	}
	public static String loadVersion(){
		return TMGCSYS.tmgcVersion;
	}
	public static String loadName(){
		return TMGCSYS.tmgcName;
	}
	public static int loadLV(){
		return TMGCSYS.tmgcLV;
	}
	public static int loadEXP(){
		return TMGCSYS.tmgcEXP;
	}
	public static int loadHP(){
		return TMGCSYS.tmgcHP;
	}
	public static int loadStress(){
		return TMGCSYS.tmgcStress;
	}
	public static int loadDeath(){
		return TMGCSYS.tmgcDeath;
	}
}

