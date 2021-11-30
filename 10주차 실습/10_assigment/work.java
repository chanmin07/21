interface b_work{
    public void made();
}
class coffee implements b_work{
    public void made(){
        System.out.println("에스프레소를 내린다");
    }
}
class shake implements b_work{
    public void made(){
        System.out.println("두가지 음료를 섞는다");
    }
}
class moving {
    private b_work b_work;

    void made(){
        b_work.made();
    }
    void set_b_work(b_work b_work){
        this.b_work = b_work;
    }
}
//class Barista1 extends b_work{ }
//class Barista2 extends b_work{ }
public class work {
    public static void main(String[] args) {

    }
}
