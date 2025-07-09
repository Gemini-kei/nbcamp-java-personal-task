package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);

        // 첫번째 숫자 입력 받기
        System.out.println("첫 번째 숫자를 입력하세요 :");
        int num1 = sc.nextInt();
        // 두번째 숫자 입력 받기
        System.out.println("두 번째 숫자를 입력하세요 : ");
        int num2 = sc.nextInt();
    }
}
