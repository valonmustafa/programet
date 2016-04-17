package Generics;

import java.util.List;

public class GenericMethodUshtrime {

	public <E extends Comparable<E>> int findOccurences(E[] elements, E e) {

		int count = 0;
		for (E element : elements) {
			if (element.compareTo(e) == 0) {
				count++;
			}
		}
		return count;

	}

	public void printArray(List<? super Integer> array) {
		
		for (Object o : array) {
			System.out.printf("%s ", o);
		}
	}

}
