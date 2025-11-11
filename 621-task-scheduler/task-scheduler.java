class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = freqEle(tasks);
        int max = 0;
        for(int i=0;i<freq.length;i++) {
            max = Math.max(max, freq[i]);
        }
        int count = 0;
        for(int i=0;i<freq.length;i++) {
            if(max == freq[i]) count++;
        }
        
        return Math.max(tasks.length,max + (max-1)*n + count-1);
        
    }
    private int[] freqEle(char[] tasks) {
        int[] freq = new int[26];
        for(int i=0;i<tasks.length;i++) {
            char ch = tasks[i];
            freq[ch - 'A']++;
        }
        return freq;
    }
}