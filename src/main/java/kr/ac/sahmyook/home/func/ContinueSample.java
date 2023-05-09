package kr.ac.sahmyook.home.func;

public class ContinueSample {
    public void sumJumpThree(){
        int sum = 0;

        for (int i = 1; i < 101; i++){
            if (i % 3 == 0){                                                        // 3의 배수를 continue
                continue;
            }
            sum += i;
        }
        System.out.println("1부터 100까지 3의 배수를 뺀 값은 "+ sum + "입니다.");
    }
    public void rowColJump(){
        for (int i = 1; i < 4; i++){
            for (int j = 1; j < 6; j++){
                if (i == 1 && j == 3 || i == 1 && j == 4 || i == 1 && j == 5){      // 요구사항에 맞는 경우 continue
                    continue;
                }
                System.out.print(i + "행" + " ");
            }
            System.out.println();
        }
    }
}
