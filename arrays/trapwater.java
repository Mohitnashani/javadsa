public class trapwater{
    public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trappedrainwater(height));
    }
    public static int trappedrainwater(int height[]){
        //calculate leftmax boundary//
        int leftmax[]=new int [height.length];
        leftmax[0]=height[0];
        for(int i=1;i<height.length;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
            }
        //calcualte rightmax boundary
        int rightmax[] = new int[height.length];
        rightmax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }
        //wlevel=calucate loop for min of left and right boundary
        int totalwater=0;
        for(int i=0;i<height.length;i++){
            int wlevel=Math.min(rightmax[i],leftmax[i]);
            int trapw=wlevel-height[i];
            totalwater=totalwater+trapw;
            }  
        //trapped water=wlevel-height[i]
        System.out.println("Total water trapped="+totalwater);
        return totalwater;
        }
    }