package TMGC;
import java.util.*;

public class TMGCSTORY {
    public static void playStory(String motionJob, int motionDelay){
    	Scanner scanStory = new Scanner(System.in);
    	String tmpText = "";
    	switch(motionJob){
    	case "Intro_1":
	    	System.out.println(
	    				"□\n"
	    			+	"□	프롤로그...\n"
	    			+	"□\n"
	    			+	"□\n"
	     			+	"□\n"
	    			+	"□\n"
	    			+	"□\n"
	    			+	"□\n"
	    			+	"□ 어느 날 학교 수업을 마치고 집에 돌아가던 길, 전봇대 옆에 버려진 박스에서 \"끼잉..낑\"소리가 들려왔다.\n"
	    			+	"□ 호기심이 생긴 나는 그 박스를 열어 확인 해 보니 갓 태어난 강아지가 버러져있었다.\n"
	    			+	"□ 그것을 그냥 지나치지 못하는 나는 어쩔줄 몰라하며 우선 집에 데려와 몇일 간 페이스북과 주변 인맥을 동행하여 주인을 찾아왔지만, 도무지 나타나지 않아 어쩔 수 없이 내가 키우기로 마음 먹었다.\n"
	    			+	"□ 이왕 키우기러 한 거 이 강아지를 누구보다 잘 키워 나가기러 마음 먹었다.\n"
	    			+	"□\n"
	    			+	"□ 이제 게임을 시작하려고 합니다. 아무 글자나 입력하고 Enter를 누르세요\n"
	    			+	"□ 입력 : ");
	    	tmpText = scanStory.next();
	    	break;
    		case "S_1":
		    	System.out.println(
		    				"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"는 투기견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"의 주인 _\n"
		    			+	"□ 우리 \"(이름)\"은 남들보다 힘과 체력이 뛰어나니 투기견으로 키워 어떤 싸움에서도 지지 않겠다 !\n"
		    			+	"□ 투기견으로 키워봐야 겠다!\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 플레이를 계속 하려면 아무 글자나 입력하고 Enter를 누르세요\n"
		    			+	"□ 입력 : ");
		    	tmpText = scanStory.next();
		    	break;
    		case "SH_1":
		    	System.out.println(
		    				"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"는 군견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"의 주인 _\n"
		    			+	"□ 우리\"(이름)\"은 남들보다 힘, 체력하며 센스도 워낙 뛰어나니 어떠한 전쟁에서 어떤 작전을 임무 받아도 모두 수행 할 수 있겠다 !\n"
		    			+	"□ 군견으로 키워봐야 겠다!\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 플레이를 계속 하려면 아무 글자나 입력하고 Enter를 누르세요\n"
		    			+	"□ 입력 : ");
		    	tmpText = scanStory.next();
		    	break;
    		case "I_1":
		    	System.out.println(
		    				"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"는 안내견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"의 주인 _\n"
		    			+	"□ 우리 \"(이름)\"은 남들보다 지능과 책임감이 강하니 도움이 필요한 분들께 없어서는 안되겠구만 !\n"
		    			+	"□ 안내견으로 키워봐야 겠다!\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 플레이를 계속 하려면 아무 글자나 입력하고 Enter를 누르세요\n"
		    			+	"□ 입력 : ");
		    	tmpText = scanStory.next();
		    	break;
    		case "IH_1":
		    	System.out.println(
		    				"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"는 탐지견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"의 주인 _\n"
		    			+	"□ 우리 \"(이름)\"은 남들보다 후각과 지능이 뛰어나니까 어떠한 장애물이던 빨리 알아채 위험을 미리 해결해 주는\n"
		    			+	"□ 탐지견으로 키워봐야 겠다!\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 플레이를 계속 하려면 아무 글자나 입력하고 Enter를 누르세요\n"
		    			+	"□ 입력 : ");
		    	tmpText = scanStory.next();
		    	break;
    		case "D_1":
		    	System.out.println(
		    				"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"는 양치기견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"의 주인 _\n"
		    			+	"□ 우리 \"(이름)\"은 남들보다 남들보다 방탕하기도 하고 책임감도 있으니까 나중에 목장을 차려 같이 양과 같은 가축들을 관리할 수 있는\n"
		    			+	"□ 양치기견으로 키워봐야 겠다!\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 플레이를 계속 하려면 아무 글자나 입력하고 Enter를 누르세요\n"
		    			+	"□ 입력 : ");
		    	tmpText = scanStory.next();
		    	break;
    		case "DH_1":
		    	System.out.println(
		    				"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"는 스타견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"의 주인 _\n"
		    			+	"□ 우리 \"(이름)\"은 남들보다 스타성도 뛰어나고 개인기도 많으니까 대중들에게 인정받고 활동하는\n"
		    			+	"□ 스타견으로 키워봐야 겠다!\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 플레이를 계속 하려면 아무 글자나 입력하고 Enter를 누르세요\n"
		    			+	"□ 입력 : ");
		    	tmpText = scanStory.next();
		    	break;
    		case "S_1_PRO":
		    	System.out.println(
		    				"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"는 전문 투기견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"의 주인 _\n"
		    			+	"□ 오홓ㅎㅎ 생각보다 우리 \"(이름)\"이 진짜 소질이 있는 것 같은데?!  이제 진짜 투기장을 가서 실전에서 뛰로 가볼까 !\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 플레이를 계속 하려면 아무 글자나 입력하고 Enter를 누르세요\n"
		    			+	"□ 입력 : ");
		    	tmpText = scanStory.next();
		    	break;
    		case "S_1_AMA":
		    	System.out.println(
		    				"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"는 일반 투기견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"의 주인 _\n"
		    			+	"□ 엄...이 정도면 뭐 잘 자라왔어 ~, 실전을 이용하여 더 키워보자 !\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 플레이를 계속 하려면 아무 글자나 입력하고 Enter를 누르세요\n"
		    			+	"□ 입력 : ");
		    	tmpText = scanStory.next();
		    	break;
    		case "SH_1_PRO":
		    	System.out.println(
		    				"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"는 특수 군견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"의 주인 _\n"
		    			+	"□ 오홓ㅎㅎ 생각보다 우리 \"(이름)\"이 진짜 소질이 있는 것 같은데?!  군부대로 가서 실제 작전에 몸 담아보자 !\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 플레이를 계속 하려면 아무 글자나 입력하고 Enter를 누르세요\n"
		    			+	"□ 입력 : ");
		    	tmpText = scanStory.next();
		    	break;
    		case "SH_1_AMA":
		    	System.out.println(
		    				"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"는 군견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"의 주인 _\n"
		    			+	"□ 엄...이 정도면 뭐 잘 자라왔어 ~, 실제 작전을 통해서 경험을 더 길러보자 !\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 플레이를 계속 하려면 아무 글자나 입력하고 Enter를 누르세요\n"
		    			+	"□ 입력 : ");
		    	tmpText = scanStory.next();
		    	break;
    		case "I_1_PRO":
		    	System.out.println(
		    				"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"는 특수 안내견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"의 주인 _\n"
		    			+	"□ 오홓ㅎㅎ 생각보다 우리 \"(이름)\"이 진짜 소질이 있는 것 같은데?!  이제 몸이 불편하신분들에게 도움 드리러 가자 !\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 플레이를 계속 하려면 아무 글자나 입력하고 Enter를 누르세요\n"
		    			+	"□ 입력 : ");
		    	tmpText = scanStory.next();
		    	break;
    		case "I_1_AMA":
		    	System.out.println(
		    				"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"는 안내견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"의 주인 _\n"
		    			+	"□ 엄...이 정도면 뭐 잘 자라왔어 ~, 도움이 필요하신 분에게 분양하고 더 지켜보자 !\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 플레이를 계속 하려면 아무 글자나 입력하고 Enter를 누르세요\n"
		    			+	"□ 입력 : ");
		    	tmpText = scanStory.next();
		    	break;
    		case "IH_1_PRO":
		    	System.out.println(
		    				"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"는 지뢰 탐지견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"의 주인 _\n"
		    			+	"□ 오홓ㅎㅎ 생각보다 우리 \"(이름)\"이 진짜 소질이 있는 것 같은데?!  여러 국경선에 지뢰나 찾으러 가볼까 !\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 플레이를 계속 하려면 아무 글자나 입력하고 Enter를 누르세요\n"
		    			+	"□ 입력 : ");
		    	tmpText = scanStory.next();
		    	break;
    		case "IH_1_AMA":
		    	System.out.println(
		    				"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"는 공항 탐지견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"의 주인 _\n"
		    			+	"□ 엄...이 정도면 뭐 잘 자라왔어 ~, 우리 \"(이름)\"에게 맞는 공항에 일자리나 찾으러 가볼까 !\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 플레이를 계속 하려면 아무 글자나 입력하고 Enter를 누르세요\n"
		    			+	"□ 입력 : ");
		    	tmpText = scanStory.next();
		    	break;
    		case "D_1_PRO":
		    	System.out.println(
		    				"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"는 매일유업 목장 관리견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"의 주인 _\n"
		    			+	"□ 오홓ㅎㅎ 생각보다 우리 \"(이름)\"이 진짜 소질이 있는 것 같은데?! 매일유업의 목장 관리견도 하시겠다, 확인하러 가볼까 !\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 플레이를 계속 하려면 아무 글자나 입력하고 Enter를 누르세요\n"
		    			+	"□ 입력 : ");
		    	tmpText = scanStory.next();
		    	break;
    		case "D_1_AMA":
		    	System.out.println(
		    				"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"는 양치기견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"의 주인 _\n"
		    			+	"□ 엄...이 정도면 뭐 잘 자라왔어 ~, 할아버지 목장에서 일 해보면서 더 배워 나가야겠다 !\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 플레이를 계속 하려면 아무 글자나 입력하고 Enter를 누르세요\n"
		    			+	"□ 입력 : ");
		    	tmpText = scanStory.next();
		    	break;
    		case "DH_1_PRO":
		    	System.out.println(
		    				"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"는 한류 스타견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"의 주인 _\n"
		    			+	"□ 오홓ㅎㅎ 생각보다 우리 \"(이름)\"이 진짜 끼가 많자나?!  소속사도 알아보고 이제는 무대에 서야지!\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 플레이를 계속 하려면 아무 글자나 입력하고 Enter를 누르세요\n"
		    			+	"□ 입력 : ");
		    	tmpText = scanStory.next();
		    	break;
    		case "DH_1_AMA":
		    	System.out.println(
		    				"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"는 스타견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"의 주인 _\n"
		    			+	"□ 엄...이 정도면 뭐 잘 자라왔어 ~, 여러 무대를 서면서 대중들에게 인지도를 차근차근 쌓아나가보자 !\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 플레이를 계속 하려면 아무 글자나 입력하고 Enter를 누르세요\n"
		    			+	"□ 입력 : ");
		    	tmpText = scanStory.next();
		    	break;
    		case "S_2_PRO_PRO":
		    	System.out.println(
		    				"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"는 전문 투기견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"의 주인 _\n"
		    			+	"□ 역시 우리\"(이름)\" !! 정말 잘 자라와줬구나 ㅎㅎ, 어떤 실전에서든 이겨오고 이젠 \"(이름)\"만 들어도 다른 투기견들이 벌벌 떤다더라 !, 그동안 수고 많았다♥\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 플레이를 계속 하려면 아무 글자나 입력하고 Enter를 누르세요\n"
		    			+	"□ 입력 : ");
		    	tmpText = scanStory.next();
		    	break;
    		case "S_2_PRO_AMA":
		    	System.out.println(
		    				"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"는 일반 투기견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"의 주인 _\n"
		    			+	"□ 마무리가 약간 아쉽긴 하지만 ! 잘해왔어 여태껏 ㅎㅎ 정말 수고 많았다 ~, 너가 정말 자랑스러워 ♥\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 플레이를 계속 하려면 아무 글자나 입력하고 Enter를 누르세요\n"
		    			+	"□ 입력 : ");
		    	tmpText = scanStory.next();
		    	break;
    		case "S_1_AMA_PRO":
		    	System.out.println(
		    				"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"는 전문 투기견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"의 주인 _\n"
		    			+	"□ 이야 !!! 우리 \"(이름)\" !!! 역시 끝까지 포기하지 않고 잘 따라와서 너무 고마워 ㅎㅎ 진짜 수고 많았다 ♥\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 플레이를 계속 하려면 아무 글자나 입력하고 Enter를 누르세요\n"
		    			+	"□ 입력 : ");
		    	tmpText = scanStory.next();
		    	break;
    		case "S_1_AMA_AMA":
		    	System.out.println(
		    				"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"는 일반 투기견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"의 주인 _\n"
		    			+	"□ 괜찮아 괜찮아 !! 정말 잘 해왔어 \"(이름)\" !! 여태껏 잘 자라와서 고마워 ~ 그동안 수고 많았다 ♥\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 플레이를 계속 하려면 아무 글자나 입력하고 Enter를 누르세요\n"
		    			+	"□ 입력 : ");
		    	tmpText = scanStory.next();
		    	break;
    		case "SH_2_PRO_PRO":
		    	System.out.println(
		    				"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"는 특수 군견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"의 주인 _\n"
		    			+	"□ 역시 우리\"(이름)\" !! 정말 잘 자라와줬구나 ㅎㅎ, 큰 전쟁에 나가 이러한 업적도 세우고 !! 기특해 죽겠어 아주 ~, 그동안 수고 많았다♥\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 플레이를 계속 하려면 아무 글자나 입력하고 Enter를 누르세요\n"
		    			+	"□ 입력 : ");
		    	tmpText = scanStory.next();
		    	break;
    		case "SH_2_PRO_AMA":
		    	System.out.println(
		    				"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"는 군견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"의 주인 _\n"
		    			+	"□ 마무리가 약간 아쉽긴 하지만 ! 잘해왔어 여태껏 ㅎㅎ 정말 수고 많았다 ~, 너가 정말 자랑스러워 ♥\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 플레이를 계속 하려면 아무 글자나 입력하고 Enter를 누르세요\n"
		    			+	"□ 입력 : ");
		    	tmpText = scanStory.next();
		    	break;
    		case "SH_2_AMA_PRO":
		    	System.out.println(
		    				"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"는 특수 군견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"의 주인 _\n"
		    			+	"□ 이야 !!! 우리 \"(이름)\" !!! 역시 끝까지 포기하지 않고 잘 따라와서 너무 고마워 ㅎㅎ 진짜 수고 많았다 ♥\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 플레이를 계속 하려면 아무 글자나 입력하고 Enter를 누르세요\n"
		    			+	"□ 입력 : ");
		    	tmpText = scanStory.next();
		    	break;
    		case "SH_2_AMA_AMA":
		    	System.out.println(
		    				"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"는 군견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"의 주인 _\n"
		    			+	"□ 괜찮아 괜찮아 !! 정말 잘 해왔어 \"(이름)\" !! 여태껏 잘 자라와서 고마워 ~ 그동안 수고 많았다 ♥\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 플레이를 계속 하려면 아무 글자나 입력하고 Enter를 누르세요\n"
		    			+	"□ 입력 : ");
		    	tmpText = scanStory.next();
		    	break;
    		case "I_1_PRO_PRO":
		    	System.out.println(
		    				"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"는 특수 안내견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"의 주인 _\n"
		    			+	"□ 역시 우리\"(이름)\" !! 정말 잘 자라와줬구나 ㅎㅎ, 여러군데에서 칭찬이 가득하다 ~ 이제는 도움이 필요한 곳 마다 자리 해 열심히 노력해줘 ! 그동안 수고 많았다♥\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 플레이를 계속 하려면 아무 글자나 입력하고 Enter를 누르세요\n"
		    			+	"□ 입력 : ");
		    	tmpText = scanStory.next();
		    	break;
    		case "I_1_PRO_AMA":
		    	System.out.println(
		    				"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"는 안내견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"의 주인 _\n"
		    			+	"□ 마무리가 약간 아쉽긴 하지만 ! 잘해왔어 여태껏 ㅎㅎ 정말 수고 많았다 ~, 너가 정말 자랑스러워 ♥\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 플레이를 계속 하려면 아무 글자나 입력하고 Enter를 누르세요\n"
		    			+	"□ 입력 : ");
		    	tmpText = scanStory.next();
		    	break;
    		case "I_1_AMA_PRO":
		    	System.out.println(
		    				"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"는 전문 안내견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"의 주인 _\n"
		    			+	"□ 이야 !!! 우리 \"(이름)\" !!! 역시 끝까지 포기하지 않고 잘 따라와서 너무 고마워 ㅎㅎ 진짜 수고 많았다 ♥\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 플레이를 계속 하려면 아무 글자나 입력하고 Enter를 누르세요\n"
		    			+	"□ 입력 : ");
		    	tmpText = scanStory.next();
		    	break;
    		case "I_1_AMA_AMA":
		    	System.out.println(
		    				"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"는 안내견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"의 주인 _\n"
		    			+	"□ 괜찮아 괜찮아 !! 정말 잘 해왔어 \"(이름)\" !! 여태껏 잘 자라와서 고마워 ~ 그동안 수고 많았다 ♥\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 플레이를 계속 하려면 아무 글자나 입력하고 Enter를 누르세요\n"
		    			+	"□ 입력 : ");
		    	tmpText = scanStory.next();
		    	break;
    		case "IH_2_PRO_PRO":
		    	System.out.println(
		    				"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"는 지뢰 탐지견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"의 주인 _\n"
		    			+	"□ 역시 우리\"(이름)\" !! 정말 잘 자라와줬구나 ㅎㅎ,  공항이던, 경찰특공대에서든 필요한 곳 마다 위치 해 항상 도움이 되도록 해 ! 그동안 수고 많았다♥\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 플레이를 계속 하려면 아무 글자나 입력하고 Enter를 누르세요\n"
		    			+	"□ 입력 : ");
		    	tmpText = scanStory.next();
		    	break;
    		case "IH_2_PRO_AMA":
		    	System.out.println(
		    				"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"는 공항 탐지견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"의 주인 _\n"
		    			+	"□ 마무리가 약간 아쉽긴 하지만 ! 잘해왔어 여태껏 ㅎㅎ 정말 수고 많았다 ~, 너가 정말 자랑스러워 ♥\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 플레이를 계속 하려면 아무 글자나 입력하고 Enter를 누르세요\n"
		    			+	"□ 입력 : ");
		    	tmpText = scanStory.next();
		    	break;
    		case "IH_2_AMA_PRO":
		    	System.out.println(
		    				"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"는 지뢰 탐지견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"의 주인 _\n"
		    			+	"□ 이야 !!! 우리 \"(이름)\" !!! 역시 끝까지 포기하지 않고 잘 따라와서 너무 고마워 ㅎㅎ 진짜 수고 많았다 ♥\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 플레이를 계속 하려면 아무 글자나 입력하고 Enter를 누르세요\n"
		    			+	"□ 입력 : ");
		    	tmpText = scanStory.next();
		    	break;
    		case "IH_2_AMA_AMA":
		    	System.out.println(
		    				"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"는 공항 탐지견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"의 주인 _\n"
		    			+	"□ 괜찮아 괜찮아 !! 정말 잘 해왔어 \"(이름)\" !! 여태껏 잘 자라와서 고마워 ~ 그동안 수고 많았다 ♥\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 플레이를 계속 하려면 아무 글자나 입력하고 Enter를 누르세요\n"
		    			+	"□ 입력 : ");
		    	tmpText = scanStory.next();
		    	break;
    		case "D_1_PRO_PRO":
		    	System.out.println(
		    				"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"는 매일유업 목장 관리견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"의 주인 _\n"
		    			+	"□ 역시 우리\"(이름)\" !! 정말 잘 자라와줬구나 ㅎㅎ, 할아버지께서 없어서는 안된다네 ! 기특해 죽겠어 아주 ~, 그동안 수고 많았다♥\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 플레이를 계속 하려면 아무 글자나 입력하고 Enter를 누르세요\n"
		    			+	"□ 입력 : ");
		    	tmpText = scanStory.next();
		    	break;
    		case "D_1_PRO_AMA":
		    	System.out.println(
		    				"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"는 양치기견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"의 주인 _\n"
		    			+	"□ 마무리가 약간 아쉽긴 하지만 ! 잘해왔어 여태껏 ㅎㅎ 정말 수고 많았다 ~, 너가 정말 자랑스러워 ♥\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 플레이를 계속 하려면 아무 글자나 입력하고 Enter를 누르세요\n"
		    			+	"□ 입력 : ");
		    	tmpText = scanStory.next();
		    	break;
    		case "D_1_AMA_PRO":
		    	System.out.println(
		    				"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"는 매일유업 목장 관리견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"의 주인 _\n"
		    			+	"□ 이야 !!! 우리 \"(이름)\" !!! 역시 끝까지 포기하지 않고 잘 따라와서 너무 고마워 ㅎㅎ 진짜 수고 많았다 ♥\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 플레이를 계속 하려면 아무 글자나 입력하고 Enter를 누르세요\n"
		    			+	"□ 입력 : ");
		    	tmpText = scanStory.next();
		    	break;
    		case "D_1_AMA_AMA":
		    	System.out.println(
		    				"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"는 양치기견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"의 주인 _\n"
		    			+	"□ 괜찮아 괜찮아 !! 정말 잘 해왔어 \"(이름)\" !! 여태껏 잘 자라와서 고마워 ~ 그동안 수고 많았다 ♥\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 플레이를 계속 하려면 아무 글자나 입력하고 Enter를 누르세요\n"
		    			+	"□ 입력 : ");
		    	tmpText = scanStory.next();
		    	break;
    		case "DH_2_PRO_PRO":
		    	System.out.println(
		    				"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"는 한류 스타견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"의 주인 _\n"
		    			+	"□ 역시 우리\"(이름)\" !! 정말 잘 자라와줬구나 ㅎㅎ, 대중들에게 인정도 받고 명예 훈장도 받고 !! 그동안 수고 많았다♥\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 플레이를 계속 하려면 아무 글자나 입력하고 Enter를 누르세요\n"
		    			+	"□ 입력 : ");
		    	tmpText = scanStory.next();
		    	break;
    		case "DH_2_PRO_AMA":
		    	System.out.println(
		    				"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"는 스타견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"의 주인 _\n"
		    			+	"□ 마무리가 약간 아쉽긴 하지만 ! 잘해왔어 여태껏 ㅎㅎ 정말 수고 많았다 ~, 너가 정말 자랑스러워 ♥\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 플레이를 계속 하려면 아무 글자나 입력하고 Enter를 누르세요\n"
		    			+	"□ 입력 : ");
		    	tmpText = scanStory.next();
		    	break;
    		case "DH_2_AMA_PRO":
		    	System.out.println(
		    				"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"는 한류 스타견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"의 주인 _\n"
		    			+	"□ 이야 !!! 우리 \"(이름)\" !!! 역시 끝까지 포기하지 않고 잘 따라와서 너무 고마워 ㅎㅎ 진짜 수고 많았다 ♥\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 플레이를 계속 하려면 아무 글자나 입력하고 Enter를 누르세요\n"
		    			+	"□ 입력 : ");
		    	tmpText = scanStory.next();
		    	break;
    		case "DH_2_AMA_AMA":
		    	System.out.println(
		    				"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"는 스타견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"의 주인 _\n"
		    			+	"□ 괜찮아 괜찮아 !! 정말 잘 해왔어 \"(이름)\" !! 여태껏 잘 자라와서 고마워 ~ 그동안 수고 많았다 ♥\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 플레이를 계속 하려면 아무 글자나 입력하고 Enter를 누르세요\n"
		    			+	"□ 입력 : ");
		    	tmpText = scanStory.next();
		    	break;
		    	
    	}
    	int tmpClear;
		for(tmpClear=0;tmpClear<7;tmpClear++) {
			System.out.println("");
		}
		TMGC.setsleep(motionDelay);
    }
  
}
