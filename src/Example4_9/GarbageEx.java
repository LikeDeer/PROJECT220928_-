package Example4_9;

public class GarbageEx {
    public static void main(String[] args) {
        String a = new String("Good");
        String b = new String("Bad");
        String c = new String("Normal");
        String d, e;
        a = null;       // Good 가비지
        d = c;          // c와 d가 Normal 가리킴
        c = null;       // d가 가리키고 있으므로, Nomal 가비지 아님
    }
}
