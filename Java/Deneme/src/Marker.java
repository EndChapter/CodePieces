import java.lang.reflect.Method;

public class Marker {
	@MyMarker
	public static void MyMeth() {
		Marker ob = new Marker();
		try {
			Method m = ob.getClass().getMethod("MyMeth");
			if(m.isAnnotationPresent(MyMarker.class))
				System.out.println("MyMarker Present");;
			
		}catch(NoSuchMethodException exc) {
			System.out.println("Method not found");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMeth();
	}

}
