package test;


interface Helloz{
	int add(int a,int b);	
	
	default int multiply(int a, int b) {
		return a*b;
	}
	static int rem(int a, int b) {
		return a%b;
	}

}

interface sub extends Helloz{
	int sub(int a, int b);
	}

class div{
		public int div(int a, int b) {
			return a/b;
		}
	}

class Imp extends div implements sub{
		public int add(int a, int b) {
		return a+b;
		}
		public int sub(int a, int b) {
			return a-b;
		}
	}

public class look {

		public static void main(String args[]) {

		Imp i = new Imp();
		System.out.println(+i.multiply(5,3));
		System.out.println(+i.add(2,3));
		System.out.println(+i.sub(5,3));
		System.out.println(+i.div(6,3));
		System.out.println(Helloz.rem(9,3));
		}
}
