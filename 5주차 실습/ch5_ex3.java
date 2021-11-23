class NewTv {
    String color;
    boolean power;
    int channal;

    static int width;
    static int height;

    void power() {power =! power;}
    void channalUp() {channal++;}
    void channelDown() {channal--;}
}

public class ch5_ex3 {
    public static void main(String[] args) {
        NewTv t = new NewTv();
        NewTv t2 = new NewTv();

        //t.width = 300;
        //t.height = 200;

        t.color = "Blue";
        t.channal = 5;
        t2.color = "White";
        t2.power = true;
        t2.channal = 7;

        System.out.printf("C : %s, P : %b, Ch : %d\n", t.color, t.power, t.channal);
        System.out.printf("C : %s, P : %b, Ch : %d\n", t2.color, t2.power, t2.channal);

        //System.out.printf("T1 W : %d, H : %d\n", t.width, t.height);
        //System.out.printf("T2 W : %d, H : %d\n", t2.width, t2.height);
    }
}
