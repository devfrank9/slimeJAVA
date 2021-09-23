package slimegame.makeslimeExample.origin02Example;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Study01_1 {
    public static void main(String[] args) {

        //프레임 레이아웃은 프레임 영역, 컨텐츠 영역 두가지로 나뉜다.

        // 프레임 생성
        JFrame frm = new JFrame("슬라임 퇴치하기"); // 기존 자바에 저장된 JFrame을 불러와서 프레임 생성하는 문장.
                                                    // 생성자의 인수가 프레임의 제목이 된다.

        // 프레임 크기 설정
        frm.setSize(350, 300); // (가로값,세로값)

        // 프레임을 화면 가운데에 배치
        frm.setLocationRelativeTo(null); // 직역하면 '~에 관련하여 위치설정' 인수에 null 넣으면 가운데에 배치.

        // 프레임을 닫으면 메모리에서 제거 되도록 설정
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 이 코드가 없으면 x를 눌러도 종료가 되지 않는다.

        // 버튼 생성
        JButton btn1 = new JButton("슬라삐");

        // 프레임에 버튼 추가
        frm.add(btn1); // add는 추가대상을 인수로 받아 추가해주는 역할.
                        // frm이 붙은것으로 보아 해당 호출문은 프레임 영역에 붙이는 코드이다.
                        // 프레임에서 컨턴츠 영역을 가져다 붙이기 위해 다르게 써보자... Study01_2.java 를 열어보자.

        // 프레임을 보이도록 설정
        frm.setVisible(true); //없으면 화면의 프레임이 나타나지 않는다. (해당 코드는 항상 마지막에 위치)
    }

}
