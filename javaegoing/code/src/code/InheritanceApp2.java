package code;

class Calc {
	int v1, v2;
	Calc(int v1, int v2) {
		System.out.println("Cal init!!");
		this.v1 = v1;
		this.v2 = v2;
	}
	public int sum() {
		return this.v1+v2;
		}
}

class Calc3 extends Calc{
	
	Calc3(int v1, int v2) {
		super (v1, v2);
		System.out.println("Cal3 init!!");
	}
	public int minus() {
		return this.v1-v2;
		}
}

public class InheritanceApp2 {

	public static void main(String[] args) {
		Calc c = new Calc(2,1);
		Calc3 c3 = new Calc3(2,1);
		System.out.println(c3.sum()); // 3
		System.out.println(c3.minus()); // 1
		
	}

}
