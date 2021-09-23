package slimegame.makeslimeExample.origin03Example;

public class Horse_1 {

    Horse_1(int i) {
        this(i,"마순이"); // 생성자 속 같은 클래스의 다른 생성자를 호출하고 싶을때 this() 사용
    }

    Horse_1(int i, String str) {
        System.out.println(i + "킬로그램의 " + str + "라는 이름의 말이 탄생했습니다.");
        //첫번째 생성자의 내용을 보니 메인함수에서 받아온 정수값과 
        //"마순이"라는 문자값을 이용해서 두번째 생성자를 호출
        //따라서 최종적으로 horse클래스의 15행이 실행
    }

}
