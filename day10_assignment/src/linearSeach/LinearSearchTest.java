package linearSeach;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LinearSearchTest {

	@Test
	void ElementFoundtest() {
	//	LinearSearchAlgo search = new LinearSearchAlgo();
		// int [] listElements= {2,12,10,16,89};
		int elementToSearch=12;
		
		//search.linearSearch(listElements, elementToSearch);
	assertEquals("Found",LinearSearchAlgo.linearSearch((new int[]{10,12,34,2,5}), elementToSearch) );
	}

}
