class Solution {
    public int maxJump(int[] stones) {
        


        int first = stones[0];
        int second = stones[1];
int ans=second-first;
        for (int i = 2; i < stones.length; i++) {
            int current = stones[i]-first;
            ans=Math.max(ans,current);
            first = second;
            second = stones[i];
        }

        return ans;
    }
}

    
