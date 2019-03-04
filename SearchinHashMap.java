import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SearchinHashMap {

	public static void main(String args[]) {
		Scanner sc =  new Scanner(System.in);
		Map<Long,String> obj1 = new HashMap<Long,String>();
		int i,n;
		String custName;
		long mobNo;
		String searchWord;
		System.out.println("enter no of customers to add");
		n=sc.nextInt();
		for(i=0;i<n;i++) {
		System.out.println("enter customer name");
		custName = sc.next();
		System.out.println("enter customer phone number");
		mobNo=sc.nextLong();
		obj1.put(mobNo,custName);
		}
		System.out.println("enter the element to search");
		searchWord=sc.next();
		if(obj1.containsValue(searchWord))
			System.out.println("element found");
		else
			System.out.println("element not found");
		
	}
}
