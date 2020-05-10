# DESIGN - 2

### [Implement Queue using Stack](https://github.com/gnaneswar0907/Algorithms/blob/master/Design-2/QueueUsingStack.java)

Implement the following operations of a queue using stacks.

- push(x) -- Push element x to the back of queue.
- pop() -- Removes the element from in front of queue.
- peek() -- Get the front element.
- empty() -- Return whether the queue is empty.

```java
MyQueue queue = new MyQueue();

queue.push(1);
queue.push(2);
queue.peek();  // returns 1
queue.pop();   // returns 1
queue.empty(); // returns false
```

---

### [Design HashSet](https://github.com/gnaneswar0907/Algorithms/blob/master/Design-2/MyHashSet.java)

Design a HashSet without using any built-in hash table libraries. To be specific, your design should include these functions:

- add(value): Insert a value into the HashSet.
- contains(value) : Return whether the value exists in the HashSet or not.
- remove(value): Remove a value in the HashSet. If the value does not exist in the HashSet, do nothing.

```java
MyHashSet hashSet = new MyHashSet();
hashSet.add(1);
hashSet.add(2);
hashSet.contains(1);    // returns true
hashSet.contains(3);    // returns false (not found)
hashSet.add(2);
hashSet.contains(2);    // returns true
hashSet.remove(2);
hashSet.contains(2);    // returns false (already removed)
```

---
