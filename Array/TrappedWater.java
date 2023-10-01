public class TrappedWater {

    public static int Trapped(int height[]){
        //calculate left and right ma
        //loop 
        //waterLevel = min(leftmax,rightmax);
        //trapper = waterlevel - height
        int n = height.length;
        int leftMax[] = new int [n];
        int rightMax[] = new int [n];

        leftMax[0] = height[0];

        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }

        rightMax[n-1] = height[n-1];

        for(int i=n-2;i>=0;i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }

        int trapperWater = 0;

        for(int i=0;i<n;i++)
        {
            int waterLevel  = Math.min(leftMax[i],rightMax[i]);
            trapperWater += (waterLevel - height[i]);
        }

        return trapperWater;
    }
    
    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};

        System.out.println("Total Trapper water is: " + Trapped(height));
    }
}
