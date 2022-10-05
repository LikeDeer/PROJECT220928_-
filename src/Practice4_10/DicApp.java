package Practice4_10;

import java.util.Scanner;

public class DicApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("한영 단어 검색 프로그램입니다.");

        while (true) {
            System.out.print("한글 단어?");
            String input = scanner.nextLine();

            if (input.equals("그만"))
                break;
            else {
                String transResult = Dictionary.kor2Eng(input);
                if (transResult != null) {
                    System.out.println(input + "은 " + transResult);
                } else {
                    System.out.println(input + "는 저의 사전에 없습니다.");
                }
            }
        }
    }
}
