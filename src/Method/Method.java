package Method;

public class Method {
	public static void main(String[] args) {
		Method obj = new Method();
		obj.print("Hello");
		
		// Addition
		obj.addition(2, 3);
	}
	
	void print(String a) {
		System.out.println(a);
	}
	
	int addition(int a, int b) {
		System.out.println(a+b);
		return a + b;
	}
}
