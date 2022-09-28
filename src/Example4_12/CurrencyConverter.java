package Example4_12;

public class CurrencyConverter {
    private static double rate;     // 한국 원화에 대한 환율

    public static double toDollar(double won) {
        return won/rate;
    }

    public static double toKWR(double dollar) {
        return dollar * rate;       // 달러를 한국 원화로 변환
    }

    public static void setRate(double r) {
        rate = r;                   // 환율 설정. KWR/$1
    }
}
