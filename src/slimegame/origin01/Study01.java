package slimegame.origin01;

import javax.swing.JOptionPane;

public class Study01 {
    public static void main(String[] args) {

        // 빈 슬라임 변수
        Slime s = null;

        Slime s1 = new Slime("슬라삐");
        Slime s2 = new Slime("슬라돌");
        Human h = new Human("알렉스");

        System.out.println(s1.name + "와 " + s2.name + "이 나타났다! 당신의 이름은 " + h.name + "이다.\n");

        while (true) {
            // 인풋박스
            String sTarget = JOptionPane.showInputDialog("어느 슬라임을 공격하시겠습니까? 1은 " + s1.name + " 2는 " + s2.name);

            // null값이나 빈칸일경우 프로그램 종료
            if (sTarget == null || sTarget.equals("")) { // 변수1.equals(변수2) <<<문자열의 == 표시
                System.exit(0);
            }
            // 형변환
            int target = Integer.parseInt(sTarget);

            if (target == 1) {

                s = s1;

            } else if (target == 2) {

                s = s2;

            } else {

                System.out.println("올바른 숫자를 입력하세요.");

            }

            // 슬라임이 살아있을때만 공격
            if (s.hp < 1) {

                System.out.println(s.name + "은 이미 죽었다.");

            } else {
                h.attack(s);
                s.attack(h);

            }

            if (s1.hp < 1 && s2.hp < 1) {
                JOptionPane.showMessageDialog(null, "Game Clear");
                System.exit(0);
            }

        }
    }
}