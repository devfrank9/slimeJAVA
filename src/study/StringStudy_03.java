package study;
public class StringStudy_03 {
    public static void main(String[] args) {
        String insa = "안녕"; //int는 숫자의 자료형. String은 문자의 자료형. 변수에 문자를 넣기위해 String선언.
        System.out.println(insa);

        String java = "자바";
        System.out.println(insa+java); //String 끼리 +연산자를 붙이면 붙어서 출력된다. (결과:안녕자바)
                                        //'안녕 자바'로 중간 띄어쓰기 하고싶으면 insa = "안녕 " 이렇게 안녕 뒤에 띄어쓰기 넣어도 된다.
        
        int year =2021;
        System.out.println(insa+year+java); //이런식으로 문자 변수가 들어있는 중간에 숫자 변수를 넣을수도 있다.
    }
}