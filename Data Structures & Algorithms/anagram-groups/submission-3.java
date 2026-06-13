class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> m = new HashMap<>();
        for(int i = 0;i<strs.length;i++){
            char[] a = strs[i].toCharArray();
            Arrays.sort(a);
            String b = new String(a);
            List<String>n = m.getOrDefault(b, new ArrayList<>());
            n.add(strs[i]);
            m.put(b,n);
        }
        return new ArrayList<>(m.values());
    }
}
