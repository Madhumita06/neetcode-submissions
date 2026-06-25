class Solution {
    public int trap(int[] height) {
        int n= height.length;
        int[] leftMax = new int[height.length];
        int[]  rightmax = new int[height.length];

        leftMax[0] = height[0];
        rightmax[n-1] = height[n-1];
        for(int i=1;i<height.length;i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }

        for(int j = n-2;j>=0;j--){
            rightmax[j] = Math.max(height[j], rightmax[j+1]);
        }
        int res =0;
        for(int i=0;i<n;i++){
            res += Math.min(rightmax[i], leftMax[i]) - height[i];
        }
        return res;
    }
}
