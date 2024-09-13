package Java.testQuestion.constructor;

public class PeopleDTO {
    private String id;
    private String pwd;
    private String phone;
    private String address;
    private char gender;
    // 오늘 내가 숙지하게 된 부분 (복습)
    // 1. 클래스 명과 생성자 명이 동일해야하는 점
    // 2. 필드라고 함은 id, pwd와 같은 공간으로 id와 같이 각 부분을 필드라고 칭할 수 있음
    // (3개의 필드를 초기화하라고 함은 3개의 값을 변경하라는 뜻)
    // 3. 생성자 내에서는 return을 사용하겠지만 생성자가 아닌 void가 나오는 경우에는 return 사용이 불가능하여
//            System.out.println();를 사용해야 한다.
    // 4. setter와 getter의 필요성 (작성 이유 & 중요성)


    // 일단 습관적으로 setter와 getter를 작성해주자
    // 왜? 사실 문제를 푸는데는 문제가 없지만 나중에 생성자를 사용할 때 유지보수에 용이하게 하기 위해 setter와 getter를 작성하는 버릇을 들이자 !

    //  setter 부터 생성해보자 => 비슷하게 생겼지만 getter와 다른 구성
    public void setId(String id) {
        this.id = id; // 이게 사실 뭘 뜻하는지 정확히 모르겠다.
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setPhone (String phone) {
        this.phone = phone;
    }

    public void setAddress (String Address) {
        this.address = address;
    }

    public void setGender (char gender) {
        this.gender = gender;
    }

    // getter 생성하기 => setter와 약간의 다른 구성을 확인할 것

    public String getId () {
        return id;
    }

    public String getPwd () {
        return pwd;
    }

    public String getPhone () {
        return phone;
    }

    public String getAddress () {
        return address;
    }

    public char getGender () {
        return gender;
    }


    // printInformation을 만들 것인데 두가지 유형으로 만들 수 있다.
    // 1. void 형 => System.out.println(); 사용
    public void printInformation() {
        System.out.println("아이디는 " + id + " 비밀번호는 " + pwd + " 전화번호는 " + phone + " 주소는 " + address + " 성별은 " + gender + "입니다.");
    }

    // 2. String 형 => void가 아니므로  System.out.println(); 대신 return 사용
    // 일단 기본 생성자를 작성해주고 생성자들은 매개변수가 클래스와 동일해야 한다. (주석은 사용하지 않고 사용할 수 있게 매개변수의 이름에 1을 붙였다.)
    public String printInformation1 () {
        return ("아이디는 " + id + " 비밀번호는 " + pwd + " 전화번호는 " + phone + " 주소는 " + address + " 성별은 " + gender + "입니다.");
    }

    // 기본 생성자를 생성(중요) => 기초라고 생각하자.
    public PeopleDTO () {};

    // 위의 기초를 다지고 아래의 각자의 객체를 생성하기 위한 공간을 만든다. (복습을 위해 1, 2, 3, 4, 5개(모두)로 각각 초기화 해보았다.

    // 1개의 필드만 변경하기 위한 생성자
    public PeopleDTO (String id) {
        this.id = id;
    }

    // 2개의 필드만 변경하기 위한 생성자
    public PeopleDTO (String id, String pwd) {
        this.id = id;
        this.pwd = pwd;
    }

    // 3개의 필드만 변경하기 위한 생성자
    public PeopleDTO (String id, String pwd, String phone) {
        this.id = id;
        this.pwd = pwd;
        this.phone = phone;
    }

    // 4개의 필드만 변경하기 위한 생성자
    public PeopleDTO (String id, String pwd, String phone, String address) {
        this.id = id;
        this.pwd = pwd;
        this.phone = phone;
        this.address = address;
    }

    public PeopleDTO (String id, String pwd, String phone, String address, char gender) {
        this.id = id;
        this.pwd = pwd;
        this.phone = phone;
        this.address = address;
        this.gender = gender;
    }
}