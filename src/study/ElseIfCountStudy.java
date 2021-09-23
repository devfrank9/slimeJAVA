package study;

import javax.swing.JOptionPane;

public class ElseIfCountStudy {
    public static void main(String[] args) {
        int year = Integer.parseInt(JOptionPane.showInputDialog(null,"당신의 출생연도를 입력하세요"));
        int age = 2021 - year + 1;
        JOptionPane.showMessageDialog(null,"당신의 나이는"+age+"세 입니다.");

        if(age >=8 && age<=13){ //and 문, 조건 둘 중 모두가 맞아야 true 출력된다.
            JOptionPane.showMessageDialog(null,"초등학생 입니다.");
        }
        if(age <=8 || age>= 60){ //or 문, 조건 둘 중 하나라도 맞으면 true 출력된다.
            JOptionPane.showMessageDialog(null,"놀이기구를 탈수 없습니다.");
        }
    }
    
}
