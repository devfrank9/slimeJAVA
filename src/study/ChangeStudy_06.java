package study;

public class ChangeStudy_06 {
    public static void main(String[] args) {
        int a = 3;
        System.out.println(a); //int(정수형)을 사용하여 숫자 3이 출력 되었음을 확인

        String b = "3";
        System.out.println(b + 2); //char(자료형)이 붙어서 32라고 출력 되었음을 확인 (char)3 + (숫자)2 이므로,,,

        String c = "4";
        int d = Integer.valueOf(c); //문자형 c를 정수형 d로 변환한다.
        System.out.println(d + 2);

        String e = "5";
        int f = Integer.parseInt(e); //위의 valueOf와 같은 역할을 한다.
        System.out.println(f + 3);

        //반대로 문자형을 정수형으로 바꿔보자.
        int q = 6;
        String w = String.valueOf(q);
        System.out.println(w + 1);
    }
}
