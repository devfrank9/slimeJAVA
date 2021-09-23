package slimegame.makeslimeExample.origin01Example;

public class Study02 {
    public static void main(String[] args) {
        Slime_2 s1;
        s1 = new Slime_2();// Slime_1과는 달리 Slime_2는 static을 제거한채 변수 선언 했기에 이렇게 써야한다.
        s1.name = "슬라삐";
        s1.hp = 100;
        s1.attack();

        Slime_2 s2 = new Slime_2(); //한줄로 쓰고 싶을때...
        s2.name = "슬라돌";
        s2.hp = 100;
        s2.attack();

        Slime_2 s3 = new Slime_2();
        s3.name = "슬라밍";
        s3.hp = 100;
        s3.attack();

    }
}
