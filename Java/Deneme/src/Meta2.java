import java.lang.annotation.*;
import java.lang.reflect.*;

@What(Description = "ýqwenjofmkpölqwçþ")
@MyAnno(str = "ýqqnwjfmköqwllþ", val = 99)
public class Meta2 	{
	@What(Description = "ýqwenjofmkpölqwçþ")
	@MyAnno(str = "ýqqnwjfmköqwllþ", val = 99)
	public static void myMeth() {
		Meta2 ob = new Meta2();
		try {
			Annotation annos[] = ob.getClass().getAnnotations();
			for(Annotation a:annos) {
				System.out.println(a);
			}
			System.out.println();
			Method m = ob.getClass().getMethod("myMeth");
			annos = m.getAnnotations();
			for(Annotation a:annos)
				System.out.println(a);
			
		}catch(NoSuchMethodException exc) {
			System.out.println("Method not found");
		}
	}
	public static void main(String[] args) {
		myMeth();
	}
}
