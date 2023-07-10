//Problem link:- https://leetcode.com/contest/weekly-contest-353/problems/longest-non-decreasing-subarray-from-two-arrays/

//solution:-
class Solution {
    public int maxNonDecreasingLength(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int[][] dp=new int[n][2];
        int ans=1;
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],1);
        }
        
        for(int i=1;i<n;i++){
            if(nums1[i]>=nums1[i-1]){
                dp[i][0]=Math.max(dp[i][0], dp[i-1][0]+1);
            }
            if(nums1[i]>=nums2[i-1]){
                dp[i][0]=Math.max(dp[i][0],dp[i-1][1]+1);
            }
            if(nums2[i]>=nums1[i-1]){
                dp[i][1]=Math.max(dp[i][1],dp[i-1][0]+1);
                
            }
            if(nums2[i]>=nums2[i-1]){
                dp[i][1]=Math.max(dp[i][1],dp[i-1][1]+1);
            }
            ans=Math.max(ans,dp[i][0]);
            ans=Math.max(ans,dp[i][1]);
        }
        return ans;
        
    }
}
