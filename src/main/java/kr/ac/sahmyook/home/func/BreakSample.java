package kr.ac.sahmyook.home.func;

public class BreakSample {
    public void sumBreak(){
        int sum = 0;
        int num = 1;

        while (true){
            sum += num;
            num ++;
            if (num > 101){                                                // for문으로 101이 될때까지 sum
                System.out.println("1부터 100까지의 합계는 "+ sum + "입니다.");
                break;
            }
        }
    }
    public void guguDanBreak(){
        for (int i = 1; i < 10; i++){
            for (int j = 1; j < 10; j++){
                if(j == 5){                                                // j가 5일 때 continue
                    break;
                }
                System.out.println(i + " x " + j + " = " + (i*j));
            }
        }
    }
}
