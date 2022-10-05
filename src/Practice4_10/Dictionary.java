package Practice4_10;

public class Dictionary {
    private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
    private static String[] eng = {"love", "baby", "money", "future", "hope"};

    public static String kor2Eng(String word) {
        int i = 0;
        for (i = 0; i < kor.length; i++) {
            if (kor[i].equals(word))
                break;
        }

        if (i == kor.length) {      // 같으면 탐색 실패한 것
            return null;
        } else {
            return eng[i];
        }
    }
}
