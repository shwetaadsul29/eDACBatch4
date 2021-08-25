package bubbleSort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BubbleSortTest {

	@Test
	public void whenSortedWithBubbleSort_thenGetSortedArray() {
	    int[] array = { 2, 1, 4, 6, 3, 5 };
	    int[] sortedArray = { 1, 2, 3, 4, 5, 6 };
	   SortedBubbleSort bubbleSort = new SortedBubbleSort();
	    SortedBubbleSort.bubbleSort(array);
	    
	    assertArrayEquals(array, sortedArray);

}
}