package com.multi.lamda.a_basic.functional;

@FunctionalInterface
public interface A_FunctionalInterface {
    // 매개변수와 반환값이 없는 추상메소드
    public void method();

    // public void method1(); <- 두가지 이상의 추상 메소드가 존재하면 @FunctionalInterface 이 체크해줌
    //
//
//public interface A_FuncInterface {
//    void printIt(String text);
//
//    default public void printUtf8To(String text){//디폴트메소드
//
//    }
//
//    static void printItToSystemOut(String text) {//정적메소드
//        System.out.println(text);
//    }
//}
}
