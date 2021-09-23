package study;

import javax.swing.JOptionPane;

public class InputBoxStudy_07 {
    public static void main(String[] args) {
        JOptionPane.showInputDialog("숫자를 입력하세요."); // showMessageDialog와 달리 showInputDialog는 입력창이 나온다.

        // int num = JOptionPane.showInputDialog("숫자를 입력하셈."); //인풋박스는 정수형을 인식못한다.
        String num = JOptionPane.showInputDialog("숫자를 입력하셈."); // 인풋박스는 문자형만 인식한다.
        JOptionPane.showMessageDialog(null, num + 1); // 나타내는 메세지엔 입력한 num값에 +1을 한 값이 출력된다.
                                                      // 하지만 앞서 num은 문자형으로 들어갔으므로 계산이 되지않는다,,,

        // 형변환을 해보자
        String num1 = JOptionPane.showInputDialog("숫자 넣어라.");
        int num2 = Integer.valueOf(num1);   //앞서 배운 형변환을 활용한다. 다르게 parseInt 사용가능.
        JOptionPane.showMessageDialog(null, num2 + 1); //num1이 숫자형인 num2로 변환되어 정상적인 계산이 되었다.

        //형변환을 한줄로 표현해보자면....
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("숫자 넣."));
        JOptionPane.showMessageDialog(null, num3 + 5);
    }

}
