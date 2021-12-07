import java.lang.annotation.*;
import java.lang.reflect.*;
@SuppressWarnings("unused")
public class Meta {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@MyAnno(str = "My Annotation", val = 100)
	public static void MyMeth(String str, int i) {
		Meta ob = new Meta();
		try {
			Class c = ob.getClass();
			Method m = c.getMethod("MyMeth", String.class, int.class);
			MyAnno anno = m.getAnnotation(MyAnno.class);
			System.out.println(anno.str() + " " + anno.val());
		}catch(NoSuchMethodException e) {
			System.out.println("Method Not Found");
		}
	}
	public static void main(String[] args) {
		MyMeth("2r121r",100);
	}
}
