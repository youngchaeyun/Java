
class F1 {
	static String x = "파이팅 자바";
	static String y = "쉬운 자바";
	static void write() {
		System.out.println(x);
		System.out.println(y);
	}
}

class F2 extends F1 {
	static int x = 500;
	static void write() {
		System.out.println(x);
		System.out.println(y);
	}
}

public class Num23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		F2 o = new F2();
		o.write();
		F2.write();
		F1.write();

	}

}
