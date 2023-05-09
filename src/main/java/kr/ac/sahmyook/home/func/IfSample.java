package kr.ac.sahmyook.home.func;

import java.util.ArrayList;
import java.util.Scanner;

public class IfSample{
    Scanner sc = new Scanner(System.in);
    public void maxNumber(){
        System.out.print("정수 하나를 입력해주세요. : ");
        int num1 = sc.nextInt();
        System.out.print("정수 하나를 입력해주세요. : ");
        int num2 = sc.nextInt();

        System.out.println("두 수 중 큰 수는 "+ Math.max(num1, num2) + "입니다.");
    }
    public void minNumber() {
        System.out.print("정수 하나를 입력해주세요. : ");
        int num1 = sc.nextInt();
        System.out.print("정수 하나를 입력해주세요. : ");
        int num2 = sc.nextInt();

        System.out.println("두 수 중 작은 수는 "+ Math.min(num1, num2) + "입니다.");
    }

    public void threeMaxMin(){
        System.out.print("정수 하나를 입력해주세요. : ");
        int num1 = sc.nextInt();
        System.out.print("정수 하나를 입력해주세요. : ");
        int num2 = sc.nextInt();
        System.out.print("정수 하나를 입력해주세요. : ");
        int num3 = sc.nextInt();

        System.out.println("세 수 중 큰 수는 "+ Math.max(Math.max(num1, num2),num3) + "입니다.");
        System.out.println("세 수 중 작은 수는 "+ Math.min(Math.min(num1, num2),num3) + "입니다.");
    }
    public void checkEven(){
        System.out.print("정수 하나를 입력해주세요. : ");
        int num1 = sc.nextInt();

        System.out.println((num1 % 2 == 0)?"짝수 입니다.":"홀수 입니다.");
    }
    public void isPassFail(){

        Scanner sc = new Scanner(System.in);
        ArrayList<String> subjectList = new ArrayList<String>();

        System.out.print("국어 점수를 입력하세요 : ");
        int korean = sc.nextInt();
        System.out.print("영어 점수를 입력하세요 : ");
        int english = sc.nextInt();
        System.out.print("수학 점수를 입력하세요: ");
        int math = sc.nextInt();

        int average = (korean + english + math) / 3;

        if (average >= 60 && korean >= 40 && english >= 40 && math >= 40) {
            System.out.println("합격입니다!");
        } else {
            if (korean < 40) {
                subjectList.add("국어");                                // 해당 과목에 문제가 있을 경우 add
            }
            if (english < 40) {
                subjectList.add("영어");
            }
            if (math < 40) {
                subjectList.add("수학");
            }
            if (average < 60) {
                subjectList.add("평균");

            }
        }

        for (String s : subjectList){
            System.out.println(s+ " 점수 미달로 불합격 입니다.");        // array 안에 있는걸 하나씩 get
        }
    }
    public void scoreGrade(){
        System.out.print("점수를 입력하세요 : ");
        int score = sc.nextInt();

        if (score >= 90) {
            System.out.println("학점은 A 입니다.");
        } else if(score >= 80){
            System.out.println("학점은 B 입니다.");
        } else if(score >= 70){
            System.out.println("학점은 C 입니다.");
        } else if (score >= 60){
            System.out.println("학점은 D 입니다. 재수강 하세요.");
        } else {
            System.out.println("학점은 F 입니다.");
        }
    }
    public void checkPlusMinusZero(){
        System.out.print("점수를 입력하세요 : ");
        int check = sc.nextInt();

        if (check > 0){
            System.out.println("양수 입니다.");
        } else if(check < 0){
            System.out.println("음수 입니다.");
        } else {
            System.out.println("0 입니다.");                                                   // 0은 양수도 음수도 아님
        }
    }
    public void whatCaracter(){
        System.out.print("문자를 입력하세요 : ");
        char chars = sc.next().charAt(0);

        if (chars >= 'A' && chars <= 'Z') {
            System.out.println("대문자 입니다.");
        } else if (chars >= 'a' && chars <= 'z') {
            System.out.println("소문자 입니다.");
        } else if (Character.isDigit(chars)) {
            System.out.println("숫자 입니다.");
        } else {
            System.out.println("기타 문자입니다.");
        }
    }
}
