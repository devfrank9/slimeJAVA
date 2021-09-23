package slimegame.makeslimeExample.origin02Example;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Study01_2 {

    public static void main(String[] args) {

        // 프레임 생성
        JFrame frm = new JFrame("슬라임 퇴치하기");

        // 프레임 크기 설정
        frm.setSize(350, 300);

        // 프레임을 화면 가운데에 배치
        frm.setLocationRelativeTo(null);

        // 프레임을 닫았을 때 메모리에서 제거되도록 설정
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ★ 레이아웃 설정
        FlowLayout fLay = new FlowLayout();
        frm.getContentPane().setLayout(fLay); //프레임영역(frm)에서 컨텐츠영역(getContentPane)
                                              //을 가져와 레이아웃(setLayout)에 붙인다.
                                              //가져온 레이아웃은 플로우레이아웃으로 정의했던 (flay)이다.

        // 버튼 생성
        JButton btn1 = new JButton("슬라삐");
        JButton btn2 = new JButton("슬라디");

        // ★ 프레임에다가 버튼 추가
        frm.getContentPane().add(btn1); //프레임영역(frm)에서 컨텐츠영역(getContentPane)
                                        //을 가져와 레이아웃(setLayout)에 붙인다.
                                        //컨텐츠 영역에 버튼(btn1)을 가져온다. 버튼은 앞서 정의한 JButton형식이다.
        frm.getContentPane().add(btn2);

        // 프레임이 보이도록 설정
        frm.setVisible(true);
    }

}
