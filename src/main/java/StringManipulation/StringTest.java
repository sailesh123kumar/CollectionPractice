package StringManipulation;

public class StringTest {

	

	public static void main(String[] args) {
		
		// 1.Using String Literals
		// 2.Using new keyword

		String s1 = "Hello"; // 1 Obj - SCP= String Constant pool
		String s2 = new String("Hello"); // 1 Obj - Heap

		String s3 = new String("Sailesh"); // 2 obj - 1 SCP , 1 Heap

		String s4 = "Sailesh"; // 0 Obj - Since we already created with new keyword it will create obj on both
								// heap and scp on line no 15
		
		String s5 = new String("Sailesh");
		
		String s6 ="sailesh";
		
		String s7 ="sailesh";
		
		String t1= "Hello";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s1==t1);
		System.out.println(s1.equals(t1));
		
		String r1= new String("Selenium");
		
		r1=r1.intern();
		
		

	}

}
