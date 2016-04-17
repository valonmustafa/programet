package Generics;

public class A {

	public <E extends Comparable<E>> int countElementsGreaterThan(E[] elements, E element) {

		int count = 0;

		for (E e : elements) {
			if (e.compareTo(element)>0) {
				count++;
			}

		}
		

		return count;

	}
}
