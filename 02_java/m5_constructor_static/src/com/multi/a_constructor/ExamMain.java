package com.multi.a_constructor;

public class ExamMain {
    public static void main(String[] args) {

        Exam ex = new Exam("흰색", 3000, 5);
        Exam ex1 = new Exam("검정색", 2500, 5);

        System.out.println(ex);
        System.out.println(ex1);

//        public void test() {}
        // public void test() {} < 컴파일 에러 / 메소드의 시그니처가 동일한 경우

        // private void test() {} < 컴파일 에러 / 접근제어자는 메소드 시그니처에 해당하지 않는다.

        // public int test() { return 0; } < 컴파일 에러 / void 로 인해 return 이 없다


        // public void test(int num) {} < 파라미터 선언부가 달라서 가능

        // public void test(int num2) {} < 에러 / 매개변수의 이름은 메소드 시그니처에 해당되지않는다.

        // public void test(int num, int num2) {} < 매개변수의 갯수에 따른 오버로딩이 성립됨

        // public void test(int num, String str) {} < 매개변수의 타입에 따른 오버로딩이 성립

        // public void test(String str, int num) {} < 매개 변수의 순서에 따른 오버로딩이 성립
    }
}
