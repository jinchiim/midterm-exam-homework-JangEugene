package kr.ac.sahmyook.home.func;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class DoWhileSample {
    Scanner sc = new Scanner(System.in);
    public void addDashToken(){
        System.out.print("문자열을 입력해주세요 : ");
        StringBuffer str = new StringBuffer(sc.nextLine());

        for(int i=1; i < str.length(); i+=2){               // 짝수 인덱스 번호에 "-"를 insert
            str.insert(i, "-");
        }
        System.out.println(str);
    }
    public void burgerKingMenu(){
        String[] menu = {"킹치킨 버거" , "와퍼", "주니어 와퍼", "통다리 버거"};
        int[] price = {5000, 6300, 6600, 5700};                         // 인덱스 번호로 접근 하기 위해 리스트 생성
        ArrayList<Integer> orderList = new ArrayList<Integer>();              // add 사용하기 위해 ArrayList 생성
        int sum = 0;

        do {
            System.out.println("================= 버거킹 주문 메뉴=================");
            System.out.println("1. 킹치킨 버거");
            System.out.println("2. 와퍼 ");
            System.out.println("3. 주니어 와퍼");
            System.out.println("4. 단종된 통다리 버거");
            System.out.println("5. 주문 완료");
            System.out.print("메뉴 주문 : ");

            int num = sc.nextInt();

            if(num == 5){                                               // 5번을 선택 한 경우 계산
                for(int i : orderList){
                    sum += i;
                }
                System.out.println(sum + "원 지불이 필요합니다.");
                break;
            }else{
                System.out.println(menu[num-1] + "을 장바구니에 넣었습니다.");
                orderList.add(price[num-1]);
            }
        }while (true);

    }
    public void isStringAlphabet() {
        do {
            System.out.print("전부 영어인 문자열을 입력해주세요. : ");
            String str = sc.nextLine();

            if (Pattern.matches("^[a-zA-Z]*$", str)) {                // 영문자 아닌 문자 확인 위해 Pattern 사용
                System.out.println("모든 문자가 영문자 입니다.");
            } else {
                System.out.println("모든 문자가 영문자가 아닙니다.");
            }
            break;
        } while (true);
    }
}
