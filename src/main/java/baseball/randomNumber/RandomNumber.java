package baseball.randomNumber;

public class RandomNumber {

    private int [] threeDigits; //세자리 정수 배열

    private int [] number () {
        threeDigits = new int[3];
        for (int i = 0; i < threeDigits.length; i++) {
            threeDigits[i] = (int) (Math.random() * 9 ) + 1;
        }
        return threeDigits;
    }

    public int [] getArrayNumber () {
        return number();
    }
}
