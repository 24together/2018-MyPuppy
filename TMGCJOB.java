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
		 * 직업 추천 코드
		 *  S, SH : 투기견, 군견
		 *  I, IH : 탐지견, 안내견
		 *  D, DH : 양치기견, 스타견
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
			//3개의 능력치중 두개의 값이 동일할 경우 직업 랜덤 선택
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
		
		//HET 코드
		if(tmpArticleHET>=30){
			tmpRecmdJob = tmpRecmdJob+"H";
		}
		
		TMGCSYS.tmgc2ndJob = tmpRecmdJob;
	}
	//전투, 보초훈련
	public static void strBattle(){
		System.out.println("전투 훈련");
	}
	public static void strGuard(){
		System.out.println("보초 훈련");
	}
	
	//냄새맡기, 표시구별훈련
	public static void intOlfaction(){
		System.out.println("후각 훈련");
	}
	public static void intDisplay(){
		System.out.println("표시 구별 훈련");
	}
	
	//신호훈련, 개인기
	public static void debSign(){
		System.out.println("신호 훈련");
	}
	public static void debSkill(){
		System.out.println("개인기 훈련");
	}
	/*
	 ************************************************************************
	 * 
	 * 		3nd Part
	 *		Pro/Ama Section 
	 * 
	 ***********************************************************************
	 */
	
	//프로와 아마추어 판단
	public static void set3rdproama(){
		if(TMGCSYS.tmgcHET>=50){
			//프로
			TMGCSYS.tmgc3ndProAma = "PRO";
		}else {
			//아마추어
			TMGCSYS.tmgc3ndProAma = "AMA";
		}
	}
}
