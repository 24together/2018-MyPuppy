/*
 *	Project My Puppy Story
 *	Main Class
 *	
 *	Team N1 _ Oh EunSeok, Kim MinYeong, Yoon GeonHwi
 *	Since 17.09.12
 *	
 *	Version 0.1.8 Beta
 *	Last update : 17.10.09
 */
package TMGC;
import java.util.*;

public class TMGCMAIN{
	public static void main(String[] args) {
		Scanner scanMain = new Scanner(System.in);
		TMGC tmgc01 = new TMGC();
		String tmpText = "";
		int tmpExitSign=0, tmpExitSlot=0;
		
		System.out.print("[My Puppy Story _ "+tmgc01.loadVersion()+"] Team N1\n\n"
				+ "[System] 어서오세요 주인님! 기다리고 있었어요!\n         저의 이름을 알려주세요!\n\n         입력 : ");	
		tmpText = scanMain.next();
		System.out.print("\n[System] 펫 데이터 생성중... 잠시만 기다려주세요...\n\n");
		tmgc01.setdata(tmpText);
		
		do{
			if(tmpExitSign==1) break;
			if(tmgc01.loadDeath()==1){
				System.out.print("[System] "+tmgc01.loadName()+"이(가) 세상을 떠났습니다. 게임을 다시 시작해주세요.\n"
						+ "[System] 종료를 입력 : ");	
			}else{
				System.out.print("[System] "+tmgc01.loadName()+"에게 어떤 명령을 내릴까요?\n"
						+ "         (밥먹기, 잠자기, 놀기, ");
				switch(TMGCSYS.tmgc2ndJob) {
				case "S": //투기견
					System.out.print("전투훈련, ");
					break;
				case "SH": //군견
					System.out.print("전투훈련, 보초훈련, ");
					break;
				case "I": //탐지견
					System.out.print("후각훈련");
					break;
				case "IH": //안내견
					System.out.print("후각훈련, 표시구별훈련, ");
					break;
				case "D": //양치기견
					System.out.print("신호훈련, ");
					break;
				case "DH": //스타견
					System.out.print("신호훈련, 개인기훈련, ");
					break;
				}
				System.out.print("산책하기, 공부하기, 이름변경, 정보보기, 종료)\n[System] 입력 : ");
			}
			tmpText = scanMain.next();
			
			int tmpNum=0;
			String tmpName="";
			double tmpCredit;
			
			int tmpClear;
			for(tmpClear=0;tmpClear<20;tmpClear++) {
				System.out.println("");
			}
			switch(tmgc01.loadLV()){
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
				case 6:
				case 7:
				case 8:
				case 9:
					switch(tmpText) {
						case "밥먹기":
							tmgc01.eat();
							break;
						case "잠자기":
							tmgc01.sleep();
							break;
						case "놀기":
							tmgc01.play();
							break;
						case "산책하기":
							tmgc01.walk();
							break;
						case "공부하기":
							tmgc01.study();
							break;
						case "이름변경":
							System.out.print("[System] 펫의 이름을 입력하세요 : ");
							tmpName = scanMain.next();
							tmgc01.setdata(tmpName);
							break;
						case "정보보기":
							tmgc01.print();
							break;
						case "종료":
							if(tmgc01.loadDeath()==1){
								System.out.println("다음번에는 꼭 오랫동안 보았으면 좋겠어요...\n주인님 안녕...");
								tmpExitSign=1;	
							}else{
								System.out.println("주인님! 잘 돌봐주셔서 고마워요! 다음에 봐요!");
								tmpExitSign=1;							
							}
							break;
						case "devmode_jobset":
							TMGCSYS.tmgcLV = 9;
							TMGCSYS.tmgcEXP = 990;
							TMGCSYS.tmgcSTR = 50;
							TMGCSYS.tmgcINT= 30;
							TMGCSYS.tmgcDEB = 15;
							TMGCSYS.tmgcHET = 100;
							TMGCJOB.set2ndJobRecmd();
							break;
						case "devmode_info":
							tmgc01.print_dev();
							break;
						default :
							TMGC.nocmd();
							break;
					}
					break;
				case 10:
				case 11:
				case 12:
				case 13:
				case 14: //1차 전직 : 직업군 후보
					if(tmgc01.loadLV()>=10 && TMGCSYS.tmgc2ndJob=="") {
					//직업군이 지정 되지 않았을 경우
						TMGCJOB.set2ndJobRecmd();
						switch(TMGCSYS.tmgc2ndJob) {
						case "S": 
							TMGCSTORY.playStory("S_2nd_1", 50);
							break;
						case "SH":
							TMGCSTORY.playStory("SH_2nd_1", 50);
							break;
						case "I":
							TMGCSTORY.playStory("I_2nd_1", 50);
							break;
						case "IH":
							TMGCSTORY.playStory("IH_2nd_1", 50);
							break;
						case "D":
							TMGCSTORY.playStory("D_2nd_1", 50);
							break;
						case "DH":
							TMGCSTORY.playStory("DH_2nd_1", 50);
							break;
						}
					}else{
					//이미 직업이 지정 되었을 경우
						switch(tmpText) {
						case "밥먹기":
							tmgc01.eat();
							break;
						case "잠자기":
							tmgc01.sleep();
							break;
						case "놀기":
							tmgc01.play();
							break;
						case "산책하기":
							tmgc01.walk();
							break;
						case "공부하기":
							tmgc01.study();
							break;
						case "이름변경":
							System.out.print("[System] 펫의 이름을 입력하세요 : ");
							tmpName = scanMain.next();
							tmgc01.setdata(tmpName);
							break;
						case "정보보기":
							tmgc01.print();
							break;
						case "종료":
							if(tmgc01.loadDeath()==1){
								System.out.println("다음번에는 꼭 오랫동안 보았으면 좋겠어요...\n주인님 안녕...");
								tmpExitSign=1;	
							}else{
								System.out.println("주인님! 잘 돌봐주셔서 고마워요! 다음에 봐요!");
								tmpExitSign=1;							
							}
							break;
						case "devmode_jobset":
							TMGCSYS.tmgcLV = 9;
							TMGCSYS.tmgcEXP = 990;
							TMGCSYS.tmgcSTR = 50;
							TMGCSYS.tmgcINT= 30;
							TMGCSYS.tmgcDEB = 15;
							TMGCSYS.tmgcHET = 100;
							TMGCJOB.set2ndJobRecmd();
							break;
						case "devmode_info":
							tmgc01.print_dev();
							break;
						default :
							switch(TMGCSYS.tmgc2ndJob) {
							case "S": //투기견
								switch(tmpText) {
								case "전투훈련":
									TMGCJOB.strBattle();
									break;
								default :
									TMGC.nocmd();
									break;
								}
								break;
							case "SH": //군견
								switch(tmpText) {
								case "전투훈련":
									TMGCJOB.strBattle();
									break;
								case "보초훈련":
									TMGCJOB.strGuard();
									break;
								default :
									TMGC.nocmd();
									break;
								}
								break;
							case "I": //탐지견
								switch(tmpText) {
								case "후각훈련":
									TMGCJOB.intOlfaction();
									break;
								default :
									TMGC.nocmd();
									break;
								}
								break;
							case "IH": //안내견
								switch(tmpText) {
								case "후각훈련":
									TMGCJOB.intOlfaction();
									break;
								case "표시구별훈련":
									TMGCJOB.intDisplay();
									break;
								default :
									TMGC.nocmd();
									break;
								}
								break;
							case "D": //양치기견
								switch(tmpText) {
								case "신호훈련":
									TMGCJOB.debSign();
									break;
								default :
									TMGC.nocmd();
									break;
								}
								break;
							case "DH": //스타견
								switch(tmpText) {
								case "신호훈련":
									TMGCJOB.debSign();
									break;
								case "개인기훈련":
									TMGCJOB.debSkill();
									break;
								default :
									TMGC.nocmd();
									break;
								}
								break;
							}
							break;
						}						
					}
					break;
				case 15: //2차 전직 : PRO/AMATEUR
				case 16:
				case 17:
				case 18:
				case 19:
					if(TMGCSYS.tmgcLV>=15 && TMGCSYS.tmgc3ndProAma=="") {
					//프로 또는 아마추어 지정
						TMGCJOB.set3rdproama();
					}else {
					//전문성 결정 되었을 경우
						
					}
					break;
				case 20: //3차 최종 평가 : PRO or Not
					break;
			}
			if(tmpText!="devmode_info" || tmpText!="devmode_jobset") {
				for(tmpClear=0;tmpClear<20;tmpClear++) {
					System.out.println("");
				}
			}
			TMGC.setlevel();
		}while(tmpExitSign==0);
	}
}
