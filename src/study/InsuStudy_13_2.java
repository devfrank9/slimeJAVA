package study;

import javax.swing.JOptionPane;

public class InsuStudy_13_2 {
    public static void main(String[] args) {
        year(1994);
    }
    public static void year(int a){
        int age = 2021 - a +1;
        JOptionPane.showMessageDialog(null,"당신의 나이는 " + age + "세 입니다.");
    }
    
}
