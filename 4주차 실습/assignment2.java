public class assignment2 {
    public static void main(String[] args) {
        // 2차원 배열과 중첩 for 문을 사용해서 2단부터 9단까지 구구단을 저장하는 프로그램을 작성하시오
        int[][] arr = new int[10][10];
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                if (i >= 2 || j >= 1) {
                    arr[i][j] = i * j;
                }
            }
        }

        for (int i = 2; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.println(i + " * " + j + " : " + arr[i][j]);
            }
        }
    }
}
