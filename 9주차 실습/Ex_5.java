abstract class NCoffeeShop {
    int money; 
    int coffeeStock;
    String printStock() {
        return "Ŀ�� ��� : " + coffeeStock;
    }
    
    NCoffeeShop(int money, int coffeeStock)
    {
        this.money = money;
        this.coffeeStock = coffeeStock;
    }
}

class AngelCoffee extends NCoffeeShop {
    int teaStock;

    String printStock() {
        return super.printStock() + " ȫ�� ��� : " + teaStock;
    }

    String brewing(int money) {
        this.money += money; 
    if(money == 4500)    
        return "õ��ٹ� �Ƹ޸�ī�븦 �����߽��ϴ�"; 
    else if(money == 5000) 
        return "õ��ٹ� �󶼸� �����߽��ϴ�";
    else if(money == 5700) 
        return "õ��ٹ� ȫ���� �����߽��ϴ�"; 
    else {
        this.money -= money;
        return "�޴��� �ٽ� ����ֽʽÿ�.";
        }
    }

    AngelCoffee(int money, int coffeeStock, int teaStock)
    {
        super(money, coffeeStock);
        this.teaStock = teaStock;
    }
}

class HellCoffee extends NCoffeeShop {
    int teaStock;
    int powder;

    String printStock(int powder) {
    	this.powder += powder;
        return super.printStock() + " ����� ��� : " + teaStock + " �Ŀ�� �԰� : " + powder;
    }
    
    //int printStock() {
    	//return this.coffeeStock + this.teaStock;
    //}

    String brewing(int money) {
        this.money += money; 
    if(money == 4500)    
        return "�����ٹ� �Ƹ޸�ī�븦 �����߽��ϴ�"; 
    else if(money == 5000) 
        return "�����ٹ� �󶼸� �����߽��ϴ�";
    else if(money == 5700) 
        return "�����ٹ� ȫ���� �����߽��ϴ�"; 
    else {
        this.money -= money;
        return "�޴��� �ٽ� ����ֽʽÿ�.";
        }
    }
    
    String brewing(int money, int tip) {
        this.money += money; 
    if(money == 4500)    
        return "�����ٹ� �Ƹ޸�ī�븦 �����߽��ϴ�" + tip + "������"; 
    else if(money == 5000) 
        return "�����ٹ� �󶼸� �����߽��ϴ�" + tip + "������";
    else if(money == 5700) 
        return "�����ٹ� ȫ���� �����߽��ϴ�" + tip + "������"; 
    else {
        this.money -= money;
        return "�޴��� �ٽ� ����ֽʽÿ�." + tip + "������";
        }
    }

    HellCoffee(int money, int coffeeStock, int teaStock, int powder)
    {
        super(money, coffeeStock);
        this.teaStock = teaStock;
        this.powder = powder;
    }
}
 
public class Ex_5 { }
