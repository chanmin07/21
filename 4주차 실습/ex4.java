public class ex4 {
    public static void main(String[] args) {
        int[] math = { 1, 2, 3, 4, 5 } ;
		int[] newMath = new int[5];
		
		System.out.println("math의 주소 : " + math);
		System.out.println("newMath의 주소 : " + newMath);
		
		for(int i=0;i<math.length;i++)
			newMath[i]=math[i];
		
		for(int i=0;i<newMath.length;i++){
			if(i == 0)
				System.out.printf("newMath 데이터 : ");
			System.out.printf("%d ", newMath[i]);
		}
		System.out.println();
		
		int[] mathClone = math.clone();
		System.out.println("mathClone의 주소 : " + mathClone);
		
		for(int i=0;i<mathClone.length;i++){
			if(i == 0)
				System.out.printf("mathClone 데이터 : ");
			System.out.printf("%d ", mathClone[i]);
		}
		System.out.println();
		
		for(int i=0;i<newMath.length;i++) 
			newMath[i]=0;
		
		System.arraycopy(math, 2, newMath, 0, 2); 
		
		for(int i=0;i<newMath.length;i++){
			if(i == 0)
				System.out.printf("newMath 데이터 : ");
			System.out.printf("%d ", newMath[i]);
		}
		System.out.println();
    }
}
