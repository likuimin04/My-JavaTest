package Calculator;

public class Calculator {
	int left, right;
	double left1,right1;
	
	public void setOprands(int left, int right) {
		this.left=left;
		this.right=right;
	}
	
	public void setOprands1(double left1, double right1) {
		this.left1=left1;
		this.right1=right1;
	}
		
		public void plus1() {
			System.out.println(this.left1 + this.right1);
		}
		public void minus1() {
			System.out.println(this.left1 - this.right1);
		}
		public void multiply1() {
			System.out.println(this.left1 * this.right1);
		}
		public void division1() {
			System.out.println(this.left1 / this.right1);
		}
		public void plus() {
			System.out.println(this.left + this.right);
		}
		public void minus() {
			System.out.println(this.left - this.right);
		}
		public void multiply() {
			System.out.println(this.left * this.right);
		}
		public void division() {
			System.out.println(this.left / this.right);
		}
}
