package study;

import javax.swing.JOptionPane;

public class MatrixNeedsStudy_12 {
    public static void main(String[] args) {
        System.out.println("안녕");
        for(int i = 0; i <=3 ;i++){
            JOptionPane.showMessageDialog(null,"빙글");
        }

        int year = Integer.parseInt(JOptionPane.showInputDialog("당신의 출생년도는?"));
        int age = 2019 - year +1;
        JOptionPane.showMessageDialog(null,"당신의 나이는" + age + "세 입니다.");

        //위의 main함수에 모두 할당 된 것을 함수를 만들어 정리해보자.
        //MatrixNeedsStudy_12_1.java에 해보자
    }
}