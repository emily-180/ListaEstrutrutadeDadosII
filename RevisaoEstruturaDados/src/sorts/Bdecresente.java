package sorts;

public class Bdecresente {
	public static void main(String[] args) {
		int[] vetor = {2,9,5,4,8,3,2,5,1,0,2};
		bSortDecresente(vetor);
        System.out.println("Vetor ordenado: ");
        printArray(vetor);
	}
	 public static void bSortDecresente(int array[]){
	        int achou=0;
	        for(int fase=1;fase<array.length;fase++){
	            for(int comp=0;comp<array.length-fase;comp++){
	                if(array[comp]< array[comp+1]){
	                   achou = 1;
	                   int temp = array[comp];
	                   array[comp] = array[comp+1];
	                   array[comp+1] = temp;
	                }//fim if
	            }//fim for comparacao
	            if(achou == 0)
	                break;
	            
	        }//fim for fase
	   }
	 
	 public static void printArray(int array[]){
	        for(int i=0; i<array.length;i++)
	            System.out.print(array[i]+"| ");
	        System.out.println("\n");
	    }//fim printArray
}
