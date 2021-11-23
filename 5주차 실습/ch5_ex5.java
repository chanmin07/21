public class ch5_ex5 {
    static int add(int a, int b){
        int result = a + b;
        return result;
    }
    static int add(int a, int b, int c){
        int result = a + b + c;
        return result;
    }
    static int min(int a, int b){
        int result = a - b;
        return result;
    }
    public static void main(String[] args) {
        //int result = add(3,5);
        int reP = add(3,5,6);
        System.out.println("add method 3 + 5 + 6 : " + reP);
    }
}
