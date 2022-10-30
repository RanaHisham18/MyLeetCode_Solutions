class Solution {
    public int averageValue(int[] nums) {
        int sum = 0;
        int counter = 0;
        for(int i:nums){
            if(i%3 == 0 && i%2==0){
                sum+=i;
                counter++;
            }
        }
        if(counter==0) return 0;
        return Math.round(sum/counter);
    }
}
