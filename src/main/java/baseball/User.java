package baseball;

import java.util.*;
import java.util.stream.Collectors;

public class User {

    //세자리 배열
    public List<Integer> getThreeDigitNumbers(String sc) {
        while (InputValid.isThreeLength(sc) || InputValid.isDuplicateValue(sc)) {
            System.out.println("3자리 정수가 아니거나 중복값이 존재합니다.");
            sc = InputSc.sc();
        }
        return convertList(sc.split(""));
    }
    //문자열 배열 -> 정수 리스트
    public List<Integer> convertList(String[] arrayStr) {
        List<Integer> convertList = new ArrayList<>();
        try {
            for (String s : arrayStr) {
                convertList.add(Integer.parseInt(s));
            }
        } catch (NumberFormatException e) {
            System.out.println("잘못입력하였습니다. 숫자를 입력하여주세요.");
        }
        return convertList;
    }
}
