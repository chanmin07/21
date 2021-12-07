public class Ex_SingleThread {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		for(int i=0; i < 500; i++)
			System.out.printf("%s", new String("-"));		

		System.out.println();
		System.out.print("소요시간:" + (System.currentTimeMillis()- startTime) + "\n"); 
		

		for(int i=0; i < 500; i++) 
			System.out.printf("%s", new String("|"));		

		System.out.println();
		System.out.print("소요시간:" + (System.currentTimeMillis() - startTime) + "\n");
	}
}
