package Java.testQuestion.constructor;

import java.util.Scanner;

public class Application {
    /* Application과 DTO로 나누고 setter와 getter로 나눈뒤
        printInformation을 통해 생성하시오.
        - id String
        - pw String
        - phone int
        - Address String
        - gender char

        아이디는 null 비밀번호는 null전화번호는 0 주소는 null 성별은  입니다.
        를 printInformation을 통해 호출한 뒤
        필드를 순차적으로 변경해보도록 한다.
    */
    public static void main(String[] args) {

        PeopleDTO dto = new PeopleDTO(); // 객체(instance)를 생성했다고 할 수 있다. => 불러온다기 보다 객체를 생성한다고 생각하면 dto1, 2까지 만드는게 이상하지 않다.
        // => 지금까지 불러와서 사용한다고 생각했는데 객체를 만든다고 생각하니까 좀 더 이해하기 편해졌다.
        // => 객체가 인스턴스와 동일하므로 숙지하자
        System.out.println(dto.printInformation1());
//        System.out.println(dto.printInformation()); 이건 안된다.
        dto.printInformation1(); // 굳이 위에처럼 sout를 사용할 필요없이 호출하면 된다.
        dto.printInformation(); // 마찬가지로 동일하게 사용 가능하다.


        // PeopleDTO에서 각자의 객체를 생성하기 위한 준비를 완료했다. (1번, 2번, 3번, 4번, 5번(전부) 초기화하기 위함)

        // dto0 객체 생성 및 하나의 필드 변경
        PeopleDTO dto0 = new PeopleDTO("wow");
        dto0.printInformation();

        // dto1 객체 생성 및 두개의 필드 변경
        PeopleDTO dto1 = new PeopleDTO("hello", "password");
        dto1.printInformation();

        // dto2 객체 생성 및 세개의 필드 변경
        PeopleDTO dto2 = new PeopleDTO("welcome", "secretNumber", "010-1234-5678");
        dto2.printInformation();

        // dto3 객체 생성 및 네개의 필드 변경
        PeopleDTO dto3 = new PeopleDTO("hi", "combination", "010-0123-4567", "Gwangjin-gu, Seoul, Republic of Korea");
        dto3.printInformation();

        // dto4 객체 생성 및 모든 필드 변경
        PeopleDTO dto4 = new PeopleDTO("Java", "Enjoy", "010-0000-0000", "Hanam-si, Gyeonggi-do, Republic of Korea", '남');
        dto4.printInformation();


        // dto5 객체 생성 및 Scanner 결합
        // 1번째 방식
        Scanner sc = new Scanner(System.in);
        PeopleDTO dto5 = new PeopleDTO();
        System.out.println("아이디를 입력하세요");
        dto5.setId(sc.next());

        System.out.println("비밀번호를 입력하세요");
        dto5.setPwd(sc.next());

        System.out.println("전화번호를 입력하세요");
        dto5.setPhone(sc.next());
        sc.nextLine();
        System.out.println("주소를 입력하세요");
//        dto5.setAddress(sc.nextLine());  이걸로 사용하면 자꾸 null반환해서 변경함
        String scAddress = sc.nextLine();
        dto5.setAddress(scAddress);

        System.out.println("성별을 입력하세요");
        dto5.setGender(sc.next().charAt(0));

        dto5.printInformation();

        System.out.println("아이디를 입력하세요");
        String id = sc.next();
        System.out.println("비밀번호를 입력하세요");
        String pwd = sc.next();
        System.out.println("전화번호를 입력하세요");
        String phone = sc.next();
        sc.nextLine();
        System.out.println("주소를 입력하세요");
        String address = sc.nextLine();

        System.out.println("성별을 입력하세요");
        char gender = sc.next().charAt(0);

        // 2번째 방식
        PeopleDTO dto6 = new PeopleDTO(id, pwd, phone, address, gender);
        dto6.printInformation();
    }
}
