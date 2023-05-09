package kr.ac.sahmyook.home.func;

public class StaticMethodSample {

    public void testMathRandom(){
        System.out.println("임의의 정수 : "+ (int) (Math.random() * 45) + 1);
    }
    public void testMethAbs(){
        System.out.println("12.77의 절대값 : " + Math.abs(-12.77));
    }
    public void testMathMax(){
        System.out.println("120과 54 중 더 큰 값 :" + Math.max(120, 54));
    }

}
