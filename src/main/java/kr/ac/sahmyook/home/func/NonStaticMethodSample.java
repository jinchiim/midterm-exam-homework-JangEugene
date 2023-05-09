package kr.ac.sahmyook.home.func;

import java.util.Random;
import java.util.Scanner;

public class NonStaticMethodSample {
    Scanner sc = new Scanner(System.in);
    public void testScanner(){

        System.out.print("실수 값을 입력하세요 : ");
        double dou = sc.nextDouble();

        System.out.print("정수 값을 입력하세요 : ");
        int num = sc.nextInt();

        System.out.print("문자열 값을 입력하세요 : ");
        sc.nextLine();
        String str = sc.nextLine();

        sc.next();

        System.out.print("문자 값을 입력하세요 : ");
        char chr = sc.next().charAt(0);

        System.out.print("논리 값을 입력하세요 : ");
        boolean bool = sc.nextBoolean();

        System.out.println("받은 값 : " + dou + "\n" + num + "\n" + str + "\n" + chr + "\n" + bool);
    }
    public void testRandom(){
        Random random = new Random();

        int iran = random.nextInt();
        double dran = random.nextDouble();

        System.out.println("랜덤 정수 : "+ iran + "\n 랜덤 실수 : " + dran);
    }
}
