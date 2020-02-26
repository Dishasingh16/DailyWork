package Lambda;

public class Summ {
public static void main(String[] args) {
	
	Hello1 add =(a,b) -> a+b;
	Hello1 sub =(a,b) -> a-b;
	System.out.println(add.calculate(3, 5));
	System.out.println(sub.calculate(3, 5));

}
}
@FunctionalInterface
interface Hello1{
	double calculate(double a,double b);
	
}