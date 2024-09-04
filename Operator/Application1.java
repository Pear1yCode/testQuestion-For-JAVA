package Operator;

public class Application1 {
    public static void main(String[] args) {

        /*
        정수형 2개 선언, 실수형 2개를 선언 하여 정수형은 왼쪽의 피연산자로, 실수형은 오른쪽의 피연산자로 놓고
        AND 논리 연산자를 통해 true를 반환하시오.
        */

        int num1 = 10;
        int num2 = 20;

        double snum1 = 10.0;
        double snum2 = 20.0;

        System.out.println(num1 == snum1 && num2 == snum2);

    }
}
