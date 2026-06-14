class MyHashSet {
    ArrayList<Integer>[] n;
    
    public MyHashSet() {
        n = new ArrayList[1000];
        for(int i = 0;i<1000;i++){
            n[i] = new ArrayList<Integer>();
        }
        
    }
    
    public void add(int key) {
        int v = key % 1000;
        if(!n[v].contains(key)){
        n[v].add(key);
        }
    }
    
    public void remove(int key) {
        int v = key%1000;
        n[v].remove(Integer.valueOf(key));
        
    }
    
    public boolean contains(int key) {
        int v = key %1000; 
        return n[v].contains(key);
        
         
    }
    
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */