package AssistedPracticeProjects;

public class InsertionSort {
	public static  void main(String[] args){

        int[] arr = {9,12,3,21,44};
        insertionSort(arr);
        for(int i=0;i<arr.length;i++){

            System.out.println(arr[i]);

        }
        System.out.println("\n");
        System.out.println("Process finished with exit code 0");
     }
    public static void insertionSort(int[] arr){

    int len = arr.length;
    for(int j=1;j<len;j++){
    int key = arr[j];
    int i=j-1;
    while ((i>-1) && (arr[i]>key)){

        arr[i+1]=arr[i];
        i--;
    }
    arr[i+1]=key;
         }

    }


}
