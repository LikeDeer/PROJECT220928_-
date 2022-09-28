package Practice4_2;

public class Grade {
    private int math, science, english;

    public Grade(int math, int science, int english) {
        this.math = math;
        this.science = science;
        this.english = english;
    }

    public int average() {
        return (math + science + english) / 3;
    }
}
