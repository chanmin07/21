abstract class menu { }

class americano extends menu {
    americano(){
        System.out.println("아메리카노 메뉴 생성");
    }
}
class latte extends menu {
    latte(){
        System.out.println("라떼 메뉴 생성");
    }
}
class espresso extends menu {
    espresso(){
        System.out.println("에스프레소 메뉴 생성");
    }
}

class caffee_clerk {
    menu provideItem(String type){
        menu returnItem = null;
        
        if(type.equals("아메리카노"))
            returnItem = new americano();
        else if(type.equals("라떼"))
            returnItem = new latte();
        else if(type.equals("에스프레소"))
            returnItem = new espresso();
        
        return returnItem;
    }
}
