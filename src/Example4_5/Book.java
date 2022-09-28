package Example4_5;

public class Book {
    String title;
    String author;
    void show() { System.out.println(title + " " + author); }

    public Book() {
        this("", "");   // this는 생성자 제일 처음에!
        System.out.println("생성자 호출됨");
    }

    public Book(String title) {
        this(title, "작자미상");
    }

    public Book(String title, String author) {      // 실질적으로 이것이 호출
        this.title = title;
        this.author = author;
    }

    public static void main(String[] args) {
        Book littlePrince = new Book("어린왕자" , "생텍쥐페리");
        Book loveStory = new Book("춘향전");
        Book emptyBok = new Book();
        loveStory.show();
    }
}
