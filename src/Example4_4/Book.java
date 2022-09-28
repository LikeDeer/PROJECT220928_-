package Example4_4;

public class Book {
    String title;       // 아무 접근 제한자를 명시하지 않으면
    String author;      // default 접근 제한. 동일한 패키지 내에서만 접근 가능

    public Book(String t) {     // 생성자
        title = t;
        author = "작자미상";
    }

    public Book(String t, String a) {     // 생성자
        title = t;
        author = a;
    }

    public static void main(String[] args) {
        Book littlePrince = new Book("어린왕자", "생텍쥐페리");
        Book loveStory = new Book("춘향전");
        System.out.println(littlePrince.title + " " + littlePrince.author);
        System.out.println(loveStory.title + " "  + loveStory.author);
    }
}
