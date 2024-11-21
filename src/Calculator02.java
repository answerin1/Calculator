import java.util.LinkedList;
import java.util.List;

public class Calculator02 {

    private LinkedList<Integer> result;
    // 연산 결과를 저장할 LinkedList 코드로 작성함 -> 이때, 반드시 임포트를 받아야 함

    public Calculator02() {
        this.result = new LinkedList<>();
        // 생성자인 LinkedList 초기화 시켜줌 -> 이때에도 반드시 임포트를 받아야 함
    }

    public List<Integer> getResult() {
        return this.result;
        // Getter 메서드를 사용하여 result 리스트 값을 가져와 반환시켜줌
    }

    public void setResult(List<Integer> result) {
        this.result = (LinkedList<Integer>) result;
        // Setter 메서드 - result 리스트를 수정하도록 설치시켜줌
    }

    public Integer calculate(int num1, char operator, int num2) {
        // 계산 결과를 계산하여 result 리스트에 추가하도록 만들어줌
        switch (operator) {
            case '+':
                result.add(num1 + num2); // 더하기 연산
                break;
            case '-':
                result.add(num1 - num2); // 빼기 연산
                break;
            case '*':
                result.add(num1 * num2); // 곱하기 연산
                break;
            case '/':
                if (num2 != 0) {
                    result.add(num1 / num2); // 나누기 연산
                } else {
                    System.out.println("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
                }
                break;
            case '%':
                result.add(num1 % num2); // 나머지 연산
                break;
            default:
                System.out.println("잘못된 연산자를 입력했습니다.");
                return null;
        }
        return result.getLast();
        // 가장 최근 계산 결과를 반환한다는 뜻의 코드를 작성함
    }

    public void removeFirstResult() {
            // 가장 먼저 저장된 데이터를 삭제하는 메서드를 작성함
            if (!result.isEmpty()) {
                result.removeFirst();
                // 그 중 이미 저장 된 값이 있다면 가장 먼저 저장된 데이터를 삭제하도록 지시함
                System.out.println("가장 먼저 저장된 결과가 삭제되었습니다.");
            } else {
                System.out.println("삭제할 결과가 없습니다.");
                // 위 경우가 아니라면, 애초에 저장된 값이 없으므로 삭제할 결과가 없다고 알려줌
            }
        }
    }