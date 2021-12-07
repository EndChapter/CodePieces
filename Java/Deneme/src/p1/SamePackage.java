package p1;

public class SamePackage {

	SamePackage() {
		// TODO Auto-generated constructor stub
		Protection p1 = new Protection();
		System.out.println("Same package constructor");
		System.out.println("n = "+ p1.n );
		System.out.println("n_pri = "+ p1.n_pri );
		System.out.println("n_pro = "+ p1.n_pro );
		System.out.println("n_pub = "+ p1.n_pub );
	}

}
