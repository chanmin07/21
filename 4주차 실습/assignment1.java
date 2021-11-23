public class assignment1 {
    public static void main(String[] args) {
        // 1차원 배열의 초기화를 1~10까지 숫자로 한 후, 그 안에 들어있는 값을 역순으로 바꾸는 프로그램을 작성하시오.
        int[] arr = new int[] {1, 3, 5, 7, 9};
        
        for(int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length -i -1];
            arr[arr.length -i -1] = temp;
        }
        System.out.printf("역순 배열 : ");
        for(int i = 0; i < arr.length; i++){
            System.out.printf("%d ", arr[i]);
        }
    }
}
