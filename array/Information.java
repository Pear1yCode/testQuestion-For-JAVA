package Java.testQuestion.array;

import java.util.Arrays;
import java.util.Scanner;

public class Information {
    public void array () {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력하세요.");
        String name = sc.nextLine();
        System.out.println("성별을 입력하세요. 남, 여");
        String gender = sc.nextLine();
        System.out.println("직업을 입력하세요.");
        String occupation = sc.nextLine();
        System.out.println("나이를 입력하세요.");
        String age = sc.nextLine();
        System.out.println("가장 좋아하는 취미를 입력하세요.");
        String hobby = sc.nextLine();

        String[] arr = {name, gender, occupation, age, hobby};

        System.out.println(Arrays.toString(arr));
    }
}
