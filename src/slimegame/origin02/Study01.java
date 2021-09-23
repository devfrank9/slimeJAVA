package slimegame.origin02;

import java.awt.Font;
import java.util.Enumeration;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

// 빈 슬라임 변수
public class Study01 {

    // 빈 슬라임 변수
    // static Slime s = null;

    // 슬라임과 인간 객체 생성
    static Slime s1 = new Slime("슬라삐");
    static Slime s2 = new Slime("슬라디");
    static Human h = new Human("알렉스");

    // 라벨 변수 선언
    static JLabel lbl, lbl2;

    public static void main(String[] args) {

        // 모든 글꼴 통일
        Enumeration<Object> keys = UIManager.getDefaults().keys();
        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            Object value = UIManager.get(key);
            if (value instanceof FontUIResource)
                UIManager.put(key, new FontUIResource("굴림", Font.PLAIN, 14));
        }

        // [start] 프레임 설정
        JFrame frm = new JFrame();
        frm.setTitle("슬라임 퇴치하기");
        frm.setSize(350, 350);
        frm.setLocationRelativeTo(null);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.getContentPane().setLayout(null);
        // [end]

        // 버튼 설정
        JButton btn1 = new JButton(s1.name);
        JButton btn2 = new JButton(s2.name);
        btn1.setBounds(30, 170, 122, 30);
        btn2.setBounds(182, 170, 122, 30);
        frm.getContentPane().add(btn1);
        frm.getContentPane().add(btn2);

        // 라벨 설정
        lbl = new JLabel();
        lbl.setBounds(30, 210, 274, 50);
        lbl.setText("게임을 시작합니다");
        lbl.setHorizontalAlignment(JLabel.CENTER); // 수평 가운데 정렬
        frm.getContentPane().add(lbl);

        // 라벨2 설정
        lbl2 = new JLabel();
        lbl2.setBounds(30, 240, 274, 50);
        lbl2.setText(h.name + "의 체력은 " + h.hp + "입니다.");
        lbl2.setHorizontalAlignment(JLabel.CENTER); // 수평 가운데 정렬
        frm.getContentPane().add(lbl2);

        // [start] 이미지 라벨 생성
        JLabel imgLbl = new JLabel();
        ImageIcon bsImg = new ImageIcon(Study01.class.getResource("/slimegame/origin02/img/slime(blue).png"));
        imgLbl.setIcon(bsImg);
        imgLbl.setBounds(30, 30, 122, 130);
        imgLbl.setHorizontalAlignment(JLabel.CENTER);
        frm.getContentPane().add(imgLbl);
        // [end]

        // [start] 이미지 라벨2 생성
        JLabel imgLbl2 = new JLabel();
        imgLbl2.setIcon(bsImg);
        imgLbl2.setBounds(182, 30, 122, 130);
        imgLbl2.setHorizontalAlignment(JLabel.CENTER);
        frm.getContentPane().add(imgLbl2);
        // [end]

        // 프레임이 보이도록 설정
        frm.setVisible(true);

        // 버튼을 눌렀을때
        btn1.addActionListener(event -> {
            // s = s1;
            battle(s1);
        });

        btn2.addActionListener(event -> {
            // s = s2;
            battle(s2);
        });

    }

    public static void battle(Slime s) {
        // 슬라임이 살아있을때만 공격
        if (s.hp < 1) {
            lbl.setText(s.name + "은 이미 죽어있다.");
        } else {
            h.attack(s);
            s.attack(h);
        }

        // 슬라임이 모두 죽으면 게임 클리어
        if (s1.hp < 1 && s2.hp < 1) {
            JOptionPane.showMessageDialog(lbl2, "Game Clear!");
            System.exit(0);
        }
    }

}