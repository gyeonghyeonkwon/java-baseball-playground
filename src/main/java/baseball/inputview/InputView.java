package baseball.inputview;

import baseball.randomNumber.RandomNumber;

import javax.xml.transform.Source;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputView {

    private final Scanner sc;
    private int inputValue;

    public InputView() {
        this.sc = new Scanner(System.in);
    }

    protected int getScanner() {
        int value;
        while (true) {
            try {
                value = sc.nextInt();
                break;
            }catch (InputMismatchException e) { // 정수가 아닌 문자열이 입력 되었을때
                System.out.print("잘못 입력하셨습니다. 숫자를 다시 입력해 주세요: ");
                sc.nextLine();
            }
        }
        return value;
    }

    public int[] getArrayInputValue() {
        int[] inputArrayValue;
        int count;
        do {
            inputArrayValue = arrayInputValue(); //입력한 숫자 배열 반환
            count = duplicateValueCount(inputArrayValue); // 중복 입력 값
            if (inputArrayValue.length != 3 || count > 0) {
                System.out.println("입력하신 숫자가 중복되었거나 세자리 정수가 아닙니다. 다시 입력해주세요.");
            }
        } while (inputArrayValue.length != 3 || count > 0);
        return inputArrayValue;
    }

    private int[] arrayInputValue() {
        System.out.print("숫자를 입력해주세요: ");
        this.inputValue = getScanner();
        String[] arrayStr = intConvertArray();
        int[] arrayValue = new int[arrayStr.length];

        if (arrayValue.length == 3) { // 입력된 정수가 세자리 인경우
            for (int i = 0; i < arrayValue.length; i++) {
                arrayValue[i] = Integer.parseInt(arrayStr[i]);
            }
            return arrayValue;
        }
        return arrayValue; //세자리가 아닌 경우에 배열의 인덱스 값이 0
    }

    //입력값으로 받은 정수를 세자리수로 자른다.
    private String[] intConvertArray() {
        return String.valueOf(this.inputValue).split("");
    }

    //입력한 숫자 중에 중복된 숫자가 존재하면 count
    private int duplicateValueCount(int[] inputArrayValue) {
        int count = 0;
        for (int i = 0; i < inputArrayValue.length; i++) {
            for (int j = i + 1; j < inputArrayValue.length; j++) {
                if (inputArrayValue[i] == inputArrayValue[j]) {
                    count++;
                    return count;
                }
            }
        }
        return count;
    }
}
