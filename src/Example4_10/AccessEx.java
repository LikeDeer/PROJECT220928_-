package Example4_10;

public class AccessEx {
    public static void main(String[] args) {
        Sample aClass = new Sample();
        aClass.a = 10;
        // aClass.b = 10;   private 필드
        aClass.c = 10;
    }
}
