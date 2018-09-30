/*
 *	Project My Puppy Story
 *	System Data Class
 *	
 *	Team N1 _ Oh EunSeok, Kim MinYeong, Yoon GeonHwi
 *	Since 17.09.12
 *	
 *	Version 0.1.8 Beta
 *	Last update : 17.10.09
 */
package TMGC;
import java.util.*;

public class TMGCSYS {
	public static String tmgcVersion = "0.1.8 Beta";
	public static int tmgcLV=1, tmgcEXP=0, tmgcHP=100, tmgcStress=20, tmgcDeath=0;
	// 레벨, 경험치, 체력, 스트레스(20 고정), 목숨
	public static int tmgcFeel=0;
	//기분상태 (1~10, 숫자가 클 수록 기분이 안좋음) 
	public static int tmgcLimitEat=0, tmgcLimitSleep=0, tmgcLimitWalk=0, tmgcLimitStudy=0;
	// Eat 한도 3, Sleep 한도 1, Walk 한도 2, Study 한도 1
	public static String tmgcName="다마고치";
	// 이름
	
	/*
	 *	*********************************************************************************************
	 *	2차 전직 Part (LV 10~14)
	 *	*********************************************************************************************/
	public static String tmgc2ndJob="";	// 2차 직업 선택 여부(비어 있으면 없음)
	public static int tmgcSTR=0, tmgcINT=0, tmgcDEB=0, tmgcHET=0;	// 힘, 지적능력, 방탕함, 건강
	public static int tmgcCountPlay=0, tmgcCountStudy=0;	// 놀기 횟수, 공부 횟수, 건강 횟수
	public static int tmgcCheckRegularHealth=0;	//규칙적인 생활 여부 (eat 3번, sleep 1번, walk 2번, study 1번)
	/* ********************************************************************************************/

	/*
	 *	*********************************************************************************************
	 *	3차 전직 Part (LV 15~19)
	 *	*********************************************************************************************/
	public static String tmgc3ndProAma="";	// 3차 전문성 여부(PRO : 프로, AMA : 아마추어)
	/* ********************************************************************************************/

	/*
	 *	*********************************************************************************************
	 *	4차 최종 Part (LV 20)
	 *	*********************************************************************************************/
	public static boolean tmgcFinalMedal;	// 최종 훈장 수여 여부(True : 수여, False : 비수여)
	/* ********************************************************************************************/
	
	/*
		다마고치를 myPet 클래스로 추상화
		-> 보고서 작성 후 업로드
		--------------------------------------------------------------------------------------------
		추가 해야할 부분 :
		
		현재 레벨 안에서 가장 많이한 활동을 기반으로 해서 능력치 스텟을 올려준다.
		-> 해당 능력치들을 기반으로 가장 높은 값을 가진 능력치를 기반으로 직업을 추천한다.
		
		밥먹기, 잠자기 -> HET	
		놀기 -> DEB
		산책하기 -> STR, INT
		공부하기 -> INT
	 */
}
