class MyHashMap {
    ArrayList<int[]>[] n = new ArrayList[1000];

    public MyHashMap() {
        for(int i=0;i<1000;i++){
            n[i] = new ArrayList<int[]>();
        }
        
    }
    
    public void put(int key, int value) {
        int v = key%1000;
        for(int [] pair : n[v]){
            if (pair[0]==key){
                pair[1] = value; 
                return;
            }
            
        }
            n[v].add(new int[]{key,value});
                return;
            
    }
        
    
    
    public int get(int key) {
        int v = key%1000;
        for(int[] pair : n[v]){
            if(pair[0]==key){
                return pair[1];
            }
        }
          return -1;
            
    }
    
    public void remove(int key) {
        int v = key%1000;
        for(int [] pair : n[v]){
            if(pair[0]==key){
                n[v].remove(pair);
                return;
            }
        }
        
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */