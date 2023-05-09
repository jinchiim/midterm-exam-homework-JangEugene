package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class ForSample {
    Scanner sc = new Scanner(System.in);
    public void sum1To10(){
        int sum = 0;

        for(int i = 1; i < 11; i++){
            sum += i;
        }
        System.out.println(sum);
    }
    public void sumEven1To100(){
        int sum = 0;

        for(int i = 0; i < 101; i += 2){                            // 짝수만 계산하기 위해 i += 2
            sum += i;
        }
        System.out.println(sum);
    }
    public void oneGugudan(){
        System.out.print("정수 하나를 입력해주세요. : ");
        int num = sc.nextInt();

        for(int i = 1; i < 10 ; i++ ){
            System.out.println(num + " x " + i + " = " + (num*i));
        }
    }
    public void sumMinToMax(){
        System.out.print("정수 하나를 입력해주세요. : ");
        int num = sc.nextInt();
        System.out.print("정수 하나를 입력해주세요. : ");
        int num2 = sc.nextInt();

        int sum = 0;

        for(int i = Math.min(num, num2) ; i <= Math.max(num, num2) ; i++){
            sum += i;
        }

        System.out.println(num + "에서 " + num2 + "까지의 합계는 " + sum + "입니다.");
    }
    public void printStar(){
        System.out.print("줄의 개수를 입력해주세요. : ");
        int num = sc.nextInt();
        System.out.print("칸 수를 입력해주세요. : ");
        int num2 = sc.nextInt();

        for (int i = 0; i < num; i++ ){
            for (int j = 0; j < num2; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void printNumberStar(){
        System.out.print("줄의 개수를 입력해주세요. : ");
        int num = sc.nextInt();
        System.out.print("칸 수를 입력해주세요. : ");
        int num2 = sc.nextInt();

        for (int i = 0; i < num; i++ ){
            for (int j = 0; j < num2; j++){
                System.out.print((j==i)?i:"*");                         // 삼항연산자 사용 j가 i와 같을 경우 i 출력
            }
            System.out.println();
        }
    }
    public void printTriangleStar() {                                   // 피라미드 별
        System.out.print("줄의 개수를 입력해주세요. : ");
        int num = sc.nextInt();

        if (num > 0) {
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {                                                        // 피라미드 음수일 경우
            for (int i = Math.abs(num); i > 0; i--) {
                for (int j = Math.abs(num)-i; j > 0; j--) {
                    System.out.print(" ");
                }
                for (int k = i * 2-1; k >0; k--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
        public void guguDan () {
            for (int i = 1; i < 10; i++) {
                for (int j = 1; j < 10; j++) {
                    System.out.println(i + " x " + j + " = " + (i * j));
                }
                System.out.println();
                System.out.println(i +"단을 시작합니다.");                 // 구분 하기 위해 출력
            }
        }
    }
