package Week_11th;
import java.util.*;

public class Ex_LinkedList {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(2);       
		list.add(3);       
		list.addFirst(1);  
		list.addLast(4);   
		System.out.println("list:" + list);
		list.add(1, 10);  
		System.out.println("list:" + list);
		
		list.removeFirst(); 
		list.removeLast();  
		System.out.println("list:" + list);
		System.out.println("list 크기:" + list.size());
		
		System.out.println("list에 10의 값이 있는지 검색 : " + list.contains(10));
		System.out.println("list에 2의 값 위치 검색 : " + list.indexOf(2)); 
		System.out.println("list에 5의 값 위치 검색: " + list.indexOf(5)); 
		}
}
