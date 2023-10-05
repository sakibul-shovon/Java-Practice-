public class diagonalSum {

    public static void diagonal(int arr[][]){
        int sum = 0;

        for(int i=0;i<arr.length;i++)
        {
            //primary diagonal
            sum += arr[i][i];

            //secondary diagonal
            if( i != arr.length -i -1){ // when i =j in secondary diagonal .it already sum in primary diagonal
                sum += arr[i][arr.length -i -1];
            }
            

        }

        System.out.println("Sum = " + sum);
    }


    public static void main(String args[]){
        int arr[][] = { {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}
                        };

    diagonal(arr);
}
}
