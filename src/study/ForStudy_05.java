package study;

import javax.swing.JOptionPane;
public class ForStudy_05 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {       //for(자료형변수 = 시작값; 변수 < 끝값; 증가값)
            JOptionPane.showMessageDialog(null, "빙글");
        }
        
        //example: 5부터 1까지 점점 감소하는 메세지
        for (int i = 1; i <= 5; i--) {
            JOptionPane.showMessageDialog(null, "빙글");
        }
    }
}
