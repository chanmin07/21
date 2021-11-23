public class assignment3 {
    public static void main(String[] args) {
        //String 클래스 str의 내용을 "Working", StringBuffer 클래스 sb 내용을 "Break Time" 를 각각 생성한다. 
        //sb 의 값을 str의 값과 동일하게 변경한 뒤,  두 값을 비교해 동일한 것으로 판단한 결과를 출력하시오.
        //실행 결과는 아래와 같다.
        //str와 sb는 같은 문자열입니다.
        String str = new String("Working");
        StringBuffer sb = new StringBuffer("Break Time");
        sb.delete(0, 10);
        sb.append("Working");
        if(str.toString().equals(sb.toString())){
            System.out.println(str + " | " + sb);
            System.out.println("str와 sb는 같은 문자열입니다.");
        }
        else {
            System.out.println(str + " | " + sb);
            System.out.println("str와 sb는 같은 문자열이 아닙니다.");
        }
    }
}
