package test.com;

public class StaticMethodTest {
	
	static int i =2;
	int i1 = 121 ;
	static final int b = 20;
	
	
	
	public StaticMethodTest(){
		
		i++;
		
	}
	
	static void testname(){
		
		System.out.println("abhi");
	}
	public static void main(String[] args) {
		
		System.out.println(StaticMethodTest.i);
		StaticMethodTest obj2 = new StaticMethodTest();
		
		System.out.println(StaticMethodTest.i);
	}

}
