class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = freqEle(tasks);
        int max = 0;
        for(int i=0;i<freq.length;i++) {
            max = Math.max(max, freq[i]);
        }
        int count = 0;
        // int unique = 0;
        for(int i=0;i<freq.length;i++) {
            // System.out.println(freq[i]);
            if(max == freq[i]) count++;
            // if(freq[i] > 0) unique = 0;
        }
        // System.out.println(count);
        // if(tasks.length > n*max) return tasks.length;
        // else {
            return Math.max(tasks.length,(max - 1) * (n + 1) + count ) ;
        // }
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