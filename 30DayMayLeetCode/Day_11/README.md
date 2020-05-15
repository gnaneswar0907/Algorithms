### [Implementation of TRIE](https://github.com/gnaneswar0907/Algorithms/blob/master/Day_11/Trie.java)

Implement a trie with insert, search, and startsWith methods.

```java
Trie trie = new Trie();

trie.insert("apple");
trie.search("apple");   // returns true
trie.search("app");     // returns false
trie.startsWith("app"); // returns true
trie.insert("app");
trie.search("app");     // returns true
```
