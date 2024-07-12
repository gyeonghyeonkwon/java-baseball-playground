package baseball;

import baseball.randomNumber.RandomNumber;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        RandomNumber random = new RandomNumber();
        Set<Integer> test = random.getArrayNumber();
        while(true) {
            System.out.println("숫자를 입력해주세요: ");
            Scanner sc = new Scanner(System.in);
            int inputNumber = sc.nextInt();

            if(inputNumber == 2) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }
        }
    }

}
