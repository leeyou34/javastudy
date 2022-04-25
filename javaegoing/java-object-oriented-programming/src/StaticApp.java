class Foo {
	public static String classVar = "I class var";
	
	public String instanceVar = "I instance var";

	public static void classMethod() {
		System.out.println(classVar); // OK
//		System.out.println(instanceVar);// Error
	}
	
	public void instanceMethod() {
		System.out.println(classVar); // OK
		System.out.println(instanceVar); // OK
	}
}
public class StaticApp {
	
	public static void main(String [] args) {
		System.out.println(Foo.classVar); // okay
//		System.out.println(Foo.instanceVar); // Error
		Foo.classMethod();
		//Foo.instanceMethod(); // class 로 통해 직접 instance에 직접 접근이 금지되어있다. 그래서..
		
		Foo f1 = new Foo();// 인스턴스 생성
		Foo f2 = new Foo();
		
		System.out.println(f1.classVar);
		System.out.println(f1.instanceVar);
		
		f1.classVar = "changed by f1";
		System.out.println(Foo.classVar);
		System.out.println(f2.classVar);
		
		f1.instanceVar = "changed by f1";
		System.out.println(f1.instanceVar);
		System.out.println(f2.instanceVar);
		
		
	}
}
