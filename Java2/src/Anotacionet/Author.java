package Anotacionet;

import java.lang.annotation.Documented;


@Documented

public @interface Author {
	
	String name();
	String date();
	int currentVersion() default 1;

}
