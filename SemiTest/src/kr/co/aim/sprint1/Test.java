package kr.co.aim.sprint1;

public class Test {
	public static void main(String[] args) {
		if (returnTrue() && returnFalse()) {
			System.out.println("true && false");
		}
		
		if (returnTrue() || returnFalse()) {
			System.out.println("true || false");
		}
		
		if (returnFalse() || returnTrue()) {
			System.out.println("false || true");
		}
		
		if (returnFalse() && returnTrue()) {
			System.out.println("false && true");
		}
	}

	private static boolean returnTrue() {
		System.out.println("true");
		return true;
	}
	
	private static boolean returnFalse() {
		System.out.println("false");
		return false;
	}
}
