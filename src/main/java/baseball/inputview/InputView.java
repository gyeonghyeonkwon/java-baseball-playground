package baseball.inputview;

import javax.xml.transform.Source;
import java.util.Scanner;

public class InputView {

    private  Scanner sc;
    private int inputValue;

    public InputView() {
        this.sc = new Scanner(System.in);
    }

    public int getInputValue () {
        System.out.print("숫자를 입력해주세요: ");
        inputValue = sc.nextInt();
        return inputValue;
    }

    public int[] getArrayInputValue() {
            int[] inputArrayValue = arrayInputValue();
            while (inputArrayValue == null) {
                System.out.println("세자리 정수를 입력해주세요.");
                getInputValue();
                inputArrayValue = arrayInputValue(); //  arrayInputValue() 결과 값을 inputArrayValue 담아 반복문 실행 여부 판단
            }
        return inputArrayValue;
    }

    private int[] arrayInputValue() {
        String[] arrayStr = intConvertArray();
        int[] arrayValue = new int[arrayStr.length];
        if (arrayValue.length == 3) {
            for (int i = 0; i < arrayValue.length; i++) {
                arrayValue[i] = Integer.parseInt(arrayStr[i]);
            }
            return arrayValue;
        }
       return null;
    }

    private String[] intConvertArray () {
        return String.valueOf(inputValue).split("");
    }
}
