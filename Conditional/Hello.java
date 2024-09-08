package Java.testQuestion.Conditional;

import java.util.Scanner;

public class Hello {
    public void scare () {
        System.out.println("변소에 갔는데 귀신이 나타났다.");
        System.out.println("귀신이 물었다.");
        System.out.println("무슨 색깔 휴지를 줄까?");
        System.out.println("내 대답은 ? 1. red, 2. blue, 3. yellow, 4. rainbow, 5. tissue");
        Scanner sc = new Scanner(System.in);
        String ansNum = sc.nextLine();
//            String ansStr = sc.nextLine();

//            if (ansNum == 1 && ansStr.equals("red") && ansStr.equals(1.)) {
//                System.out.println("휴지를 빨갛게 물들이며");
//                System.out.println("빨간 휴지를 고른 나는 죽었다.");
//            } else if (ansNum == 2 && ansStr.equals("blue")) {
//                System.out.println("얼굴이 파래지며");
//                System.out.println("파란 휴지를 고른 나는 죽었다.");
//            } else if (ansNum == 3 && ansStr.equals("yellow")) {
//                System.out.println("변소에 빠져");
//                System.out.println("노란 휴지를 고른 나는 죽었다.");
//            } else if (ansNum ==4 && ansStr.equals("rainbow")) {
//                System.out.println("대답이 참신하여");
//                System.out.println("무지개색 휴지를 고른 나는 살았다.");
//            } else if (ansNum ==5 && ansStr.equals("tissue")) {
//                System.out.println("대답이 재미없어");
//                System.out.println("그냥 휴지를 고른 나는 죽었다.");
//            } else {
//                System.out.println("망설이다가 죽었습니다.");
//            }

        // switch 문으로도 숫자와 문자 모두 입력해도 인식할 수 있는 방법은 변수의 String화였다.
        // 굳이 int일 필요가 없기 때문에 String으로 변경후 하나의 변수 내에서 확률들을 계산하여 그 확률로 나올 수 있는 문자열을 입력해주고
        // 그 값에 대한 입력 값을 주면 숫자든 문자열이든 합쳐졌든 전부 문자열 취급이기 때문에 통합해줄 수 있다.

        switch (ansNum) {
            case "1" :
            case "red" :
            case "1." :
            case "1. red":
                System.out.println("휴지를 빨갛게 물들이며");
                System.out.println("빨간 휴지를 고른 나는 죽었다.");
                break;
            case "2" :
            case "blue" :
            case "2." :
            case "2. blue" :
                System.out.println("얼굴이 파래지며");
                System.out.println("파란 휴지를 고른 나는 죽었다.");
                break;
            case "3" :
            case "yellow" :
            case "3." :
            case "3. yellow" :
                System.out.println("변소에 빠져");
                System.out.println("노란 휴지를 고른 나는 죽었다.");
                break;
            case "4" :
            case "rainbow" :
            case "4." :
            case "4. rainbow" :
                System.out.println("대답이 참신하여");
                System.out.println("무지개색 휴지를 고른 나는 살았다.");
                break;
            case "5" :
            case "tissue" :
            case "5." :
            case "5. tissue" :
                System.out.println("대답이 재미없어");
                System.out.println("그냥 휴지를 고른 나는 죽었다.");
                break;
            default:
                System.out.println("망설이다 죽었습니다.");
                break;
        }
    }
}
