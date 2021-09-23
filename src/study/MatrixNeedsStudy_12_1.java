package study;

import javax.swing.JOptionPane;

public class MatrixNeedsStudy_12_1 {
    public static void main(String[] args) {
        show();
        vingle();
        years();
    }
    public static void show(){
        System.out.println("안녕");
    }
    public static void vingle(){
        for(int i=0; i<=3; i++){
            JOptionPane.showMessageDialog(null,"빙글");
        }
    }
    public static void years(){
        int year = Integer.parseInt(JOptionPane.showInputDialog("당신의 출생년도는?"));
        int age = 2021 - year + 1;
        JOptionPane.showMessageDialog(null, "당신의 나이는" + age + "세 입니다.");
    }
    
}
