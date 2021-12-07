package InstanceOf;

class A {
	int i, j;
}

class B{
	int i, j;
}
class C extends A{
	int k;
}
class D extends A{
	int k;
}
class InstanceOf{
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		if(a instanceof A)
			System.out.println("a is instance of A");
		if(b instanceof B)
			System.out.println("b is instance of B");
		if(c instanceof C)
			System.out.println("c is instance of A");
		if(c instanceof A)
			System.out.println("c can be cast to A");
		if(a instanceof C)
			System.out.println("a can be cast to C");
		System.out.println();
		
		A ob = c;
		System.out.println("Ob now refers to C");
		
		if(c instanceof A)
			System.out.println("c can be cast to A");
		else
			System.out.println("c can not be cast to A");
		
		System.out.println();
		
		if(a instanceof Object)
			System.out.println("a may be cast to Object");
		if(b instanceof Object)
			System.out.println("b may be cast to Object");
		if(c instanceof Object)
			System.out.println("c may be cast to Object");
		if(d instanceof Object)
			System.out.println("d may be cast to Object");
		
	}
}
