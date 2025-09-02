import java.util.*;

class Solution {
    public List<List<Integer>> allsub(int[] arr, List<Integer> res, int i) {
        List<List<Integer>> fi = new ArrayList<>();

        // Base case: add current subset and return
        if (i == arr.length) {
            fi.add(new ArrayList<>(res)); 
            return fi;
        }

        // Exclude current element
        fi.addAll(allsub(arr, res, i + 1));

        // Include current element
        res.add(arr[i]);
        fi.addAll(allsub(arr, res, i + 1));

        // Backtrack
        res.remove(res.size() - 1);

        return fi;
    }

    public List<List<Integer>> subsets(int[] nums) {
        return allsub(nums, new ArrayList<>(), 0);
    }
}
