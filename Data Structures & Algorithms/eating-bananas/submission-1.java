class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int max =0;
        for(int i=0;i<piles.length;i++){
            max = Math.max(max,piles[i]);
        }
        int left =1,right = max;
        int res = right;
        while(left<=right){
            int k = (left+right)/2;
            long totaltime = 0;
            for(int  p :piles){
                totaltime += Math.ceil((double)p/k);
            }
            if(totaltime <=h){
                res =k;
                right = k-1;
            } else{
                left = k+1;
            }
        }

        return res;
    }
}
