package p1;

class Outer{
	int outer_x = 100;
	void test() {
		Inner inner = new Inner();
		inner.display();
	}
	class Inner{
		void display() {
			System.out.println("Outer_x: " + outer_x);
		}
	}
}

