package Stringjet;

import java.util.ArrayList;
import java.util.List;

public class StringBuilderi {

	public static void main(String[] args) {
		
		StringBuilder sb= new StringBuilder();
		System.out.printf("Capacity= %d%n", sb.capacity());
		System.out.printf("length= %d%n", sb.length());
		System.out.printf("content= %s%n", sb.toString());
		
		sb.append("Pershendetje");
		System.out.printf("Capacity= %d%n", sb.capacity());
		System.out.printf("length= %d%n", sb.length());
		System.out.printf("content= %s%n", sb.toString());
		
		sb.setLength(32);
		System.out.printf("Capacity= %d%n", sb.capacity());
		System.out.printf("length= %d%n", sb.length());
		System.out.printf("content= %s%n", sb.toString());
		
		String s1="text1";
		String s2= "text2";
		String s3="text3";
		
		String s= s1+s2+s3;
		StringBuilder ss= new StringBuilder();
		ss.append(s1);
		ss.append(s2);
		ss.append(s3);
		ss.insert(5, "palidhje");
		
		ss.replace(5, 7, "me");
		
		
		
		/*ss.append(s1).append(s2).append(s3);*/
		
		System.out.printf("content (s)=%s%n",s.toString());
		System.out.printf("content (ss)=%s%n",ss.toString());
		
		String sss=String.format("%s%s%s", s1,s2,s3);
		System.out.printf("content(sss) =%s%n",sss);
		
		
		ss.reverse();
		System.out.printf("content (ss)=%s%n",ss.toString());
		
		
		List<Integer> intList= new ArrayList<>();
		
		Integer i1= new Integer(-1);
		Integer i2= new Integer(5);
		Integer i3= new Integer(10);
		
		intList.add(i1);
		intList.add(i2);
		intList.add(i3);
		
		
		//Autoboxing
		int i4=100;
		intList.add(i4);
		
		for (Integer i : intList) {
			System.out.printf("%d%n",i);
		}
		
		//Unboxing
		Integer i5=7;
		System.out.printf("%d%n",i5);
		
		StringBuilder sb2=new StringBuilder("10-02-1991");
		System.out.printf("%s%n",sb2.toString().replace("-","/"));
		
		
	}
}
