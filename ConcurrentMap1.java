import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;;


public class ConcurrentMap1 {

		
		
	
	public static  void customers() {
		Scanner sc = new Scanner(System.in);
		ConcurrentMap<Long,String> obj1 = new ConcurrentHashMap<Long,String>();
		String custName;
		long mobNo;
		int n,i;
		System.out.println("enter no of customers to add");
		n=sc.nextInt();
		for(i=0;i<n;i++) {
		System.out.println("enter customer name");
		custName = sc.next();
		System.out.println("enter customer phone number");
		mobNo=sc.nextLong();
		obj1.put(mobNo,custName);
		}
		System.out.println(obj1);
		
	}
	public static void main(String args[]) {
		customers();
	
	}
	
}
