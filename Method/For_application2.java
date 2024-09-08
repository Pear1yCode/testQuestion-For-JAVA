package Java.testQuestion.Method;

import java.util.Random;

public class For_application2 {
    public void newRandom () {
        Random hello = new Random();
        int randomz = hello.nextInt(16) - 5;
        System.out.println(randomz + "의 절대값은 " + Math.abs(randomz) + "입니다.");
    }
}
