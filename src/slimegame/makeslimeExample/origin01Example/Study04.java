/*
package slimegame.makeslimeExample;

import javax.swing.JOptionPane;

import slimegame.origin.Human02;
import slimegame.origin.Slime;

public class Study04 {
    public static void main(String[] args) {
        Slime s1 = new Slime("슬라삐");
        Slime s2 = new Slime("슬라돌");
        Human02 h = new Human02("알렉스");

        System.out.println(s1.name + "와 " + s2.name + "이 나타났다! 당신의 이름은 " + h.name + "이다.");

        while (true) {

            int target = Integer
                    .parseInt(JOptionPane.showInputDialog("어느 슬라임을 공격하시겠습니까? 1은 " + s1.name + " 2는 " + s2.name));

            if (target == 1) {
                //인간의 공격
                h.attack(s1.name);
                s1.hp = s1.hp - 10;
                System.out.println("현재 " + s1.name + "의 체력은 " + s1.hp + "이다.\n");

                //슬라임의 공격
                //s1.attack();
                h.hp = h.hp - 10;

                //인간의 사망
                if (h.hp < 1) {
                    JOptionPane.showMessageDialog(null, "Game Over");
                    break;
                }

                System.out.println("현재 " + h.name + "의 체력은 " + h.hp + "이다.\n");

            } else if (target == 2) {
                //인간의 공격
                h.attack(s2.name);
                s2.hp = s2.hp - 10;
                System.out.println("현재 " + s1.name + "의 체력은 " + s1.hp + "이다.\n");

                //슬라임의 공격
                //s2.attack();
                h.hp = h.hp - 10;

                //인간의 사망
                if (h.hp < 1) {
                    JOptionPane.showMessageDialog(null, "Game Over");
                    break;
                }

                System.out.println("현재 " + h.name + "의 체력은 " + h.hp + "이다.\n");

            } else {
                System.out.println("올바른 숫자를 입력하세요.");
            }
        }
    }
}
*/