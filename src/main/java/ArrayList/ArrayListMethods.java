package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {
	
	public static void main(String[] args) {
		
		ArrayList<String> ar1 = new ArrayList<String>();
		
		ar1.add("JAVA");
		ar1.add("C++");
		ar1.add("PYTHON");
		ar1.add("JAVASCRIPT");
		
		ArrayList<String> ar2= new ArrayList<String>();
		
		ar2.add("Testing");
		ar2.add("Devops");
		ar2.add("Selenium");
		ar2.add("RestAssured");
		
		System.out.println("Before adding : " +ar1);
		//addAll method
		
		//ar1.addAll(ar2);
		ar1.addAll(2, ar2);
		System.out.println("-----------add/addAll METHODS------------");
		System.out.println("After adding : " +ar1);
		
		
		System.out.println("-----------clear METHOD------------");
		ar1.clear();
		System.out.println(ar1);
		
		System.out.println("----------clone METHOD------------");
		ArrayList<String> clonelist = (ArrayList<String>) ar2.clone();
		System.out.println(clonelist);
		
		System.out.println("-----------contains METHOD------------");
		System.out.println(ar2.contains("Selenium")); //Return type boolean
		
		System.out.println("-----------indexOf METHOD------------");
		System.out.println(ar2.indexOf("Selenium")>0); //Return type boolean
		
		System.out.println("-----------lastIndexOf METHOD------------");
		ArrayList<String> al= new ArrayList<String>(Arrays.asList("sailesh","suresh","sailesh","ramesh","vignesh","sailesh"));
		System.out.println(al.lastIndexOf("sailesh"));
		
		//if the data not avail it will give -1
		System.out.println(al.lastIndexOf("sail"));
		
		System.out.println("-----------remove METHOD------------");
		System.out.println("Before Removing: "+al);
		al.remove(1);  //Remove by index
		System.out.println("After Removing: "+al);
		al.remove("sailesh");  //Remove by value
		System.out.println("After Removing: "+al);  //if we give the duplicate value to remove , it will remove least index element
		
		
		System.out.println("-----------removeIf METHOD------------");
		ArrayList<Integer> num1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
		num1.removeIf(num -> num%2 != 0);
		System.out.println(num1);
		
		System.out.println("-----------retainAll METHOD------------");
		ArrayList<String> nameslst= new ArrayList<String>(Arrays.asList("sailesh","suresh","ramesh","vignesh","kamalesh","somesh","sailesh"));
		System.out.println("Before Retain all method : " +nameslst);
		nameslst.retainAll(Collections.singleton("sailesh"));
		System.out.println("After Retain all method : " +nameslst);
		
		System.out.println("-----------sublist METHOD------------");
		ArrayList<Integer> num2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
		ArrayList<Integer> sublist = new ArrayList<Integer>(num2.subList(2, 8));
		System.out.println(sublist);  //It will exclude the last index and print till before
		
		System.out.println("-----------CONVERT LIST INTO ARRAY-------------");
		ArrayList<String> list= new ArrayList<String>(Arrays.asList("sailesh","suresh","ramesh","vignesh","kamalesh","somesh","sailesh"));
		Object[] arr = list.toArray(); //return type will be object
		
		for(Object e : arr) {
			System.out.println(e); //Print as an object
		}
		for(Object e : arr) {
			System.out.print((String) (e) +","); //To print as a String
		}
		
		
	}  

}
