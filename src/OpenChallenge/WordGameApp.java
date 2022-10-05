package OpenChallenge;

import java.util.Scanner;

public class WordGameApp {
    Scanner scanner = new Scanner(System.in);

    public WordGameApp() { }

    public void run() {
        System.out.println("끝말잇기 게임을 시작합니다...");
        System.out.print("게임에 참가하는 인원은 몇명입니까>>");
        int participant = scanner.nextInt();
        scanner.nextLine();

        Player[] players = new Player[participant];

        // players 이름 지정
        int i;
        for (i = 0; i < participant; i++) {
            System.out.print("참가자의 이름을 입력하세요>>");
            players[i] = new Player(scanner.nextLine());
        }

        // 게임 준비
        String word = "아버지";
        int lastIndex = word.length() - 1;
        char lastChar = word.charAt(lastIndex);

        // 게임 시작
        System.out.println("시작하는 단어는 아버지입니다");
        i = 0;
        while (true) {
            System.out.print(players[i].getName() + ">>");
            word = Player.getWordFromUser();
            if (players[i].checkSuccess(word, lastChar)) {
                lastChar = word.charAt(word.length() - 1);
            }
            else {
                System.out.println(players[i].getName() + "이 졌습니다.");
                break;
            }
            i++;
            i %= participant;
        }
    }

    public static void main(String[] args) {
        WordGameApp game = new WordGameApp();
        game.run();
    }
}
