package p1;

class ExceptionDemo{
	static void compute(int a) throws MyException{
		System.out.println( "CalledCompute("+a+")");
		if(a>10)
			throw new MyException(a);
		System.out.println("exit");
	}
	public static void main(String[] args) {
		try {
			compute(1);
			compute(20);
			
		}catch(MyException e) {
			System.out.println("Caught: "+ e);
		}
	}
}