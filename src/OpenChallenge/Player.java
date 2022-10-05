package OpenChallenge;

import java.util.Scanner;

public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static String getWordFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public boolean checkSuccess(String word, char lastChar) {
        char word_firstChar = word.charAt(0);
        if (word_firstChar == lastChar)
            return true;
        else
            return false;
    }
}
