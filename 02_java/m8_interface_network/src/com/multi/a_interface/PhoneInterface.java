package com.multi.a_interface;

public interface PhoneInterface {
//인터페이스

    // 추상(미완성 메소드)와 모든 클래스에서 공용으로 사용 할 상수들을 한데 묶어놓은 추상전용 클래스를 인터페이스라고한다.
    // 클래스로부터 상속 받을 수 없고
    // 같은 인터페이스끼리만 상속이 가능 (extends)

    // 인터페이스 특징
    // 1. 모든 인터페이스의 메소드는 묵시적으로 public abstract 이다.
    // 2. 필드는 묵시적으로 public static final 이다.
    // 3. 객체 생성은 하지 못하지만, 참조형 타입으로서는 사용 가능하다.

    // 장점
    // 1. 개발시간을 단축 할  수있다.
    // 2. 변경에 유리한 유연한 설계가 가능하다.
    // 3. 표준화가 가능하다.

    // 추상클래스와 인터페이스의 비교
    // 1. 추상클래스는 단일 상속만 가능하지만 인터페이스는 다중 상속이 가능하다.
    // 2. 추상클래스 구현시에는 extends 키워드를 사용하지만. 인터페이스 구현시에는 implements 키워드를 사용한다.
    // 3. 추상클래스는 abstract 메소드가 0개 이상 존재하지만, 인터페이스는 모든 메소드가 abstract이다.
    // 4. 추상클래스는 명시적으로 abstract를 사용해야 하지만, 인터페이스는 묵시적으로 abstract이다.
    // 5. 추상클래스는 일반 필드를 가질 수 있지만, 인터페이스는 상수필드, 추상메소드만 가질 수 있다.
//    int x; < 변수사용이 불가능 함
    public final String CON = "전화기 협회"; // < 상수만 허용된다

    //추상클래스 -> 일반멤버(변수 + 메소드)  + 추상메소드
    //인터페이스 -> only 상수필드 + 추상메소드

    public abstract void call();
    /* public abstract  < 생략가능 */void internet();
    public abstract void text();
}
