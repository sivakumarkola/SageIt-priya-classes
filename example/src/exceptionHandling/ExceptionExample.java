package exceptionHandling;

public class ExceptionExample {

	public static void main(String[] args) {
		try {
			System.out.println("s1");
			System.out.println("s2");
			System.out.println("s3");
			try {
				System.out.println("s4");
				System.out.println("s5");
				System.out.println("s6");	
			} catch (Exception e) {
				System.out.println("s7");
				
			}
			finally {
				System.out.println("s8");
			}
			System.out.println("s9");
		} catch (Exception e) {
			System.out.println("s10");
		}
		finally {
			System.out.println("s11");
		}
		System.out.println("s12");
	}

}
