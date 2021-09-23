package slimegame.origin03;

// Study01.java
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Enumeration;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class Study01 {

    // * 전역 변수 선언
    static JLabel lbl, lbl2, imgLbl, imgLbl2;
    static ImageIcon bsImg, rsImg;
    static JFrame frm;

    // 슬라임과 인간 객체 생성
    static BlueSlime bs1 = new BlueSlime("슬라삐");
    static RedSlime rs1 = new RedSlime("슬라디");
    static Human h = new Human("알렉스");

    // 버튼 객체 생성
    static JButton btn1 = new JButton(bs1.name);
    static JButton btn2 = new JButton(rs1.name);

    public static void main(String[] args) {

        // [start] 디자인 코드

        // 모든 글꼴 통일
        Enumeration<Object> keys = UIManager.getDefaults().keys();
        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            Object value = UIManager.get(key);
            if (value instanceof FontUIResource)
                UIManager.put(key, new FontUIResource("굴림", Font.PLAIN, 14));
        }

        // [start] 프레임 설정
        frm = new JFrame();
        frm.setTitle("슬라임 퇴치하기"); // 프레임 이름 설정 및 표시
        frm.setSize(350, 350); // (폭, 높이)
        frm.setLocationRelativeTo(null); // 프레임 위치. null로 하면 중간으로 위치한다.
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임의 x를 눌렀을때 종료가 될수있도록 한다.
        frm.getContentPane().setLayout(null);
        // [end] 프레임 설정

        // [start] ★ 버튼 설정
        btn1.setBounds(30, 170, 122, 30); // 버튼 크기. 프레임 왼쪽 상단으로 부터 (좌측 거리, 상단거리, 길이, 높이)
        btn2.setBounds(182, 170, 122, 30);
        frm.getContentPane().add(btn1); // 컨텐츠부에 삽입.
        frm.getContentPane().add(btn2);
        // [end] 버튼 설정

        // 라벨 설정
        lbl = new JLabel(); // print 처럼 보이는 코드.
        lbl.setBounds(30, 210, 274, 50); // setBounds 는 모두 (좌측 거리, 상단거리, 길이, 높이)
        lbl.setText("게임을 시작합니다"); // 해당 라벨에서 출력될 문자
        lbl.setHorizontalAlignment(JLabel.CENTER); // 수평 가운데 정렬
        frm.getContentPane().add(lbl); // 컨텐츠 영역에 정의한 lbl을 삽입

        // 라벨2 설정
        lbl2 = new JLabel();
        lbl2.setBounds(30, 240, 274, 50); // 좌표값으로 보이듯이 lbl1 아래에 나타나게 만들었다.
        lbl2.setText(h.name + "의 체력은 " + h.hp + "입니다");
        lbl2.setHorizontalAlignment(JLabel.CENTER); // 수평 가운데 정렬
        frm.getContentPane().add(lbl2);

        // [start] 이미지 라벨 생성
        imgLbl = new JLabel(); // 상단 ImageIcon 으로 할당한 imlLbl
        bsImg = new ImageIcon(Study01.class.getResource("/slimegame/origin03/img/slime(blue).png")); // 패키지이름/img폴더이름/파일명.확장자
        imgLbl.setIcon(bsImg);
        imgLbl.setBounds(30, 30, 122, 130);
        imgLbl.setHorizontalAlignment(JLabel.CENTER);
        frm.getContentPane().add(imgLbl);
        // [end]

        // [start] 이미지 라벨2 생성
        imgLbl2 = new JLabel();
        rsImg = new ImageIcon(Study01.class.getResource("/slimegame/origin03/img/slime(red).png"));
        imgLbl2.setIcon(rsImg);
        imgLbl2.setBounds(182, 30, 122, 130);
        imgLbl2.setHorizontalAlignment(JLabel.CENTER);
        frm.getContentPane().add(imgLbl2);
        // [end]

        // 프레임이 보이도록 설정
        frm.setVisible(true); // 프레임 설정시 필수로 넣어줘야한다.

        // [end]

        // ★ 버튼을 눌렀을때
        btn1.addActionListener(event -> {

            battle(bs1); // battle 호출 (코드 아래에 선언)

        });

        btn2.addActionListener(event -> {

            battle(rs1);

        });

    }

    public static void battle(Slime s) { // Slime 클래스 소환

        int randomNum = (int) (Math.random() * 3);
        JLabel targetSlime;

        if (randomNum == 0){
            lbl.setText(h.name + "의 공격은 빗나갔다.");

            if (s==bs1){
                targetSlime=imgLbl;
            } else {
                targetSlime=imgLbl2;
            }

            targetSlime.setBounds(targetSlime.getX()+20,30,122,130);

            new Timer().schedule(new TimerTask() {

                @Override
                public void run() {

                    targetSlime.setBounds(targetSlime.getX()-20,30, 122, 130);
                }
            },500);

        }else {
            h.attack(s);
        }

            if (s instanceof BlueSlime) { // instanceof 는 변수 이름 식의 == 와 같다.

                randomNum = (int) (Math.random() * 3);

                if (randomNum == 0) {

                    ((BlueSlime) s).heal(s); // BlueSlime은 공격 실행시 회복 명령을 수행한다.

                } else {
                    s.attack(h);
                }

            } else { // 레드슬라임일 경우

                randomNum = (int) (Math.random() * 3);

                if (randomNum == 0) {

                    ((RedSlime) s).attack2(h);

                } else {

                    s.attack(h);

                }
            }

            // ★ 슬라임이 모두 죽으면 게임 클리어
            if (bs1.hp < 1 && rs1.hp < 1) {

                JOptionPane.showMessageDialog(lbl2, "Game Clear!");
                System.exit(0);
            }

        }
}