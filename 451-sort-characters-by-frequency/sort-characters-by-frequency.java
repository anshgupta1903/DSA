class Solution {
    public String frequencySort(String s) {
        LinkedHashMap<Character, Integer> Map = new LinkedHashMap<>();
        for(char c:s.toCharArray()){
            Map.put(c, Map.getOrDefault(c, 0)+1);
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(Map.entrySet());

        list.sort((a,b)->b.getValue()-a.getValue());

        LinkedHashMap<Character, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Character, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        StringBuilder result = new StringBuilder("");
        for(Map.Entry<Character, Integer> entry:sortedMap.entrySet()){
            for(int i=0;i<entry.getValue();i++){
                result.append(entry.getKey());
            }
        }
        return result.toString();
    }
}