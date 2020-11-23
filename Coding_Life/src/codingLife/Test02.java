package codingLife;

public class Test02 {  //Test01 과 같은 형식이지만 메소드를 활용하여 더욱 편리하게 만든 예제 이다.
	public static void sum(int left, int right) {
		System.out.println(left+right);
	}
	public static void main(String[] args) {
		int left, right;
		
		left= 10;
		right= 20;
		sum(left,right);
		
		left=20;
		right=40;
		sum(left,right);
	}
}
