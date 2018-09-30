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
				+ "[System] ������� ���δ�! ��ٸ��� �־����!\n         ���� �̸��� �˷��ּ���!\n\n         �Է� : ");	
		tmpText = scanMain.next();
		System.out.print("\n[System] �� ������ ������... ��ø� ��ٷ��ּ���...\n\n");
		tmgc01.setdata(tmpText);
		
		do{
			if(tmpExitSign==1) break;
			if(tmgc01.loadDeath()==1){
				System.out.print("[System] "+tmgc01.loadName()+"��(��) ������ �������ϴ�. ������ �ٽ� �������ּ���.\n"
						+ "[System] ���Ḧ �Է� : ");	
			}else{
				System.out.print("[System] "+tmgc01.loadName()+"���� � ����� �������?\n"
						+ "         (��Ա�, ���ڱ�, ���, ");
				switch(TMGCSYS.tmgc2ndJob) {
				case "S": //�����
					System.out.print("�����Ʒ�, ");
					break;
				case "SH": //����
					System.out.print("�����Ʒ�, �����Ʒ�, ");
					break;
				case "I": //Ž����
					System.out.print("�İ��Ʒ�");
					break;
				case "IH": //�ȳ���
					System.out.print("�İ��Ʒ�, ǥ�ñ����Ʒ�, ");
					break;
				case "D": //��ġ���
					System.out.print("��ȣ�Ʒ�, ");
					break;
				case "DH": //��Ÿ��
					System.out.print("��ȣ�Ʒ�, ���α��Ʒ�, ");
					break;
				}
				System.out.print("��å�ϱ�, �����ϱ�, �̸�����, ��������, ����)\n[System] �Է� : ");
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
						case "��Ա�":
							tmgc01.eat();
							break;
						case "���ڱ�":
							tmgc01.sleep();
							break;
						case "���":
							tmgc01.play();
							break;
						case "��å�ϱ�":
							tmgc01.walk();
							break;
						case "�����ϱ�":
							tmgc01.study();
							break;
						case "�̸�����":
							System.out.print("[System] ���� �̸��� �Է��ϼ��� : ");
							tmpName = scanMain.next();
							tmgc01.setdata(tmpName);
							break;
						case "��������":
							tmgc01.print();
							break;
						case "����":
							if(tmgc01.loadDeath()==1){
								System.out.println("���������� �� �������� �������� ���ھ��...\n���δ� �ȳ�...");
								tmpExitSign=1;	
							}else{
								System.out.println("���δ�! �� �����ּż� ������! ������ ����!");
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
				case 14: //1�� ���� : ������ �ĺ�
					if(tmgc01.loadLV()>=10 && TMGCSYS.tmgc2ndJob=="") {
					//�������� ���� ���� �ʾ��� ���
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
					//�̹� ������ ���� �Ǿ��� ���
						switch(tmpText) {
						case "��Ա�":
							tmgc01.eat();
							break;
						case "���ڱ�":
							tmgc01.sleep();
							break;
						case "���":
							tmgc01.play();
							break;
						case "��å�ϱ�":
							tmgc01.walk();
							break;
						case "�����ϱ�":
							tmgc01.study();
							break;
						case "�̸�����":
							System.out.print("[System] ���� �̸��� �Է��ϼ��� : ");
							tmpName = scanMain.next();
							tmgc01.setdata(tmpName);
							break;
						case "��������":
							tmgc01.print();
							break;
						case "����":
							if(tmgc01.loadDeath()==1){
								System.out.println("���������� �� �������� �������� ���ھ��...\n���δ� �ȳ�...");
								tmpExitSign=1;	
							}else{
								System.out.println("���δ�! �� �����ּż� ������! ������ ����!");
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
							case "S": //�����
								switch(tmpText) {
								case "�����Ʒ�":
									TMGCJOB.strBattle();
									break;
								default :
									TMGC.nocmd();
									break;
								}
								break;
							case "SH": //����
								switch(tmpText) {
								case "�����Ʒ�":
									TMGCJOB.strBattle();
									break;
								case "�����Ʒ�":
									TMGCJOB.strGuard();
									break;
								default :
									TMGC.nocmd();
									break;
								}
								break;
							case "I": //Ž����
								switch(tmpText) {
								case "�İ��Ʒ�":
									TMGCJOB.intOlfaction();
									break;
								default :
									TMGC.nocmd();
									break;
								}
								break;
							case "IH": //�ȳ���
								switch(tmpText) {
								case "�İ��Ʒ�":
									TMGCJOB.intOlfaction();
									break;
								case "ǥ�ñ����Ʒ�":
									TMGCJOB.intDisplay();
									break;
								default :
									TMGC.nocmd();
									break;
								}
								break;
							case "D": //��ġ���
								switch(tmpText) {
								case "��ȣ�Ʒ�":
									TMGCJOB.debSign();
									break;
								default :
									TMGC.nocmd();
									break;
								}
								break;
							case "DH": //��Ÿ��
								switch(tmpText) {
								case "��ȣ�Ʒ�":
									TMGCJOB.debSign();
									break;
								case "���α��Ʒ�":
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
				case 15: //2�� ���� : PRO/AMATEUR
				case 16:
				case 17:
				case 18:
				case 19:
					if(TMGCSYS.tmgcLV>=15 && TMGCSYS.tmgc3ndProAma=="") {
					//���� �Ǵ� �Ƹ��߾� ����
						TMGCJOB.set3rdproama();
					}else {
					//������ ���� �Ǿ��� ���
						
					}
					break;
				case 20: //3�� ���� �� : PRO or Not
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
