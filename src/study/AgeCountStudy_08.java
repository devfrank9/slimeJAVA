package study;

import javax.swing.JOptionPane;

public class AgeCountStudy_08 {
    public static void main(String[] args) {
        int year = Integer.parseInt(JOptionPane.showInputDialog("당신의 출생년도는?")); //앞서 배운것. 인풋다이얼로그는 문자형이므로
                                                                                        //자료형으로 형변환 해준다.
        int age = 2021 - year + 1;      //한국은 1살 더먹지롱
        JOptionPane.showMessageDialog(null, "당신의 나이는" + age + "세 입니다.");
    }

}
