import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)//Class, Source
public @interface MyAnno {
	String str() default "Testing";
	int val() default 100;
}
