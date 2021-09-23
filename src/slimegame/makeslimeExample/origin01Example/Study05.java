/*
package slimegame.makeslimeExample;

import javax.swing.JOptionPane;

import slimegame.origin.Human;

public class Study05 {
    public static void main(String[] args) {
        int hp = 100; // for문과는 달리 while 문은 변수를 미리 초기화 해야 한다.
        Human h = new Human("알렉스");

        while (true) { // ~동안 수행해라
            if (hp < 1) { // if 를 넣어서 hp변수값이 1보다 아래가 되면...
                JOptionPane.showMessageDialog(null, "Game Over");
                break; // if조건문이 수행되면 while문을 종료한다.
            }
            JOptionPane.showMessageDialog(null, "현재 " + h.name + "의 체력은" + hp + "이다."); // while수행 할때마다 나타나는 메세지
            hp = hp - 20;
        }
    }
}
*/