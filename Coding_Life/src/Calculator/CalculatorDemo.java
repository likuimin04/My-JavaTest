package Calculator;

public class CalculatorDemo {
 public static void main(String[] args) {
	 Calculator c1=new Calculator();
	 c1.setOprands(10, 20);
	 c1.plus();
	 c1.minus();
	 c1.multiply();
	 c1.division();
 
	 Calculator c2=new Calculator();
	 c2.setOprands1(30, 80);
	 c2.plus1();
	 c2.minus1();
	 c2.multiply1();
	 c2.division1();
 	}
}
