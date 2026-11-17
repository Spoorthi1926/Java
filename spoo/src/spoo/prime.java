package spoo;

public class prime {
	public static void main(String[]args) {
		add(10,20);
		add(10,20,30);
	}

	static void add(int a,int b) {
			System.out.println(a+b);
		}
	static  int add(int a,int b,int c) {
			return a+b+c;
		}
}
