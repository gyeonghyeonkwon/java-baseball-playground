package baseball.inputview;

import javax.xml.transform.Source;
import java.util.Scanner;

public class InputView {

    private Scanner sc;
    private int inputValue ;

    public InputView() {
        this.sc = new Scanner(System.in);
    }
    protected int getScanner () {
        return sc.nextInt();
    }

    public int[] getArrayInputValue() {
        System.out.print("숫자를 입력해주세요: ");
        this.inputValue = getScanner();
        int[] inputArrayValue = arrayInputValue();
        int count = duplicateValue(inputArrayValue); //중복 검사

        while (count > 0) {
            System.out.println("입력하신 세자리의 정수 값이 중복이 발생합니다.");
            System.out.print("숫자를 다시입력해주세요: ");
            this.inputValue = getScanner();
            inputArrayValue = arrayInputValue();
            count = duplicateValue(inputArrayValue);
        }
        /**
         *  숫자가 3개가 될 때 까지 반복 순회
         *  숫자가 1개 인 경우  숫자가 1 이나 2 면 반환
         */
        while (inputArrayValue.length != 3) {
            System.out.print("세자리 정수를 입력해주세요: ");
            this.inputValue = getScanner();
            inputArrayValue = arrayInputValue();//  arrayInputValue() 결과 값을 inputArrayValue 담아 반복문 실행 여부 판단
        }
        return inputArrayValue;
    }

    private int[] arrayInputValue() {
        String[] arrayStr = intConvertArray();
        int[] arrayValue = new int[arrayStr.length];

        if (arrayValue.length == 3) { // 숫자가 세자리 인경우
            for (int i = 0; i < arrayValue.length; i++) {
                arrayValue[i] = Integer.parseInt(arrayStr[i]);
            }
            return arrayValue;
        }
        return arrayValue; //세자리가 아닌 경우에 return
    }

    private String[] intConvertArray() {
        return String.valueOf(this.inputValue).split("");
    }
    //중복값 카운트
    private int duplicateValue(int[] arrayValue) {
        int count = 0;
        if (arrayValue.length == 3) {
            for (int i = 0; i < arrayValue.length; i++) {
                for (int j = i + 1; j < arrayValue.length; j++) {
                    if (arrayValue[i] == arrayValue[j]) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
