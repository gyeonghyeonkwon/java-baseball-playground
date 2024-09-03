package baseball.user;

import baseball.input.InputSc;
import baseball.valid.InputValid;

import java.util.*;

public class User {

    //세자리 배열
    public List<Integer> getThreeDigitNumbers(String sc) {
        while (InputValid.isThreeLength(sc) || InputValid.isDuplicateValue(sc) || InputValid.isContainsNumber(sc)) {
            sc = InputSc.sc();
        }
        return convertList(sc.split(""));
    }

    //문자열 배열 -> 정수 리스트
    public List<Integer> convertList(String[] arrayStr) {
        List<Integer> convertList = new ArrayList<>();
        for (String s : arrayStr) {
            convertList.add(Integer.parseInt(s));
        }
        return convertList;
    }
}
