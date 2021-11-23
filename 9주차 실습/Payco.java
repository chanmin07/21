class Payco implements cash_face{//페이코
    public static void main(String[] args) {
        //생략
    }
    @Override
    public void paying_Points() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void Earn_Points() {
        // TODO Auto-generated method stub
        
    }
}
class points extends Payco{
    @Override
    public void paying_Points(){//포인트 결제
        //생략
    }
    @Override
    public void Earn_Points(){//포인트 적립
        //생략
    }
}

class account_Transfer extends Payco{//계좌 송금
    //생략
}
class paying_Card extends Payco{//카드 결제
    //생략
}

class user extends Payco{//회원
    String name;
    String account_num;
    public void Coupon() {//쿠폰
        //생략
    }
    public void franchisee() {//가맹점
        //생략
    }
}
interface cash_face {//인터페이스
    public void paying_Points();
    public void Earn_Points();
}