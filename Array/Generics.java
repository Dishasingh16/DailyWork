package Array;

class Test<T> {
	private T obj;

	public T get() {
		return obj;
	}

	public void set(T ob) {
		this.obj = ob;
	}
}

public class Generics {

	public static void main(String[] args) {
		Test<Integer> t = new Test<>();
		t.set(5);
		int i = t.get();
		System.out.println(i);
	}
}
