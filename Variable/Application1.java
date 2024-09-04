package Variable;

public class Application1 {
    public static void main(String[] args) {
        /*
        주어진 byte를 이용해 오버플로우를 사용해서 -125를 나타내고
        그 값에 * 0.951을 한 상태에서 다시 정수형으로 변경 및 양수로 변경하시오.
        */

        byte num1 = 127;

        num1++;
        num1++;
        num1++;
        num1++;

        System.out.println("num1 : " + num1); // 127: byte 의 최대 저장 범위

        System.out.println(num1);

        long num2 = (long) (0.951 * num1);

        System.out.println(-num2);
    }
}
