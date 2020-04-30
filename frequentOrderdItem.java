package appleInterview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class frequentOrderdItem {
	
	 public static <T> void main(String args[]) {
		 
		 Map<String, Map<String, Object>> order_Items  =new HashMap<>();
		 
		 findingFrequentOrderItem(order_Items);
		
		
	 }

	private static void findingFrequentOrderItem(Map<String, Map<String, Object>> order_Items) {
		
		
		
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter the number of Orders ");
		 
		 int numberOfOrders = s.nextInt();
		 order_Items =new HashMap<>();
		 
		 for(int i=0 ; i<numberOfOrders ; i++)
		 {
			System.out.println("Given Order Name");
			String nameOfOrder = s.next();
			
			System.out.println("Enter total items number ");
			int numberoOfItem= s.nextInt();
			
			for(int j=0 ; j< numberoOfItem ; j++)
			{
				String nameOfItem = s.next();
				if(order_Items.containsKey(nameOfItem))
				{
					Map<String, Object> newItem_details = order_Items.get(nameOfItem);
					List<String> order = (List<String>) newItem_details.get("corresponding order");
					order.add(nameOfOrder);
					
					newItem_details.put("corresponding order", order);
					newItem_details.put("usuage count", Integer.parseInt(newItem_details.get("usuage count").toString()) +1 ) ;
				}
				else
				{
					Map<String, Object> newItem_details = new HashMap<>();
					List<String> order= new ArrayList<>();
					order.add(nameOfOrder);
					
					newItem_details.put("corresponding order", order);
					newItem_details.put("usuage count", 1);
					
					order_Items.put(nameOfItem, newItem_details);   /*This adds new item to the dictionary if the item isnot exists already*/
				}
			}
		 }


		 
		 System.out.println("Order Listof Items" +order_Items);
		 String val1 = null;
		 List<String> keyList = new ArrayList<String>();
		 
		 Set<Entry<String, Map<String, Object>>> entries = order_Items.entrySet(); 
		 for( Entry<String, Map<String, Object>> entry : entries)
		 { 

			 val1 = entry.getKey() + " ==> " + entry.getValue();
			 keyList.add(val1);
			 

		 }
		 for(int i=0 ;i<2 ;i++)
		 {
			 System.out.println("The Key list " +keyList.get(i));
		 }
	}

}
