class Calculator {
    int[] result = new int[10];// 결과 저장 배열
    int pos = 0;// 배열 위치 확인용(?)

    public int exec(int a, int b, String c) {
        if (c.equals("+")) {
            result[pos] = a + b;
        }
        if (c.equals("-")) {
            result[pos] = a - b;
        }
        if (c.equals("*")) {
            result[pos] = a * b;
        }
        if (c.equals("/")) {
            result[pos] = a / b;
        }
        pos++;
        return result[pos - 1];
    }

    public void prevResult() {
        if (pos == 0) {
            System.out.println("저장된 결과값이 없습니다.");
        } else {
            System.out.printf("저장된 결과값 : ");
            for(int i = 0; i < pos; i++){
                System.out.printf(result[i] + " ");
            }
            System.out.println("\n");
        }
    }
}

public class ch5_assignment {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.prevResult();
        System.out.println("5 + 7 = " + calc.exec(5, 7, "+"));
        calc.exec(5, 3, "-");
        calc.exec(9, 3, "/");
        calc.prevResult();
        calc.exec(10, 5, "*");
        calc.prevResult();

    }
}
