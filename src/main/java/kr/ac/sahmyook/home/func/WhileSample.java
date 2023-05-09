package kr.ac.sahmyook.home.func;

import java.util.Scanner;
import java.util.regex.Pattern;

public class WhileSample {
    Scanner sc = new Scanner(System.in);
    public void printUniCode(){
        char ch = 1;            // 실행 위해 초기화

        while (ch != '0'){
            System.out.print("유니코드를 찾을 문자를 입력해주세요. 0을 누르면 종료됩니다. : ");
            ch = sc.next().charAt(0);

            if(ch != '0'){
                System.out.println(ch + "의 유니코드는 " + (int)ch + "입니다.");
            }
        }
    }
    public void sum1To100(){
        int end = 1;
        int sum = 0;

        while (end != 101){
            sum += end;
            end ++;
        }
        System.out.println("1부터 100까지의 합은 " + sum + "입니다.");
    }
    public void numberGame(){
        int guess = (int)(Math.random() * 100 + 1);

        while(true) {
            System.out.print("정수를 입력하세요 : ");

            int num = sc.nextInt();

            if (guess == num){
                System.out.println("정답을 맞추셨습니다.");
                break;															// 맞출 시 break
            } else if (num > guess) {	                                        // 시도 횟수 count
                System.out.println("입력하신 정수보다 작습니다.");
            } else if (num < guess) {
                System.out.println("입력하신 정수보다 큽니다.");
            }
        }
    }
    public void countCharacter(){
        System.out.print("길이를 찾을 문자열을 입력해주세요. : ");
        String text = sc.nextLine();

        System.out.println(text + "의 길이는 " + text.length() + "입니다.");
    }
    public void countInChar(){
        System.out.println("문자열 입력 : ");
        String str = sc.nextLine();

        while (true) {

            if (Pattern.matches("^[a-zA-Z]*$", str) == false) {                // 영문자 아닌 문자 확인 위해 Pattern 사용
                System.out.println("영문자가 아닌 문자가 포함되어 있습니다.");
                break;
            }

            System.out.print("문자 입력 : ");
            String cntStr = sc.next();

            int cnt = str.length() - str.replace(cntStr, "").length();    //  해당 문자는 ""로 replace 후 길이 비교
            System.out.println("포함된 갯수 : " + cnt + "개");
            break;
        }
        }
}
