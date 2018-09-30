/*
 *	Project My Puppy Story
 *	2nd Job Function Class
 *	
 *	Team N1 _ Oh EunSeok, Kim MinYeong, Yoon GeonHwi
 *	Since 17.09.12
 *	
 *	Version 0.1.8 Beta
 *	Last update : 17.10.09
 */
package TMGC;
import java.util.*;

public class TMGCJOB {
	public static void set2ndJobRecmd(){
		/*
		 * ���� ��õ �ڵ�
		 *  S, SH : �����, ����
		 *  I, IH : Ž����, �ȳ���
		 *  D, DH : ��ġ���, ��Ÿ��
		 */
		String tmpRecmdJob="";
		int tmpArticleSTR=0,tmpArticleINT=0,tmpArticleDEB=0,tmpArticleHET=0;
		tmpArticleSTR=TMGCSYS.tmgcSTR;
		tmpArticleINT=TMGCSYS.tmgcINT;
		tmpArticleDEB=TMGCSYS.tmgcDEB;
		tmpArticleHET=TMGCSYS.tmgcHET;
		
		/*										STR												*/
		if(tmpArticleSTR>tmpArticleINT && tmpArticleINT>tmpArticleDEB) {
			//1>2>3
			tmpRecmdJob = "S";
		}else if(tmpArticleSTR>tmpArticleDEB && tmpArticleDEB>tmpArticleINT) {
			//1>3>2
			tmpRecmdJob = "S";
			
		/*										INT												*/
		}else if(tmpArticleINT>tmpArticleSTR && tmpArticleSTR>tmpArticleDEB) {
			//2>1>3
			tmpRecmdJob = "I";
		}else if(tmpArticleINT>tmpArticleDEB && tmpArticleDEB>tmpArticleSTR) {
			//2>3>1
			tmpRecmdJob = "I";
			
		/*										DEB												*/
		}else if(tmpArticleDEB>tmpArticleSTR && tmpArticleSTR>tmpArticleINT) {
			//3>1>2
			tmpRecmdJob = "D";
		}else if(tmpArticleDEB>tmpArticleINT && tmpArticleINT>tmpArticleSTR) {
			//3>2>1
			tmpRecmdJob = "D";
		}else if(tmpArticleSTR==tmpArticleINT || tmpArticleSTR==tmpArticleDEB || tmpArticleINT==tmpArticleDEB) {
			//3���� �ɷ�ġ�� �ΰ��� ���� ������ ��� ���� ���� ����
			switch(TMGC.setrnd(3)) {
			case 1:
				tmpRecmdJob = "S";
				break;
			case 2:
				tmpRecmdJob = "I";
				break;
			case 3:
				tmpRecmdJob = "D";
				break;
			}
		}
		
		//HET �ڵ�
		if(tmpArticleHET>=30){
			tmpRecmdJob = tmpRecmdJob+"H";
		}
		
		TMGCSYS.tmgc2ndJob = tmpRecmdJob;
	}
	//����, �����Ʒ�
	public static void strBattle(){
		System.out.println("���� �Ʒ�");
	}
	public static void strGuard(){
		System.out.println("���� �Ʒ�");
	}
	
	//�����ñ�, ǥ�ñ����Ʒ�
	public static void intOlfaction(){
		System.out.println("�İ� �Ʒ�");
	}
	public static void intDisplay(){
		System.out.println("ǥ�� ���� �Ʒ�");
	}
	
	//��ȣ�Ʒ�, ���α�
	public static void debSign(){
		System.out.println("��ȣ �Ʒ�");
	}
	public static void debSkill(){
		System.out.println("���α� �Ʒ�");
	}
	/*
	 ************************************************************************
	 * 
	 * 		3nd Part
	 *		Pro/Ama Section 
	 * 
	 ***********************************************************************
	 */
	
	//���ο� �Ƹ��߾� �Ǵ�
	public static void set3rdproama(){
		if(TMGCSYS.tmgcHET>=50){
			//����
			TMGCSYS.tmgc3ndProAma = "PRO";
		}else {
			//�Ƹ��߾�
			TMGCSYS.tmgc3ndProAma = "AMA";
		}
	}
}
