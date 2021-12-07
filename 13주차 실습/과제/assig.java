 class MultiThread1 extends Thread {
    
    public void run() {
       int array1[] = new int[50];
       int array2[] = new int[50];
       
       for(int i = 0; i <50; i++) {
          array1[i] = i+1;
          array2[i] = i+51;
       }
       
       for(int i = 0; i<50; i++) {
          int randomNum1 = (int)(Math.random()*50);
          int temp = array1[randomNum1];
          int randomNum2 = (int)(Math.random()*50);
          int temp2 = array2[randomNum2];
          array1[randomNum1] = temp2;
          array2[randomNum2] = temp;
       }
       
       for (int i = 0; i < 50;i++) 
          System.out.println(array1[i]+"");
       for (int i = 0 ; i<50; i++)
          System.out.println(array2[i]+"");
    }
 }
 
 class MultiThread2 extends Thread {
    public void run() {
       int array1[] = new int[50];
       int array2[] = new int[50];
       
       for(int i = 0; i <50; i++) {
          array1[i] = i+1;
          array2[i] = i+51;
       }
       
       for (int i = 0; i < 50;i++) 
          System.out.println(array1[i]+"");
       for (int i = 0 ; i<50; i++)
          System.out.println(array2[i]+"");
    }
 }
 
 public class assig { 
    public static void main(String[] args) {
       // TODO Auto-generated method stub
       MultiThread1 th = new MultiThread1();
       MultiThread2 th2 = new MultiThread2();
       th.start();
       try {
          th.join();
          System.out.println("쓰레드1 종료!");
       }catch (InterruptedException e) {
          e.printStackTrace();
       }
       th2.start();
    }
 }