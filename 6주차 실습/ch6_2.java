class Time{
    private int hour;
    //private int min;
    //private int sec;

    public int geth(){
        return hour;
    }
    public boolean seth(int hour){
        if(hour < 0 || hour > 23){
            return false;
        }
        this.hour = hour;
        return true;
    }
}

public class ch6_2 {
    public static void main(String[] args) {
        Time t = new Time();
        t.seth(22);
        System.out.println("현재 시간은 : " + t.geth() + "시");
    }
    
}
