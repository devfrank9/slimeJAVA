package slimegame.origin01;

import javax.swing.JOptionPane;

public class Slime {
    String name;
    int hp = 80;

    // 생성자
    public Slime(String n) {
        name = n;
    }

    // 공격
    public void attack(Human h) {

        if (hp > 0) {
            System.out.println(name + "은 " + h.name + "을 공격했습니다.");
            h.hp = h.hp - 10;

            if (h.hp < 1) {
                JOptionPane.showMessageDialog(null, "Game Over");
                System.exit(0);// 프로그램을 통으로 끝내는 함수
            }
            System.out.println("현재" + h.name + "의 체력은 " + h.hp + "이다.\n");
        }
    }

}
