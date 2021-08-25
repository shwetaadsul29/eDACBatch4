package linearSeach;


public class LinearSearchAlgo {

	
	public static String linearSearch(int arr[], int elementToSearch) {

	    for (int index = 0; index < arr.length; index++) {
	        if (arr[index] == elementToSearch)
	            return "Found";
	    }
	    return "Not Found";
	}

	
	}