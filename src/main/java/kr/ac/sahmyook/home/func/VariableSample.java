package kr.ac.sahmyook.home.func;

import java.util.ArrayList;
import java.util.Scanner;

public class VariableSample {
    public void myprofile(){              // 내 신상정보 변수에 담아 저장 후 출력하기
        String name = "장유진";
        int age = 25;
        String number = "010-****-****";

        System.out.println("사원의 이름은 " + name + "\n 사원의 나이는 " + age + "\n 사원의 번호는 " + number);
    }
    public void empInformation(){           // 사원정보를 키보드로 받아 입력하기
        Scanner sc = new Scanner(System.in);

        System.out.print("사원의 이름을 입력해주세요 : ");
        String name = sc.nextLine();

        System.out.print("사원의 나이를 입력해주세요 : ");
        int age = sc.nextInt();


        System.out.println("사원의 이름은 " + name + "\n 사원의 나이는 " + age );
    }
}
