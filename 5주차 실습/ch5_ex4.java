public class ch5_ex4 {
    static void pArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.printf("%d", arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] math = new int[10];
        for(int i = 0; i < math.length; i++){
            math[i] = i;
        }
        for(int i = 0; i < math.length; i++){
            System.out.printf("%d ", math[i]);
        }
        System.out.println();
        for(int i = 0; i < math.length; i++){
            math[i] = 10 - i;
        }
        for(int i = 0; i < math.length; i++){
            System.out.printf("%d ", math[i]);
        }
    }
}