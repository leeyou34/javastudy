class Print {
	
	public static void a(String delimiter) {
		System.out.println(delimiter);
		System.out.println("a");
		System.out.println("a");
	}
	
	public static void b(String delimiter) {
		System.out.println(delimiter);
		System.out.println("b");
		System.out.println("b");
	}
	
	public static void c(String delimiter) {

}

	public class staticMethod {
		
		public void main(String[] args) {
	
			Print.a("-");
			Print.b("*");
			Print.c("$");
			}
	
		}
}
