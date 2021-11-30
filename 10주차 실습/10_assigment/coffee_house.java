class Barista implements clerk{ //바리스타
    int money; // 판매한 커피값을 저장 할 변수
    int coffeeStock;
    String printStock() {
        return "커피 재고 : " + coffeeStock;
    }
    Barista(int money, int coffeeStock)
    {
        this.money = money;
        this.coffeeStock = coffeeStock;
    }
    public String brewing(int money) { //점원 매뉴얼
        this.money += money;
        if(money == 4500)
            return "아메리카노를 구입했습니다"; 
        else if(money == 5000)
            return "라떼를 구입했습니다";
        else if(money == 5500)
            return "에스프레소를 구입했습니다"; 
        else {
            this.money -= money;
            return "메뉴를 다시 골라주십시오.";
        }
    }
}
interface clerk { //점원  
    String brewing(int money);
}

public class coffee_house {
    public static void main(String[] args) {
        caffee_clerk cc = new caffee_clerk();
        cc.provideItem("달고나 라떼");
        cc.provideItem("녹차라떼");
    }
}
