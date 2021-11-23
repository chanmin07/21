class Tv {
    String color;
    boolean power;
    int channal;

    void power() {power =! power;}
    void channalUp() {channal++;}
    void channelDown() {channal--;}
}

public class ch5_ex1 {
    public static void main(String[] args) {
        Tv t;
        t = new Tv();

        System.out.printf("color : %s, power : %b, channal : %d", t.color, t.power, t.channal);
        t.channal = 7;
        System.out.printf("채널 초기화 결과 채널값 : " + t.channal);
        t.channelDown();
        System.out.printf("채널 다운 매서드 실행 결과 채널값 : " + t.channal);
    }
}
