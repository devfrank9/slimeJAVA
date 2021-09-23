package study;

import javax.swing.JOptionPane;

public class IfAgeCountStudy_09 {
    public static void main(String[] args) {
        int year = Integer.parseInt(JOptionPane.showInputDialog("당신의 출생년도는?")); // 앞서 배운것. 인풋다이얼로그는 문자형이므로
                                                                                         // 자료형으로 형변환 해준다.
        int age = 2021 - year + 1; // 한국은 1살 더먹지롱
        JOptionPane.showMessageDialog(null, "당신의 나이는" + age + "세 입니다.");

        if (age >= 20) {
            JOptionPane.showMessageDialog(null, "성인이시군요.");
        } else if (age >= 15) {
            JOptionPane.showMessageDialog(null, "청소년이군.");
        } else {
            JOptionPane.showMessageDialog(null, "잼민이니?");
        }
    }
}
