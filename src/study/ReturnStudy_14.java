package study;

import javax.swing.JOptionPane;

public class ReturnStudy_14 {
    public static void main(String[] args) {
        String back_pack = teacher();
        JOptionPane.showMessageDialog(null,back_pack);
    }
    public static String teacher(){
        return "homework";

        //지금까지와는 다르게 public static에서 void가 빠지고 String이 들어갔다.
        //왜냐하면, 이 문법은 pulic static (리턴할 자료형) (함수이름) 의 형식이기 때문에
        //void가 무조건 필요한것이 아니다.
        //void의 뜻은 단지 리턴값(반환값)이 없다는 것이다.
        //리턴의 유무에 따른 차이점을 보기위해
        //ReturnStudy_14_1.java 를 확인해보자.
    }
}
