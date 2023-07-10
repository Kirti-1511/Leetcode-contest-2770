// problem link: https://leetcode.com/contest/weekly-contest-353/problems/maximum-number-of-jumps-to-reach-the-last-index/

//solution
class Solution {
    public int maximumJumps(int[] nums, int target) {
        
        
        
        
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        dp[0]=0;
        
        for(int i=0;i<nums.length;i++){
            if(dp[i]==-1) continue;
            for(int j=i+1;j<nums.length;j++){
               if(nums[j]-nums[i] >= -target && nums[j]-nums[i] <= target){
                   dp[j]=Math.max(dp[j],dp[i]+1);
               }
               
            }
        }
        return dp[nums.length-1];
       
    }
}
