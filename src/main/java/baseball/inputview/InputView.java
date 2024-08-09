package baseball.inputview;

import baseball.randomNumber.RandomNumber;

import javax.xml.transform.Source;
import java.util.Scanner;

public class InputView{

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
        int count = duplicateValueCount(inputArrayValue);
        /**
         *  숫자가 3개가 될 때 까지 반복 순회
         *  숫자가 1개 인 경우  숫자가 1 이나 2 면 반환
         */
        while (inputArrayValue.length != 3 || count > 0) {
            System.out.println("입력하신 숫자가 중복된 숫자가 존재하거나 세자리 정수를 입력해주세요.");
            System.out.print("숫자를 다시 입력해주세요: ");
            this.inputValue = getScanner();
            inputArrayValue = arrayInputValue();//  arrayInputValue() 결과 값을 inputArrayValue 담아 반복문 실행 여부 판단
            count = duplicateValueCount(inputArrayValue);
        }
        return inputArrayValue;
    }

    private int[] arrayInputValue() {
        String[] arrayStr = intConvertArray();
        int[] arrayValue = new int[arrayStr.length];

        if (arrayValue.length == 3) { // 입력된 정수가 세자리 인경우
            for (int i = 0; i < arrayValue.length; i++) {
                arrayValue[i] = Integer.parseInt(arrayStr[i]);
            }
            return arrayValue;
        }
        return arrayValue; //세자리가 아닌 경우에 배열의 각인덱스 값이 0
    }
    //입력값으로 받은 정수를 세자리수로 자른다.
    private String[] intConvertArray() {
        return String.valueOf(this.inputValue).split("");
    }
    //입력한 정수가 중복된 정수의 갯수를 count 한다.
    private int duplicateValueCount (int[] inputArrayValue) {
        int count = 0;
        for (int i = 0; i < inputArrayValue.length; i++) {
            for (int j = i + 1; j < inputArrayValue.length; j++) {
                if (inputArrayValue[i] == inputArrayValue[j]) {
                    count ++;
                    break;
                }
            }
        }
        return count;
    }
}
