class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l =1;
        int r = 0;
        int res =r;
        for (int pile : piles) {
            r = Math.max(r, pile);
        }
        while(l<=r){
            int k = (l+r)/2;
            int totalTime = 0;
            for(int p: piles){
                totalTime += (p + k -1)/k;
            }
            if(totalTime <= h){
                res =k;
                r = k-1;
            }
            else{
                l = k+1;
                }
            }
        
        return res;
    }
        
    }

