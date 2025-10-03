class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        
        Iterator<Integer> it = map.keySet().iterator();
        int[] arr = new int[map.size()];
        int i = 0;
        while(it.hasNext()){
            arr[i] = map.get(it.next());
            i++;
        }
        Arrays.sort(arr);
        int j = arr.length - 1;
        int res = 0;
        res+=arr[j];
        while(j>0 && arr[j]==arr[j-1]){
            res+=arr[j];
            j--;
        }
        return res;
    }
}