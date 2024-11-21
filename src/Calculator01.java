import java.util.Scanner;

public class Calculator01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // while문이 무조건 true로 나오게 함으로써 연산이 수행 가능하도록 만듦
            System.out.println("첫 번쩨 숫자를 입력하세요.: ");
            int num1 = scanner.nextInt();

            System.out.println("두 번째 숫자를 입력하세요.: ");
            int num2 = scanner.nextInt();

            System.out.println("사칙연산 기호를 입력하세요.: ");
            String operator2 = scanner.next();
            char operator = operator2.charAt(0);
            scanner.nextLine();
            // char operator = scanner.nextLine().charAt(0);
            // scanner.nextLine();

            int result = 0;
            System.out.print("결과: " + result);

            switch (operator) {
                // 각 연산자별로 입력된 연산자가 수행되도록 만듦
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
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else if (num2 == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        break;
                    }
                    // 여기서 몫을 구하는 경우, 분모가 0이 되는 경우와 0이 되지 않는 경우로 쪼개어 조건을 달아줌.
                    // 유의하여 작성한 부분은 0인 경우 나누어 지기 전에 계산 자체를 불가능하다고 만든 부분임(왜냐하면 똑같이 값이 0이 입력될 수 없다 하더라도,
                    // 나누고 나서 분모가 0인지 아닌지를 판단하는 것과, 애초에 분모가 0이기에 나누지 않고 판단하는 경우는 다르기 때문임).
                case '%':
                    result = num1 % num2;
                    break;

                // 또 신경 쓴 부분은 break;부분인데, 각 연산자별로 break;를 걸어주지 않게 되면 밑으로 흘러 내려가 덮어쓰기가 되는 현상이 발생하게 됨
                // 따라서 연산자가 충족되어 잘 수행 되었다면 그 라인에서 멈출 수 있도록 break를 걸어줌.

                default:
                    System.out.println("연산이 불가능 합니다.");
            }
            System.out.println(result);

            System.out.print("더 게산하시겠습니까? (exit 입력 시 종료)");
            String end = scanner.nextLine();
            if (end.equals("exit")) {
                break;
            }
        }
    }
}
