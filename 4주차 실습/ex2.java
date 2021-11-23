public class ex2 {
    public static void main(String[] args) {
        int[][] score = new int[5][4];

        score[0] = new int[] { 100, 97, 67, 99 };
        score[1] = new int[] { 75, 86, 83, 91 };
        score[2] = new int[] { 80, 72, 85, 84 };
        score[3] = new int[] { 95, 96 };
        score[4] = new int[] { 94, 97, 100 };

        for (int i = 0; i < score[0].length; i++) {
            if (i == 0) {
                System.out.printf("0행 데이터 : ");
            }
            System.out.printf("%d ", score[0][i]);
        }

        // 위에꺼 따라하고 아래 문제 풀기
        /*
         * 추가 문제 : 아래와 같이 배열을 초기화 하고 출력해보시오. 배열 크기 - 3x3, 배열 타입 - int 데이터 : 2의 승수, 3의
         * 승수, 4의 승수 중첩 for문을 사용해서 출력.
         */
        System.out.printf("\n");
        int[][] arr = new int[3][3];
        arr[0] = new int[] { 2, 4, 8 };
        arr[1] = new int[] { 3, 9, 27 };
        arr[2] = new int[] { 4, 16, 64 };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
