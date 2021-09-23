package study;

import javax.swing.JOptionPane;

public class ReturnStudy_14_1 {
    public static void main(String[] args) {
        teacher();
    }
    public static void teacher(){
        JOptionPane.showMessageDialog(null,"homework");
    }

    //void 함수만을 이용하면 이렇게 간결해지기도 한다.
    //하지만 자유롭게 어딘가에 쓰게하기위해
    //void 함수를 사용하지 않기도한다.
    //왜냐하면 메세지박스를 띄울때도 있고, 안띄울때도 있기 때문이다.
    //그러기 위해 리턴 함수를 만들어 그 함수 내에선 계산만 하도록 하는 경우가 있다.
    //ReturnStudy_14_2를 참조해보자.
    
}
