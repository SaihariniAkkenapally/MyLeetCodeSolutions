class RandomizedSet {
    Set<Integer> set;
    List<Integer> list;
    Random random;
    public RandomizedSet() {
        set = new HashSet();
        list = new ArrayList();
        random = new Random();
    }
    
    public boolean insert(int val) {
        if(!set.contains(val))
        {
            set.add(val);
            list.add(val);
            return true;
        }
        return false;
    }
    
    public boolean remove(int val) {
        if(set.contains(val))
        {
            list.remove((Integer) val);
            set.remove(val);
            return true;
        }
        return false;
    }
    
    public int getRandom() {
        return list.get(random.nextInt(0,list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */