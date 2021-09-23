package slimegame.makeslimeExample.origin03Example;

public class Study02 {
    public static void main(String[] args) {

        // 생성자 오버로딩
        // 동일한 이름의 함수를 인수 구성만 달리해서 여러개 만들어서 사용하는 기법

        Horse h = new Horse(10); // 생성자의 인수로 정수값 하나만 넣어주면 첫번째 생성자가 호출되고

        Horse hh2 = new Horse(5, "마돌이"); // 정수값과 문자값을 같이 넣어주면 두번째 생성자가 호출됨
    }

}
