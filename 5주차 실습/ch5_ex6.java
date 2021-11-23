class NewTime {
    int hour;
    int minute;
    int second;

    NewTime() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    NewTime(int h) {
        this(h, 0, 0);
    }

    NewTime(int h, int min) {
        // Time(h, min, 0);
    }

    NewTime(int h, int min, int sec) {
        hour = h;
        minute = min;
        second = sec;
    }
}

public class ch5_ex6 {
    public static void main(String[] args) {
        NewTime t = new NewTime();
        t.hour = 12;
        t.minute = 20;
        t.second = 25;

        //NewTime t2 = new NewTime(12, 20, 25);

        int res = ch5_ex5.add(3, 5);
        System.out.println("add 5 + 3 : " + res);

        //ch5_ex5 ex5 = new ch5_ex5();
        //int res2 = ex5.min(5, 3);
        //System.out.println("minus 5 - 3 : " + res2);

    }
}
