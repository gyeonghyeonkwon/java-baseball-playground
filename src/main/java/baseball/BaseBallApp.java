package baseball;

import baseball.baseball.Baseball;
import baseball.randomNumber.RandomNumber;

import java.util.Arrays;
import java.util.Scanner;

public class BaseBallApp {
    public void run() {
        RandomNumber random = new RandomNumber();
        Baseball baseball = new Baseball();
        int strike = baseball.getStrike();
        Scanner sc = new Scanner(System.in);
        while (true) {
            Integer[] array = random.getArrayNumber();
            System.out.print("숫자를 입력해주세요: ");
            int inputNumber = sc.nextInt();
            int[] arrayInputNumber = arrayInput(inputNumber);
            System.out.println(Arrays.toString(array));

            for (int i = 0; i < arrayInputNumber.length; i++) {
                int index = 0;
                if (array[i] == arrayInputNumber[index] && i == index){
                    strike++;
                    System.out.println(strike + "스트라이크");
                }
            }
            if (inputNumber == 1) {
                System.out.println("게임을 다시 시작합니다.");
                continue;
            }
            if (arrayInputNumber.length != 3) {
                System.out.println("숫자 세 자리수 입력 해주세요.");
                continue;
            }
            if (inputNumber == 2) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }

        }
    }

   public int[] arrayInput(int inputNumber) {
            String[] arrayStr = String.valueOf(inputNumber).split("");
            int[] arrayNum = new int[arrayStr.length];
            for (int i = 0; i < arrayStr.length; i++) {
                arrayNum[i] = Integer.parseInt(arrayStr[i]);
            }
            return arrayNum;
    }
}

