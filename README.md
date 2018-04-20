# TEAM kabbage
### John Liu, Larry Wong, Derek Song

To-Do List
1) Create and maintain a working repo
2) Research what a deque is and pick out essential methods that define it
3) Create interface with the following methods (not in order)
- isEmpty()
- enqueueFirst(T)
- enqueueLast(T)
- toString()
- peekFirst()
- peekLast()
- dequeFirst()
- dequeLast()
4) Implement each method (incrementally)
5) Create or borrow a driver to test functionality

* Our Deque is a double linked node based because it allowed the coder more freedom to how each implemented method wold work, instead of borrowing the builtin methods in the java API. In addition, it allowed for O(1) runtime for most methods, since working with the front and the end is independent of the other nodes. 

## Methods to implement (in ascending order):
- isEmpty()
- addFirst(T)
- addLast(T)
- toString()
- peekFirst()
- peekLast()
- removeFirst()
- removeLast()

_From Wikipedia.com_
> In computer science, a double-ended queue (dequeue, often abbreviated to deque) is an abstract data type that generalizes a queue, for which elements can be added to or removed from either the front (head) or back (tail).
We decided to choose these methods as opposed to the many others is because

- We decided to choose the above methods because they are what define a deque. These methods above are, in the simplest terms, the foundations of a deque and without anyone of them, the data structure will not be a deque. In addition, other methods do not need to implemented for the data structure to work as it is intended to. The other methods appear to be some variant of the essential methods stated above. For example, offerLast() is a variant of addLast(), but with a restriction that limits the addition of another node.
