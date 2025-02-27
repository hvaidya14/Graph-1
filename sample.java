class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] degrees = new int [n];
        for (int[] t:trust) {
            degrees[t[0]-1]--;
            degrees[t[1]-1]++;
        }

        for (int i=0;i<n;i++) {
            if(degrees[i] == n-1) {
                return i+1;
            }
        }
        return -1;
    }
}
