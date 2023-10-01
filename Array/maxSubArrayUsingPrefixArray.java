public class maxSubArrayUsingPrefixArray {


    public static void arr_pair(int arr[])
    {
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        
        int prefix[] = new int [arr.length];

        prefix[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }


        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++)
            {
                curr_sum = i==0?prefix[j]:prefix[j]-prefix[i-1];

                if(max_sum < curr_sum) max_sum = curr_sum;
            }
            
        }

        System.out.println("Max Sum = " + max_sum);
    }
    public static void main(String args[]){
        int arr[] = {1,-2,6,-1,3};
        arr_pair(arr);
    }
}
