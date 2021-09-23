// 버튼의 크기를 조정하기위해 학습해보자.

package slimegame.makeslimeExample.origin02Example;

import javax.swing.JFrame;

public class Study01_3 {
 
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
        frm.getContentPane().setLayout(null); //버튼의 위치와 크기를 자의로 조정하고 싶을경우 null로 넣는다.
        
        // 프레임이 보이도록 설정
        frm.setVisible(true);
        
        // ★ 컨텐츠 영역의 크기 표시
        System.out.println(frm.getContentPane().getSize()); //기본값이 폭 350, 높이 272로 표시된다.
        
    }
 
}