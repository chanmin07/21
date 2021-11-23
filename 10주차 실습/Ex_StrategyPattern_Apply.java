class Moving {
    private MovableStrategy movableStrategy;

    public void move(){
        movableStrategy.move();
    }

    public void setMovableStrategy(MovableStrategy movableStrategy){
        this.movableStrategy = movableStrategy;
    }
}
class Bus extends Moving{

}
class Train extends Moving{

}

interface MovableStrategy {
    public void move();
}

class WaterStrategy implements MovableStrategy{
    public void move(){
        System.out.println("���θ� ���� �̵�");
    }
}

class LandStrategy implements MovableStrategy{
    public void move() {
        System.out.println("���θ� ���� �̵�");
    }
}

public class Ex_StrategyPattern_Apply {
	public static void main(String[] args) {
		Moving train = new Train();
        Moving bus = new Bus();

        train.move();
        bus.move();
	}

}
