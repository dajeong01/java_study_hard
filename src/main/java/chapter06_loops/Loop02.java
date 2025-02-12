package chapter06_loops;

import java.util.Scanner;

public class Loop02 {
    public static void main(String[] args) {

        /*
            n에 숫자를 입력하여 몇 번 반복할지 결정하고
            1부터 n까지 표시하는 반복문을 작성하시오.
         */

        // 1. Scanner import
        Scanner scanner = new Scanner(System.in);

        // 2. 사용할 변수 선언
        int n = 0;
        int sum = 0;

        System.out.println("1부터 얼마까지 숫자를 더하시겠습니까? ");
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            sum += (i + 1);
        }

        System.out.println(sum);

        scanner.close();
    }
}
