package sorts;

public class Sselection {
	public static void main(String[] args) {
		char[] charArray = {'z', 'b', 'a', 'c', 'e', 'd'};
	    sSort(charArray);

	    System.out.println("Vetor ordenado:");
	    for (char ch : charArray) {
	        System.out.print(ch + " ");
	    }
	}
	
	private static int indexMinArray(char array[], int posAtual) {
	    int indexMin = posAtual;

	    for (int i = posAtual + 1; i < array.length; i++) {
	        if (array[i] < array[indexMin]) 
	            indexMin = i;
	    }

	    return indexMin;
	}

	public static void sSort(char array[]) {
	    for (int i = 0; i < array.length - 1; i++) { 
	        int k = indexMinArray(array, i);
	        swap(array, i, k);
	    }
	}

	public static void swap(char array[], int a, int b) {
	    char temp = array[a];
	    array[a] = array[b];
	    array[b] = temp;
	}
}
