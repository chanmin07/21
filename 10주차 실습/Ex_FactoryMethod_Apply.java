abstract class NItem { }

class NOrangeJuice extends NItem { /* ���� */ }
class NMelonJuice extends NItem { /* ���� */ } 
class NGreenTea extends NItem { /* ���� */ }

class ItemFactory {
    public NItem createItem(String type) {
    NItem returnItem = null;
    
        if(type.equals("�������꽺"))
            returnItem = new NOrangeJuice();
        else if(type.equals("����꽺"))
            returnItem = new NMelonJuice();
        else if(type.equals("����"))
            returnItem = new NGreenTea();

        return returnItem;
    }
}

class NVendingMachine {
    public NItem provideItem(String type) { 
        ItemFactory factory = new ItemFactory();
        NItem returnType = factory.createItem(type);

        return returnType;
    }
}

class NBuyer {
    public static void main(String[] args) {
        NVendingMachine vm = new NVendingMachine();
        vm.provideItem("�������꽺");
        vm.provideItem("����");
    }
}

public class Ex_FactoryMethod_Apply {

}
