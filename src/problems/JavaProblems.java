package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class JavaProblems {
	
	public static int mostFrequentOne(List<Integer> any) {
		int mostfrequentitem = any.get(0);
		int mostfrequentOne = 0;
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<any.size();i++) {
//			map.put(any.get(i), Collections.frequency(any, any.get(i)));
			map.put(any.get(i), frequency(any,any.get(i)));
		}
		for(Entry<Integer,Integer> m:map.entrySet()) {
			if ( m.getValue() >mostfrequentOne) {
				mostfrequentOne = m.getValue();
				mostfrequentitem = m.getKey();
			}
		}
		return mostfrequentitem;
	}
	
	//please check Collections.frequency function in java code
	public static int frequency(Collection c , Object o) {
		int value = 0;
		for(Object obj:c) {
			if(obj.equals(o))
				value++;	
		}
		return value;
		
	}
	
	public static String reverseString(String any){
		String reversed = "";
//		char[] str = any.toCharArray();
//		for(int i=str.length-1;i>-1;i--) {
//			
//			reversed = reversed + str[i];
//		}
		
		for(int i=any.length()-1;i>-1;i--) {
			reversed = reversed + any.charAt(i);
		}
		return reversed;
		
	}
	
	public static String removeNumbers(String any) {
		String trimmed = "";
		for(int i=0;i<any.length()-1;i++) {
			if (Character.isDigit(any.charAt(i)) != true)
				trimmed = trimmed + any.charAt(i);
		}
		return trimmed;
	}
	
//	public static String addOnlyNum(String any) {
//		List<Integer> list = new ArrayList<Integer>();
//		String temp = "";
//		for(int i=0;i<any.length()-1;i++) {
//			
//			if (Character.isDigit(any.charAt(i)) == true)
//				temp = temp +any.charAt(i);
//				
//		}
//		return trimmed;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = Arrays.asList(1,2,5,1,1,1,1,7,7,7,7);
		System.out.println(mostFrequentOne(arr));
		System.out.println(reverseString("john"));
		System.out.println(removeNumbers("AKil3ya45Ranu"));
	}

}
