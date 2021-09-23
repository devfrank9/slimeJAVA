package slimegame.origin03;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;

import slimegame.makeslimeExample.origin01Example.Study;

class Human {
    String name;
    int hp = 100;

    public Human(String n) {
        name = n;
    }

    public void attack(Slime s) {

        // 슬라임이 당하는 그림
        ImageIcon bsImg_fire = new ImageIcon(Study01.class.getResource("/slimegame/origin03/img/slime2(blue).png"));
        ImageIcon rsImg_fire = new ImageIcon(Study01.class.getResource("/slimegame/origin03/img/slime2(red).png"));

        if (s == Study01.bs1) {
            Study01.imgLbl.setIcon(bsImg_fire);
        } else {
            Study01.imgLbl2.setIcon(rsImg_fire);
        }

        Timer timer1 = new Timer();
        TimerTask task1 = new TimerTask() {

            @Override
            public void run() {
                // 일정시간 후에 실행할 코드
                Study01.imgLbl.setIcon(Study01.bsImg);
                Study01.imgLbl2.setIcon(Study01.rsImg);
                timer1.cancel();
            }
        };

        timer1.schedule(task1, 500);
        // 공격
        s.hp = s.hp - 30;

        // 공격 실행후 조건문
        if (s.hp < 1) {
            if (s == Study01.bs1){
                Study01.frm.remove(Study01.imgLbl);
                Study01.frm.repaint();
                Study01.btn1.setEnabled(false);
            } else {
                Study01.frm.remove(Study01.imgLbl2);
                Study01.frm.repaint();
                Study01.btn2.setEnabled(false);
            }
        Study01.lbl.setText(s.name + "은 사망했다.");
        Study01.lbl2.setText("");
        } else {
            Study01.lbl.setText("현재 " + s.name + "의 체력은 " + s.hp + "이다.\n");
        }
    }
}
