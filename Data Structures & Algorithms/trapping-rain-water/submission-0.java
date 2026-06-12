class Solution {
    public int trap(int[] height) {
        int n= height.length;
        int[] premax = new int[n];
        int[] sufmax = new int[n];
        int prefix =0, suffix=0;
        for(int i=0;i<n;i++){
            prefix = Math.max(prefix,height[i]);
            premax[i]=prefix;
        }

        for(int j=n-1;j>=0;j--){
            suffix = Math.max(suffix,height[j]);
            sufmax[j]=suffix;
        }

        int res=0;
        for(int k=0;k<n;k++){
            res += Math.min(sufmax[k],premax[k]) - height[k];
        }
        return res;
    }
}
