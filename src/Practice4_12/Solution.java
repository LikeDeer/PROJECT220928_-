package Practice4_12;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Seat[] S = new Seat[10];
        Seat[] A = new Seat[10];
        Seat[] B = new Seat[10];
        ReservationSystem reservSys = new ReservationSystem(S, A, B);

        int command;

        for (int i = 0; i < 10; i++) {
            S[i] = new Seat();
            A[i] = new Seat();
            B[i] = new Seat();
        }

        System.out.println("명품콘서트홀 예약 시스템입니다.");
        do {
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
            command = scanner.nextInt();
            scanner.nextLine();
            switch (command) {
                case 1:
                    System.out.print("좌석구분 S(1), A(2), B(3)>>");
                    int seatType = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("이름>>");
                    String name = scanner.nextLine();
                    System.out.print("번호>>");
                    int seatNum = scanner.nextInt();
                    scanner.nextLine();
                    reservSys.reserve(seatType, name, seatNum - 1);
                    break;
                case 2:
                    reservSys.check();
                    break;
                case 3:
                    System.out.print("좌석 S:1, A:2, B:3>>");
                    int type = scanner.nextInt();
                    scanner.nextLine();
                    switch (type) {
                        case 1:
                            System.out.print("S>> ");
                            for (int i = 0; i < S.length; i++) {
                                System.out.print(S[i].getReserved() + " ");
                            }
                            System.out.println();
                            break;
                        case 2:
                            System.out.print("A>> ");
                            for (int i = 0; i < A.length; i++) {
                                System.out.print(A[i].getReserved() + " ");
                            }
                            System.out.println();
                            break;
                        case 3:
                            System.out.print("B>> ");
                            for (int i = 0; i < B.length; i++) {
                                System.out.print(B[i].getReserved() + " ");
                            }
                            System.out.println();
                            break;
                        default:
                            System.out.println("잘못된 좌석구분 입력!");
                            continue;
                    }
                    System.out.print("이름>>");
                    String existName = scanner.nextLine();
                    reservSys.cancel(type, existName);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("잘못된 입력!");
            }
        } while (command != 4);
    }
}
