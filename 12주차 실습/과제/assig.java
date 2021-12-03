import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class assig {
    public static void main(String[] args) {
        List list = new ArrayList();

        for(int i = 2; i <= 100; i++){ //소수 구분
            for(int j = 2; j <= i; j ++){
                if(i % j == 0 && i != j){
                    break;
                }
                if(i == j){
                    list.add(i);
                    System.out.printf(i + " ");
                }
            }
        }

        System.out.println("\n");
        System.out.printf("소수 목록 : ");
        System.out.println(list.toString());
    }
}
