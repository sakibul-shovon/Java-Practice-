public class selectionSort {

    public static void selection(int arr[]){

        for(int i=0; i<arr.length-1; i++) {
            int minPosition = i;
            
            for(int j=i+1; j<arr.length; j++) {
                if(arr[minPosition] > arr[j]) { 
                    minPosition = j;
                }
            }
            
            // int temp = arr[i];
            // arr[i] = arr[minPosition];
            // arr[minPosition] = temp;

            int temp = arr[minPosition];
            arr[minPosition] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String args[]) {
        int arr[] = {5, 1, 3, 2, 4};
        selection(arr);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
