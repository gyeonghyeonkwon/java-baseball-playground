package baseball;

import baseball.baseball.Baseball;
import baseball.randomNumber.RandomNumber;

import java.util.Scanner;

public class BaseBallApp {
   public void run() {
        RandomNumber random = new RandomNumber();
        Integer[] array = random.getArrayNumber();
        Baseball baseball = new Baseball();

        while (true) {
            System.out.println("숫자를 입력해주세요: ");
            Scanner sc = new Scanner(System.in);
            int inputNumber = sc.nextInt();
            int[] arrayInputNumber = arrayInput(inputNumber);

            if (arrayInputNumber.length != 3) {
                System.out.println("숫자 세 자리수 입력 해주세요.");
            }
            if (inputNumber == 2) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }
        }
    }
    int[] arrayInput(int inputNumber) {
        String[] arrayStr = String.valueOf(inputNumber).split("");
        int[] arrayNum = new int[arrayStr.length];
        for (int i = 0; i < arrayStr.length; i++) {
            arrayNum[i] = Integer.parseInt(arrayStr[i]);
        }
        return arrayNum;
    }
}

