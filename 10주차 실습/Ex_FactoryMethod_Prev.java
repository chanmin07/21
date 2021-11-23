abstract class Item { }

class OrangeJuice extends Item {
        OrangeJuice(){
        System.out.println("�������꽺 ����");
    }
}
class MelonJuice extends Item {
        MelonJuice(){
        System.out.println("����꽺 ����");
    }
}
class GreenTea extends Item {
        GreenTea(){
        System.out.println("���� ����");
    }
}

class VendingMachine {
    Item provideItem(String type){
        Item returnItem = null;
        
        if(type.equals("�������꽺"))
            returnItem = new OrangeJuice();
        else if(type.equals("����꽺"))
            returnItem = new OrangeJuice();
        else if(type.equals("����"))
            returnItem = new GreenTea();
        
        return returnItem;
    }
}

class Buyer {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        vm.provideItem("�������꽺");
        vm.provideItem("����");
    }
}

public class Ex_FactoryMethod_Prev {

}
