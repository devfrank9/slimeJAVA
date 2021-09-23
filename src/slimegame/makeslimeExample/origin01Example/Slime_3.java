//생성자 함수
package slimegame.makeslimeExample.origin01Example;

public class Slime_3 {
    String name;
    int hp;

    public Slime_3(){
        System.out.println("탄생"); //객체가 생성될떄 자동으로 호출된다.
    }

    public void attack(){
        System.out.println(name+"은 인간을 공격했습니다.");
    }
    
}
