public class manis{
    public boolean containsduplicate(int[] nums){
    for(int i=0; i<nums.length-1 ; i++) {
        for(int j=i+1; j<nums.length ; j++ ) {
            if( nums[i] == nums[j] ) {
                return true ; 
            }
        }
    }
    return false;
}
    public void main(String[] args) {
        int height[]={4,4,6,8,4,3};
        containsduplicate(height);
    }
}