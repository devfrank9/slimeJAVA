package slimegame.makeslimeExample.origin03Example;

public class Horse_2 {

    String name;

    Horse_2(String n) {
        name = n;
    }

    void run() {

    }
}

class Unicorn extends Horse_2 { // class 자식클래스 extends 부모클래스 형식
                              // 두번째 클래스 부턴 맨앞에 public이 붙이면 안된다.

    int fp;

    Unicorn(String n) { // 자식생성자의 생성자는 무조건 부모클래스의 생성자를 호출해야 한다.
        super(n); // 부모클래스의 생성자를 호출할땐 super()를 쓴다. (동일 클래스는 this()를 썼었다.)
    }

    void fly() {

    }
}
