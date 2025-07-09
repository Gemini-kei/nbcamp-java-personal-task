package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);

        while(true){
            // 첫번째 숫자 입력 받기
            System.out.println("첫 번째 숫자를 입력하세요 :");
            int num1 = sc.nextInt();
            // 두번째 숫자 입력 받기
            System.out.println("두 번째 숫자를 입력하세요 : ");
            int num2 = sc.nextInt();

            //사칙연산 기호 입력 받기
            System.out.println("사칙연산 기호를 입력하세요 : ");
            char symbol = sc.next().charAt(0);

            int result = 0;
            switch (symbol) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        break;
                    }
                    result = num1 / num2;
                    break;
            }
            System.out.println("결과 : " + result);


            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String stopMsg = sc.next();
            if (stopMsg.equals("exit")) {
                break;
            }
        }

    }
}
