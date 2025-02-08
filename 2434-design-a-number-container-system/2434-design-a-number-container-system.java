class NumberContainers {
    HashMap<Integer,Integer>index;
    HashMap<Integer,TreeSet<Integer>>values;
    public NumberContainers() {
        index=new HashMap<>();
        values=new HashMap<>();
    }
    
    public void change(int ind, int number) {
        if(index.containsKey(ind)){
            int val=index.get(ind);
            values.get(val).remove(ind);
        }
        index.put(ind,number);
         if(!values.containsKey(number))values.put(number,new TreeSet<>());
         values.get(number).add(ind);
    }
    
    public int find(int number) {
         if(!values.containsKey(number)||values.get(number).size()==0)return -1;
        return values.get(number).getFirst();
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */