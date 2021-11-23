class Buyer {
	private int money;  
	private String inventory;
	
	public void get_Product(int money, String product)
	{
		this.money -= money;
		this.inventory += product;
	}
	
	public int get_Money() {
		return money;
	}
	
	public String toString() {
		return "������ : " + money + "\t������ǰ : " + inventory; 
	}
	
	Buyer(int money)
	{
		this.money = money;
		this.inventory = "";
	}
}

class Casher {
	private int salesVolume;
	
	void getSalesVolume() {
		System.out.println("�Ż� :" + salesVolume);
	}
	
	String buy(int money, String name) {
		if(money >= 4000 && name.equals("�Ƹ޸�ī��"))
		{
			salesVolume += 4000;
			return "�Ƹ޸�ī��";
		}
		else if(money >= 4500) {
			if(name.equals("��"))
			{
				salesVolume += 4500;
				return "��";
			}
			else if(name.equals("����"))
			{
				salesVolume += 4500;
				return "����";
			}
			else
			{
				salesVolume += 4500;
				return "�̵�ϻ�ǰ";
			}
		} 
		else if((money >= 5000)) {
			if(name.equals("������"))
			{
				salesVolume += 5000;
				return "������";
			}
			else
				return "�̵�ϻ�ǰ";
		}
		else
			return null;
	}
	
	public String toString() {
		return "����� : " + salesVolume; 
	}
	
	Casher(int salesVolume) {
		this.salesVolume = salesVolume;
	}
}

class Barista {
	private int coffee; 
	//private int milk;
	private int greentea;
	private int yujutea;
	
	boolean Make_Tea(String product)
	{
		if(product.equals("�Ƹ޸�ī��") && coffee >= 1)
			return true;
		else if(product.equals("��") && coffee >= 1)
			return true;
		else if(product.equals("����") && greentea >= 1)
			return true;
		else if(product.equals("������") && yujutea >= 1)
			return true;
		else
			return false;
	}
	
	Barista(int coffee, int milk, int greentea, int yujutea)
	{
		this.coffee = coffee;
		//this.milk = milk;
		this.greentea = greentea;
		this.yujutea = yujutea;
	}
}

public class Ex_2 {

	static int AMARICANO = 1, AMARICANO_COST = 4000;
	static int LATTE = 2, LATTE_COST = 4500;
	static int GREEN_TEA = 3, GREENTEA_COST = 4500;
	static int YUJU_TEA = 4, YUJUTEA_COST = 5000;
	
	public static void main(String[] args) {
		
		Buyer b = new Buyer(10000);
		Casher ch = new Casher(0);
		Barista ba = new Barista(10, 10, 10, 10);
		
		String want_drink = "�Ƹ޸�ī��";
		String order = ch.buy(b.get_Money(), want_drink); 
			
		if(want_drink.equals(order)) {
			if(ba.Make_Tea(order))
			{
				System.out.println("Ŀ������ �Ϸ�.");
				b.get_Product(AMARICANO_COST, "�Ƹ޸�ī��");
			}
		}
		
		System.out.println(b.toString());
		System.out.println(ch.toString());
	}
}
