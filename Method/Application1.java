package Java.testQuestion.Method;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        // 메인 메소드와 A 메소드를 생성하고, 메인 메소드에서 A 메소드로 이동 후 1 ~ 10까지의 난수 발생을 시킨 값에 5를 곱한 값이 출력되게하고
        // 메인 메소드에서 결과값을 입력할 수 있는 창을 만드시오.
        // ex) 결과값은 : 5 입니다. 가 먼저 출력되고 메인으로 돌아왔을 때,
        // 결과값이 무엇입니까? 에 대한 console 창 답변으로 5가 나타나면 5를 입력할 수 있게 만들고 입력한 값에 5가 또 곱해지게 만들어서 최종적으로 출력되게 하기
        // 결과값은 우측에 나타나야 함 (줄바꿈 되지 않게 하기)
        // console 창 출력 예시 :
        /* 만약 15가 나왔을 경우
                        결과값은 : 15입니다.
                        결과값이 무엇입니까? 15
                        최종결과 값은 75입니다.
         */

        Application1 app1 = new Application1();
        app1.A();
        Scanner scl = new Scanner(System.in);
        System.out.print("결과값이 무엇입니까?");
        int realAnswer = (scl.nextInt()*5);
        System.out.println("최종결과 값은 " + realAnswer + "입니다.");

    }
    public void A() {
        int randomNum = (int) (Math.random() * 11);
        int answer = (randomNum * 5);
        System.out.println("결과값은 : " + answer + "입니다." );
    }
}
