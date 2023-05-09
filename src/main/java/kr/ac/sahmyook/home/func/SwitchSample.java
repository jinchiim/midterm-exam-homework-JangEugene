package kr.ac.sahmyook.home.func;

import java.util.Arrays;
import java.util.Scanner;

public class SwitchSample {
    Scanner sc = new Scanner(System.in);
    public void calculator(){
        System.out.print("첫번째 정수를 입력해주세요. : ");
        int num1 = sc.nextInt();
        System.out.print("첫번째 정수 : " + num1);

        System.out.print("두번째 정수를 입력해주세요. : ");
        int num2 = sc.nextInt();
        System.out.println("두번째 정수 : " + num2);

        System.out.print("연산 기호를 입력해주세요. (+, -, *, /, %) : ");
        String op = sc.next();

        String[] charList = {"+", "-","/","*","%"};

        if (!Arrays.asList(charList).contains(op)){		// 해당 연산자가 array에 있는지 확인
            System.out.println("입력하신 연산은 없습니다. 프로그램을 종료합니다.");
        } else {
            switch (op) {
                case "+":
                    System.out.println(num1 + "+" + num2 + "=" + (num1 + num2) );
                    break;
                case "-":
                    System.out.println(num1 + "-" + num2 + "=" + (num1 - num2) );
                    break;
                case "*":
                    System.out.println(num1 + "*" + num2 + "=" + (num1 * num2) );
                    break;
                case "/":
                    System.out.println(num1 + "/" + num2 + "=" + (num1 / num2) );
                    break;
                case "%":
                    System.out.println(num1 + "%" + num2 + "=" + (num1 % num2));
                    break;
            }
        }
    }
    public void fruitPrice(){
        String[] foodArray = {"사과", "바나나", "복숭아", "키위"};
        System.out.println("-- 상품 가격 --\n 사과 : 1000원 \n 바나나 : 3000원 \n 복숭아 : 2000원 \n 키위 : 5000원");

        System.out.println("과일 이름을 입력하세요. : ");
        Scanner sc = new Scanner(System.in);
        String fruit = sc.nextLine();


        if (!Arrays.asList(foodArray).contains(fruit)){	// 해당 과일이 있는지 확인
            System.out.println("준비된 상품이 없습니다.");
        } else {
            int price = 0;

            switch (fruit) {
                case "사과":
                    price = 1000;
                    break;
                case "바나나":
                    price = 3000;
                    break;
                case "복숭아":
                    price = 2000;
                    break;
                case "키위":
                    price = 5000;
                    break;
            }
            System.out.println(fruit + "의 가격은 "+ price);
        }
    }
}
