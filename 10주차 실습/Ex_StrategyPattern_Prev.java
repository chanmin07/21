interface Movable {
    public void move();
}

class Ship implements Movable{
    public void move(){
        System.out.println("���θ� ���� �̵�");
    }
}

class Car implements Movable{
    public void move(){
        System.out.println("���θ� ���� �̵�");
    }
}



public class Ex_StrategyPattern_Prev {

	public static void main(String[] args) {

		Movable ship = new Ship();
        Movable car = new Car();

        ship.move();
        car.move();
	}

}
