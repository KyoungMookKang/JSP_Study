package com.multi.a_constructor;

public class Television {

    private int ch;
    private int vol;
    private boolean onOff;
    public static int count; // 다른데서 사용할 경우 public 사용

    /* 생성자 작성 방법
     * [표현식]
     * 접근제한자 클래스명(매개변수) {
     *     인스턴스 생성 시점에 수행할 명령 기술 (주로 필드를 초기화)
     *     this.필드명 = 매개변수;		//설정자(setter) 여러 개의 기능을 한 번의 호출로 수행할 수 있다.
     * }
     *
     * 생성자 작성 방법은 메소드를 작성하는 방법과 매우 유사하다. 하지만 두 가지 사항을 조심해야 한다.
     * 1. 생성자 메소드는 반드시 클래스의 이름과 동일해야 한다. (대/소문자까지 같아야 함)
     * 2. 생성자 메소드는 반환형을 작성하지 않는다. (작성하는 경우 생성자가 아닌 메소드로 인식한다.)
     * */

    /* 기본생성자(매개변수 없는 생성자)와 매개변수 있는 생성자
     * 기본생성자는 자바 Compiler가 자동으로 추가해주는 구문이지만 명시적으로 작성할 수 도 있다.
     * 매개변수 있는 생성자가 한 개라도 존재하는 경우 기본생성자를 자동으로 추가해주지 않기 때문에
     * 기본생성자가 필요한 경우에는 반드시 명시적으로 작성해 주어야 한다.
     * */

    public Television(){
        super();
        count++;
    }

    public Television(int ch, int vol, boolean onOff){
        this.ch = ch;
        this.vol = vol;
        this.onOff = onOff;

        count++;
    }

    public int getCh() {
        return ch;
    }

    public boolean isOnOff() {
        return onOff;
    }
    public void on() {
        System.out.println("코드를 끼다.");
        System.out.println("켜지다.");
        onOff = true;
    }
    public void off() {
        System.out.println("끄다.");
        System.out.println("코드를 뽑다.");
        onOff = false;
    }

    public void setOnOff(boolean onOff) {
        this.onOff = onOff;
    }

    public void setCh(int ch) {
        this.ch = ch;
    }

    public int getVol() {
        return vol;
    }

    public void setVol(int vol) {
        this.vol = vol;
    }

    @Override
    public String toString() {
        return "Television{" +
                "ch=" + ch +
                ", vol=" + vol +
                ", onOff=" + onOff +
                '}';
    }
}
