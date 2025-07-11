package calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);

        // List 생성
        List<Integer> resultList = new ArrayList<>();
        String removeMsg;
        String inquiryMsg;
//        int[] resultArr = new int[10];
//        int indexCounter = 0;

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
            String errMsg = "";
            // 사칙연산 기호 별로 연산
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
                    // 분모 0 거르기
                    if (num2 == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        // 이 경우 result 결과값이 없으므로
                        errMsg = "나눗셈 오류";
                        break;
                    }
                    result = num1 / num2;
                    break;
            }
            // 결과값 출력

            if (errMsg.equals("나눗셈 오류")){
                System.out.println("결과 : " + errMsg);
            } else {
                System.out.println("결과 : " + result);
            }
            resultList.add(result);
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            removeMsg = sc.next();
            if (removeMsg.equals("remove")){
                resultList.remove(0);
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            inquiryMsg = sc.next();
            if (inquiryMsg.equals("inquiry")){
                for(int i: resultList) {
                    System.out.println(i); //값을 출력
                }
            }

//            // indexCounter로 10개 초과하는 경우를 확인
//            if (indexCounter == resultArr.length) {
//                // 가장 먼저 저장된 값부터 삭제하면서 한칸씩 앞으로 이동
//                for (int i = 0; i < resultArr.length-1; i++) {
//                    resultArr[i] = resultArr[i+1];
//                }
//                // 위치 조정
//                indexCounter--;
//            }
//            // index 마지막(9)에 다시 현재 결과값 저장
//            resultArr[indexCounter] = result;
//            indexCounter++;

            // exit 입력 받기
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String stopMsg = sc.next();
            // exit 일 경우 반복문 종료
            if (stopMsg.equals("exit")) {
                break;
            }
        }

    }
}
