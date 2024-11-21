import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculator02 calculator = new Calculator02();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("첫 번째 숫자를 입력하세요: ");
            int num1 = scanner.nextInt();

            System.out.println("두 번째 숫자를 입력하세요: ");
            int num2 = scanner.nextInt();

            System.out.println("사칙연산 기호를 입력하세요: ");
            String operator2 = scanner.next();

            char operator = operator2.charAt(0);
            scanner.nextLine(); // 버퍼 비우기

            Integer result = calculator.calculate(num1, operator, num2);

            System.out.println("계산 결과: " + result);

            List<Integer> results = calculator.getResult();
            System.out.println("현재까지의 계산 결과들: " + results);

            System.out.print("가장 먼저 저장된 결과를 삭제하시겠습니까? ('delete' 입력 시 삭제): ");
            String action = scanner.nextLine();
            if (action.equals("delete")) {
                calculator.removeFirstResult(); // 가장 먼저 저장된 결과 삭제
            }

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료): ");
            String end = scanner.nextLine();
            if (end.equals("exit")) {
                break;
            }
        }
    }
}





