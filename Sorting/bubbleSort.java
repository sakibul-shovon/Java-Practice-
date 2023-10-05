public class bubbleSort {

    public static void bubble(int arr[]){

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0; j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    public static void main(String args[])
    {
        int arr[] = {1,5,6,8,4,3,6,9};
        bubble(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
