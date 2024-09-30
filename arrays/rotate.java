public class rotate{
    public static int rotate(int nums[],int target){
        // int numss[,]={2,3,4,5,6,7,8,9,10}
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int mid=(left+right)>>1;
            if(nums[0]<=nums[mid]){
                if(nums[0]<=target && target<=nums[mid]){
                    right=mid;
                } else {
                    left=mid+1;
                }
            }else{
                if(nums[mid]<target && target<nums.length-1){
                    left=mid+1;
                }else{
                    right=mid;
                }

            }
        }System.out.println(left);

        return nums[left]==target?left:-1;
    }
    public static void main(String[] args) {
        int array[]={5,8,6,9,40,4,2};
        rotate(array,3);
    }
}
