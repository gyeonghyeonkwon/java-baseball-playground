package baseball;

import java.util.Scanner;

public class InputSc {

    private static Scanner scanner;

    private InputSc() {
    }

    public static String sc() {
        System.out.print("숫자를 입력해주세요: ");
        return getInstance().nextLine();
    }
    private static Scanner getInstance() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
        return scanner;
    }
}
