class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return 0;
        Set<Integer> number = new HashSet<>();
        int longest =1;
        for(int i=0;i<n;i++){
            number.add(nums[i]);
        }

        for(int num: number){
            if(!number.contains(num-1)){
                int cnt=1;
                int x=num;
                while(number.contains(x+1)){
                    x=x+1;
                    cnt=cnt+1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }
}
