package study;

public class InsuReturnStudy_15 {
    public static void main(String[] args) {
        System.out.println(circle(5));
    }

    public static Double circle(int rad) { //밑에 파이(3.14)를 곱할 것이기 때문에 Double을 선언했다.
        return rad * rad * 3.14;
    }

}
