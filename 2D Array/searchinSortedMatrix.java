//Search for a key in row wise and column wise sorted matrix

public class searchinSortedMatrix {
    
    public static boolean findKey(int arr[][], int key){
        int row = 0,column = arr.length-1;//array index of value = 40

        while(row < arr.length && column >=0){
            if(arr[row][column] == key){
                System.out.println("Found at " +"(" + row + ","+ column + ")");
                return true;
            }

            else if(key < arr[row][column]){
                column--;
            }
            else{
                row++;
            }
        }
        System.out.println("KEY NOT FOUND!");
        return false;
    }

    public static void main(String args[]){
        int arr[][] = {
        {10,20,30,40},
        {15,25,35,45},
        {27,29,37,48},
        {32,33,39,50}
    };

    int key = 33;
    findKey(arr,key);
    }
}
