# TEAM kabbage
### John Liu, Larry Wong, Derek Song

# To-Do List
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

* Our Deque is a double linked node based because it allowed the coder more freedom to control how each implemented method would work, instead of borrowing the built-in methods in the java API. In addition, it allowed for O(1) runtime for most methods, since working with the front and the end nodes are independent of the other nodes. 

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

- We decided to choose the above methods because they are what define a deque. These methods above are, in the simplest terms, the foundations of a deque and without anyone of them, the data structure will not be a deque. In addition, other methods do not need to implemented for the data structure to work as it is intended to. The other methods appear to be some variant of the essential methods stated above. For example, offerLast() is a variant of addLast(), but with a restriction that limits the addition of another node. Therefore, it is not essential for what we are doing here.

## Developmental Plan:
- We plan on prioritizing functionality over robustness. We do this by first creating methods that are essential to the deque data structure. We first implement the easier methods that do not require in-depth analysis. For example, isEmpty() is independent of the deque structure, but only relies on the instance variable size. Next, in order for any other deque methods to work, it requires the add methods. Next, we decided to implement the methods that provide visibility within the deque in order to test the functionality. Finally, we decided to implement the remove methods as the last ones because they depend on the functionality of the deque.
