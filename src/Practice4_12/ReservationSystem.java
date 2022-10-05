package Practice4_12;

public class ReservationSystem {
    private Seat[] S, A, B;

    public ReservationSystem(Seat[] S, Seat[] A, Seat[] B) {
        this.S = S;
        this.A = A;
        this.B = B;
    }

    public void reserve(int seatType, String name, int seatNum) {
        switch (seatType) {
            case 1:
                S[seatNum].setReserved(name);
                break;
            case 2:
                A[seatNum].setReserved(name);
                break;
            case 3:
                B[seatNum].setReserved(name);
                break;
            default:
                System.out.println("잘못된 좌석구분 입력!");
        }
    }

    public void check() {
        System.out.print("S>> ");
        for (int i = 0; i < S.length; i++) {
            System.out.print(S[i].getReserved() + " ");
        }
        System.out.println();
        System.out.print("A>> ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i].getReserved() + " ");
        }
        System.out.println();
        System.out.print("B>> ");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i].getReserved() + " ");
        }
        System.out.println();

        System.out.println("<<조회를 완료하였습니다.>>>");
    }

    public void cancel(int type, String name) {
        switch (type) {
            case 1:
                for (Seat n : S) {
                    if (n.getReserved().equals(name)) {
                        n.setReserved("---");
                        break;
                    }
                }
                break;
            case 2:
                for (Seat n : A) {
                    if (n.getReserved().equals(name)) {
                        n.setReserved("---");
                        break;
                    }
                }
                break;
            case 3:
                for (Seat n : B) {
                    if (n.getReserved().equals(name)) {
                        n.setReserved("---");
                        break;
                    }
                }
                break;
        }
    }
}
