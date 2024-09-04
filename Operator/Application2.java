package Operator;

public class Application2 {
    public static void main(String[] args) {

/* 선언된 정수 5가지 변수를 자유롭게 이용하여
한곳에 ||(or 연산자) 2개와 &&(and 연산자) 1개를 써서 true를 반환하시오.
힌트 : boolean 자료형 사용
*/
        int num0 = 1;
        int num1 = 2;
        int num2 = 3;
        int num3 = 4;
        int num4 = 5;

        boolean bool = (num0 == num1 || num1 < num2);
        System.out.println(bool&&(num3>num4||num4>num3));
    }
}
