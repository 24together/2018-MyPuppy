/*
 *	Project My Puppy Story
 *	Game Fnc. Class
 *	
 *	Team N1 _ Oh EunSeok, Kim MinYeong, Yoon GeonHwi
 *	Since 17.09.12
 *	
 *	Version 0.1.8 Beta
 *	Last update : 17.10.09
 */
package TMGC;
import java.util.*;

public class TMGCGAME {
	public static void minigame() {
		/* feel에 따라 미니게임이 나오냐 그냥 게임으로 지나가냐 설정->메인에서 필에 따라 다른 클래스를 부르게  */
		int tmpLV, tmpEXP, tmpHP, tmpStress;
		tmpLV=TMGCSYS.tmgcLV;
		tmpEXP=TMGCSYS.tmgcEXP;
		tmpHP=TMGCSYS.tmgcHP;
		tmpStress=TMGCSYS.tmgcStress;
		
		if(TMGCSYS.tmgcDeath==1) {
			System.out.println("펫이 세상을 떠났습니다.\n게임을 다시 시작하세요.\n");
		}else if(TMGCSYS.tmgcStress>=50) { System.out.println("[System] 펫이 스트레스를 너무 많이 받았습니다. 잠자기로 피로도를 풀어주세요.\n");		
			}
		else {				
				if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
					TMGCSYS.tmgcEXP += (10+TMGCSYS.tmgcLV);
					TMGCSYS.tmgcHP -= (10+TMGCSYS.tmgcFeel);
					TMGCSYS.tmgcStress += (15+TMGCSYS.tmgcFeel);
				}	
		//가위바위보 게임,,,? 아니면 산수게임
		Scanner ScanGame=new Scanner(System.in);
		String GameCho="", RSPCho = "", CALCho="", RSPpet="";
		String tmNAME=TMGCSYS.tmgcName;
		
		System.out.print(tmNAME+"(이)와 무슨 게임을 할까요? (가위바위보, 숫자맞추기게임)\n입력 : ");
		GameCho=ScanGame.next();
		
		int RANpet=TMGC.setrnd(3);
		int RANans=0, RSPuser=0, answer=0;
		
		switch(GameCho) {
		case "가위바위보":
				System.out.println("주인님!! 제가 이길거예요!!");
					for(int tmpClear=0;tmpClear<4;tmpClear++) {
							System.out.println("");
					}

				System.out.print("무엇을 내시겠습니까? (가위, 바위, 보) : ");
				RSPCho=ScanGame.next();
				switch(RSPCho) {
					case "가위":
						RSPuser=0;
						break;
					case "바위":
						RSPuser=1;
						break;
					case "보":
						RSPuser=2;
						break;
					default:
						System.out.println("[System] 해당 명령어는 존재하지 않습니다.");
						break;
				}
				TMGC.playMotion("normal","결과는...?");
				TMGC.playMotion("normal_reverse","결과는...?");
				TMGC.playMotion("normal","결과는...?");
				TMGC.playMotion("normal_reverse","결과는...?");
				
				//가위바위보 비교
				//user-pet=-1,1:user이김  -2,2:user짐, 0:비김
				switch(RANpet) {
					case 0:
						RSPpet="가위";
						break;
					case 1:
						RSPpet="바위";
						break; 
					case 2:
						RSPpet ="보";
						break;
				}
				System.out.println(
										"당신이 낸 것 : " + RSPCho + "\n"
									+	tmNAME+"(이)가 낸 것 : " + RSPpet);
				
				if((RSPuser-RANpet)==1||(RSPuser-RANpet)==-1) {
					System.out.println(tmNAME+"(이)가 졌습니다.\n\n");
				}
				else if((RSPuser-RANpet)==-2||(RSPuser-RANpet)==2) {
					System.out.println(tmNAME+"(이)가 이겼습니다.\n\n");
				}
				else if((RSPuser-RANpet)==0) {
					System.out.println("비겼습니다.\n\n");
				}
				
				//Result
				System.out.print("[System] 게임이 종료되었습니다.\n"
						+"         "+TMGCSYS.tmgcName+"와 자주 놀아주세요~\n\n");
				
				if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
					TMGCSYS.tmgcEXP += (10+TMGCSYS.tmgcLV);
					if(TMGCSYS.tmgcHP<=90) TMGCSYS.tmgcHP -= (10+TMGCSYS.tmgcFeel);
					TMGCSYS.tmgcStress += (5+TMGCSYS.tmgcFeel);
				}
				
				TMGCSYS.tmgcCountPlay += 1;
				TMGC.setlevel();
				TMGC.setability(0, 0, 1, 0);
				
				System.out.println("         (레벨 : "+tmpLV+"->"+TMGCSYS.tmgcLV+", 경험치 : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", 체력 : "+tmpHP+"->"+TMGCSYS.tmgcHP+", 스트레스 : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
				break;
			//가위바위보 게임문 닫기
			
		    case "숫자맞추기게임" :
		    		System.out.println(tmNAME+"(이)가 생각한 숫자를 맞춰봅시다!");
		    		TMGC.playMotion("normal","숫자를 생각하고 있습니다... 잠시만 기다려주세요~");
					TMGC.playMotion("normal_reverse","숫자를 생각하고 있습니다... 잠시만 기다려주세요~");
					TMGC.playMotion("normal","숫자를 생각하고 있습니다... 잠시만 기다려주세요~");
					TMGC.playMotion("normal_reverse","숫자를 생각하고 있습니다... 잠시만 기다려주세요~");
					System.out.println(tmNAME+" : 주인님 숫자를 생각했어요!. 맞춰보세요. ");
					int USERans=0, PETthinkCount=0;
					
					if(TMGCSYS.tmgcLV>=10) {
						RANans=TMGC.setrnd(160);
						PETthinkCount=5;
					}else {
						RANans=TMGC.setrnd(80);
						PETthinkCount=0;
					}
					
					/*레벨에 따라 한도를 다르게 10레벨까지는 10번 */
					while(true) {
						if(PETthinkCount==10) {
							System.out.print("[System] 틀렸습니다... 하지만 즐거운 시간이었다고 생각해요!\n"
									+"         "+TMGCSYS.tmgcName+"가 조금 더 똑똑해 졌습니다!\n\n");
							
							if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
								TMGCSYS.tmgcEXP += (10+TMGCSYS.tmgcLV);
								if(TMGCSYS.tmgcHP<=90) TMGCSYS.tmgcHP -= (10+TMGCSYS.tmgcFeel);
								TMGCSYS.tmgcStress += (5+TMGCSYS.tmgcFeel);
							}
							
							TMGCSYS.tmgcCountPlay += 1;
							TMGC.setlevel();
							TMGC.setability(0, 1, 1, 0);
							
							System.out.println("         (레벨 : "+tmpLV+"->"+TMGCSYS.tmgcLV+", 경험치 : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", 체력 : "+tmpHP+"->"+TMGCSYS.tmgcHP+", 스트레스 : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
							break;
						}
						if(TMGCSYS.tmgcLV>=10) {
							System.out.print("\n\n0부터 160까지의 숫자 중 "+tmNAME+"(이)가 생각한 숫자를 입력하세요!\n입력 : ");
							USERans=ScanGame.nextInt();
						}else {
							System.out.print("\n\n0부터 80까지의 숫자 중 "+tmNAME+"(이)가 생각한 숫자를 입력하세요!\n입력 : ");
							USERans=ScanGame.nextInt();
						}
						
						if(USERans>RANans) {
							System.out.println(tmNAME+"제가 생각한 숫자는 "+USERans+" 보다 적은 숫자예요!\n\n");
							PETthinkCount+=1;
							System.out.println("남은 횟수 : "+(10-PETthinkCount)+"번");
							continue;
						}
						else if(USERans<RANans) {
							System.out.println(tmNAME+"제가 생각한 숫자는 "+USERans+" 보다 큰 숫자예요!\n\n");
							PETthinkCount+=1;
							System.out.println("남은 횟수 : "+(10-PETthinkCount)+"번");
							continue;
						}
						else if(USERans==RANans) {
							System.out.print("[System] 정답입니다!\n"
									+"         "+TMGCSYS.tmgcName+"가 조금 더 똑똑해 졌습니다!\n\n");
							
							if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
								TMGCSYS.tmgcEXP += (10+TMGCSYS.tmgcLV);
								if(TMGCSYS.tmgcHP<=90) TMGCSYS.tmgcHP -= (10+TMGCSYS.tmgcFeel);
								TMGCSYS.tmgcStress += (5+TMGCSYS.tmgcFeel);
							}
							
							TMGCSYS.tmgcCountPlay += 1;
							TMGC.setlevel();
							TMGC.setability(0, 1, 1, 0);
							
							System.out.println("         (레벨 : "+tmpLV+"->"+TMGCSYS.tmgcLV+", 경험치 : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", 체력 : "+tmpHP+"->"+TMGCSYS.tmgcHP+", 스트레스 : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
							break;
						}
					}
			}
		}}}