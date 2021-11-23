class Unit{
    String name;
    int hp;
    int mp;
}
interface Fightable{
    void move(int x, int y);
    void attack(Unit u);
}

class Fighter extends Unit implements Fightable{
    public void move(int x, int y){ }
    public void attack(Unit u) { }
}

public class ch6_5 {
    public static void main(String[] args) {
        //Fighter f = new Fighter();
        //Fightable fa = new Fightable();
    }
}
