package ex05;

public class Ex05 {

	public static void main(String[] args) {

		int n = 2;
		switch (n) {
		case 1:
			System.out.println("n은 1입니다.");
			break;
		case 2:
			System.out.println("n은 2입니다.");
		case 3:
			System.out.println("n은 3입니다.");
		case 4:
			System.out.println("n은 4입니다.");
			break;
		default:
			System.out.println("기본");
			break;
		}
		
		System.out.println("종료됩니다.");

		if (n == 1) {
			System.out.println("n은 1입니다.");
		} else if (2 <= n && n <= 4) {
			System.out.println("n은 2입니다.");
			System.out.println("n은 3입니다.");
			System.out.println("n은 4입니다.");
		} else {
			System.out.println("기본");
		}

		System.out.println("종료됩니다.");

	}

}









