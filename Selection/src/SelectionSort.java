
public class SelectionSort {

	public static void main(String[] args) {
		int[] intArray = {20,35,-15,7,55,1,-22};
		
		selectionSort(intArray);
		print(intArray);

	}
	
	/**@pre none
	 * @post the index1 and index2 will be swapped position in the array
	 * @param array the array the indexes will be swapped from
	 * @param index1 the index of the first element to swap
	 * @param index2 the index of the second element to swap*/
	
   public static void swap(int[] array, int index1, int index2)
   {
	   if(index1 == index2)
		   return;
	   else
	   {
		   int temp;
		   temp = array[index1];
		   array[index1]= array[index2];
		   array[index2] = temp;
	   }
   }
   /**
    * @param intArray the array to sort
    * @post the array will be in sorted order
    */
  public static void selectionSort(int[] array)
  {
	  for(int unsortedIndex = array.length -1;unsortedIndex> 0 ;unsortedIndex --)
	  {
		  int largest = 0;
		  for(int i = 1; i <= unsortedIndex; i++)
		  {
			  if(array[i] > array[largest])
				  largest = i;
		  }
		  swap (array, largest, unsortedIndex);
	  }
  }
   
   public static void print(int[] array)
   {
	   for(int i = 0; i < array.length;i++)
	   {
		   System.out.println(array[i]);
		   
	   }
   }
}
