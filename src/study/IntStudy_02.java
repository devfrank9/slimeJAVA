package study;
public class IntStudy_02 {
    public static void main(String[] args) {
        int a; // 자료형 (변수의 이름) 의 형태로 선언
        a = 1; // 변수에 1을 선언 (초기화)
        System.out.println(a); // 변수에 저장된 값을 출력한다
        System.out.println("a"); // 위와 다르게 변수에 저장된 값이 아닌, 알파벳 a를 출력하고 싶을때 ""를 넣어준다.

        int b = 2; // 위 형태와 다르게 변수이름과 변수에 저장할 값을 동시에 선언하는 방법

        int c = 3;
        c = 5; // 윗줄에서 동시선언 했지만, 후에 5라는 값을 넣어 3이 삭제되고 5가 입력되었다.

        int d = 8;
        d++; // d의 값을 1증가시킨다.
        System.out.println(d); // 9가 출력되었다.

        d--; // d의 값을 1감소시킨다.
        System.out.println(d); // 7이 출력되었다.

        // 연산자
        int q = 1;
        int w = 2;
        System.out.println(q + w); // 변수 q 와 w를 더한다
        System.out.println(q - w); // 변수 q 와 w를 뺀다
        System.out.println(q * w); // 변수 q 와 w를 곱한다
        System.out.println(q / w); // 변수 q 와 w를 나눈다
    }
}