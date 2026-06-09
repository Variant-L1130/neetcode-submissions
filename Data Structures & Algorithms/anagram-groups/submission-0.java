class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Handle empty input edge case
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        
        // Map to hold the sorted word as the key, and the list of anagrams as the value
        Map<String, List<String>> map = new HashMap<>();
        
        for (String str : strs) {
            // 1. Convert the word to a character array
            char[] charArray = str.toCharArray();
            
            // 2. Sort the array to form the canonical key
            Arrays.sort(charArray);
            String sortedKey = String.valueOf(charArray);
            
            // 3. Put or update the list inside our map
            map.computeIfAbsent(sortedKey, k -> new ArrayList<>()).add(str);
        }
        
        // 4. Return all values grouped together as a list of lists
        return new ArrayList<>(map.values());
    }
}