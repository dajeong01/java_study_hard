package chapter07_methods;

import java.util.Scanner;

public class Method03Switch {

    public static String getStar(int totalLine, int menuSelect) {
        String result = "";

        // switch문을 사용하여 별찍기 구현
        switch (menuSelect) {
            case 1:
                // 왼쪽으로 치우친 증가하는 별
                for (int i = 0; i < totalLine; i++) {
                    for (int j = 0; j < i + 1; j++) {
                        result += "😍";
                    }
                    result += "\n";
                }
                break;
            case 2:
                // 오른쪽으로 치우친 증가하는 별
                for (int i = 0; i < totalLine; i++) {
                    for (int j = 0; j < totalLine - i - 1; j++) {
                        result += "  ";
                    }
                    // 별 찍기
                    for (int k = 0; k < i + 1; k++) {
                        result += "😍";
                    }
                    result += "\n";
                }
                break;
            case 3:
                // 왼쪽으로 치우친 감소하는 별
                for (int i = 0; i < totalLine; i++) {
                    for (int j = 0; j < totalLine - i; j++) {
                        result += "😍";
                    }
                    result += "\n";
                }
                break;
            case 4:
                // 오른쪽으로 치우친 감소하는 별
                for (int i = 0; i < totalLine; i++) {
                    // 공백
                    for (int j = 0; j < i; j++) {
                        result += "  ";
                    }
                    // 별찍기
                    for (int k = 0; k < totalLine - i; k++) {
                        result += "😍";
                    }
                    result += "\n";
                }
                break;
            default:
                result = "잘못 선택하셨습니다.";
                break;
        }

        return result;
    }

    public static void main(String[] args) {

        int starRow;
        int choiceMenu;
        String starResult;

        Scanner scanner = new Scanner(System.in);

        System.out.println("몇 줄 짜리 별을 생성할까요?");
        starRow = scanner.nextInt();

        System.out.println("1. 왼쪽으로 치우친 증가하는별");
        System.out.println("2. 오른쪽으로 치우친 증가하는별");
        System.out.println("3. 왼쪽으로 치우친 감소하는별");
        System.out.println("4. 오른쪽으로 치우친 감소하는별");
        System.out.println("메뉴를 숫자로 선택하세요");
        choiceMenu = scanner.nextInt();

        starResult = getStar(starRow, choiceMenu);
        System.out.println(starResult);

    }
}
