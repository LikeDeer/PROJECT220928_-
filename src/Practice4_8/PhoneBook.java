package Practice4_8;

import java.util.Scanner;

public class PhoneBook {

    public static int findCorresponding(String searchName, Phone[] phones) {
        int i = 0;
        for (; i < phones.length; i++) {
            if (phones[i].getName().equals(searchName))     // 찾음
                break;
        }
        return i;           // index 반환.
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("인원수>>");
        int count = scanner.nextInt();
        scanner.nextLine();

        Phone phones[] = new Phone[count];

        // count만큼 전화번호부 입력
        for (int i = 0; i < count; i++) {
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
            String name = scanner.next();
            String tel = scanner.nextLine();
            phones[i] = new Phone(name, tel);
        }
        System.out.println("저장되었습니다...");

        // 검색 시작
        while (true) {
            System.out.print("검색할 이름>>");
            String nameInput = scanner.nextLine();

            if (nameInput.equals("그만"))
                break;
            else {
                int index = findCorresponding(nameInput, phones);
                if (index == count)         // index가 count와 같다면, 못찾은 것.
                    System.out.println(nameInput + " 이 없습니다.");
                else
                    System.out.println(nameInput + "의 번호는 " + phones[index].getTel() + " 입니다.");
            }
        }
    }
}
