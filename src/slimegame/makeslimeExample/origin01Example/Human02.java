package slimegame.makeslimeExample.origin01Example;

public class Human02 {
    String name;
    int hp = 100;

    public Human02(String n) {
        name = n;
    }

    public void attack(String sName) {
        System.out.println("인간은 " + sName + "을 공격했습니다.");
    }
    
}
