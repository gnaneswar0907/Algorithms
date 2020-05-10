import java.util.LinkedList;

public class MyHashSet {

    private Bucket[] bucketArray;
    private final int maxLimit = 769;

    /** Initialize your data structure here. */
    public MyHashSet() {
        bucketArray = new Bucket[maxLimit];
        for (int i = 0; i < maxLimit; i++) {
            bucketArray[i] = new Bucket();
        }
    }

    public void add(int key) {
        int hashKey = getHash(key);
        bucketArray[hashKey].add(key);
    }

    public void remove(int key) {
        int hashKey = getHash(key);
        bucketArray[hashKey].remove(key);
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int hashKey = getHash(key);
        return bucketArray[hashKey].contains(key);
    }

    public int getHash(int key) {
        return key % maxLimit;
    }

}

class Bucket {
    private LinkedList<Integer> bucketList = new LinkedList<>();

    public void add(int key) {
        if (!contains(key)) {
            bucketList.addFirst(key);
        }
    }

    public void remove(int key) {
        bucketList.remove(Integer.valueOf(key));
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return bucketList.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such: MyHashSet obj
 * = new MyHashSet(); obj.add(key); obj.remove(key); boolean param_3 =
 * obj.contains(key);
 */