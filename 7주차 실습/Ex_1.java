public class Ex_1 {
	static int AMARICANO = 1, AMARICANO_COST = 4000;
	static int LATTE = 2, LATTE_COST = 4500;
	static int GREEN_TEA = 3, GREENTEA_COST = 4500;
	static int YUJU_TEA = 4, YUJUTEA_COST = 5000;
	
	public static void main(String[] args) {
		int buyer_money = 5000;
		int shop_money = 0;
		String buyer_inventory = "";
		int want_item = LATTE;
		
		String make_item = "";
		 
		if(Order_possiable(buyer_money, want_item)) {
			if(want_item == AMARICANO) {
				System.out.println("�Ƹ޸�ī�븦 �����մϴ�.");
				buyer_money -= AMARICANO_COST;
				System.out.println(AMARICANO_COST + "�� �����߽��ϴ�.");
				shop_money += AMARICANO_COST;
			}
			else if(want_item == LATTE) {
				System.out.println("�󶼸� �����մϴ�.");
				buyer_money -= LATTE_COST;
				System.out.println(LATTE_COST + "�� �����߽��ϴ�.");
				shop_money += LATTE_COST;
			}
			else if(want_item == GREEN_TEA)	{
				System.out.println("������ �����մϴ�.");
				buyer_money -= GREENTEA_COST;
				System.out.println(GREENTEA_COST + "�� �����߽��ϴ�.");
				shop_money += GREENTEA_COST;
			}
			else if(want_item == YUJU_TEA) {
				System.out.println("�������� �����մϴ�.");
				buyer_money -= YUJUTEA_COST;
				System.out.println(YUJUTEA_COST + "�� �����߽��ϴ�.");
				shop_money += YUJUTEA_COST;
			}
			
			make_item = Make_Drink(want_item); 
			System.out.println("�ٸ���Ÿ�� ���Ḧ �����Ͽ����ϴ�.");
			buyer_inventory += make_item;     
			System.out.println(buyer_inventory + "�� ���������κ��� ���޹޾ҽ��ϴ�.");
			
		}
		else {
			System.out.println("���� ��ǰ�̰ų� �������� �����մϴ�.");
		}
		
		System.out.println("���� ������ " + shop_money + "�� �Դϴ�.");
	}
	
	static String Make_Drink(int item) {
		if(item == AMARICANO)
			return "�Ƹ޸�ī��";
		else if(item == LATTE)
			return "��";
		else if(item == GREEN_TEA)
			return "����";
		else
			return "������";
	}
	
	static boolean Order_possiable(int buyer_money, int want_item) {
		if(want_item == AMARICANO && buyer_money >= AMARICANO_COST)	{
			return true;
		}
		else if(want_item == LATTE && buyer_money >= LATTE_COST) {
			return true;
		}
		else if(want_item == GREEN_TEA && buyer_money >= GREENTEA_COST) {
			return true;
		}
		else if(want_item == YUJU_TEA && buyer_money >= YUJUTEA_COST) {
			return true;
		}
		else
			return false;
	}

}
