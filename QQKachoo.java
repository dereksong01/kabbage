public class QQKachoo<T> implements Deque<T>
{
    private DLLNode<T> _front, _end;
    private int _size;

    public QQKachoo(){
	_front=_end=null;
	_size=0;
    }
    //means of adding an element from front of collection:
    public void addFirst( T x )
    {
	DLLNode<T> tmp=new DLLNode<T>(x,null,_front);
	_front=tmp;
	if(isEmpty()){
	    _end=tmp;
	}
	_size++;
    }

    //means of adding an element from back of collection:
    public void addLast( T x )
    {
	DLLNode<T> tmp=new DLLNode<T>(x,_end,null);
	_end=tmp;
	if(isEmpty()){
	    _front=tmp;
	}
	_size++;
    }

    //means of removing an element from front of collection:
    public T removeFirst()
    {
	if(isEmpty()){
	    return null;
	}
	T retVal=_front.getValue();
	_front=front.getNext();
	_front.setPrev(null);
	_size--;
	if(isEmpty()){
	    _end=_front;
	}
	return retVal;
    }

    //means of removing an element from back of collection:
    public T removeLast()
    {
	if(isEmpty()){
	    return null;
	}
	T retVal=_end.getValue();
	_end=end.getPrev();
	_end.setNext(null);
	_size--;
	if(isEmpty()){
	    _front=_end;
	}
	return retVal;
    }

    //Returns true if this deque is empty, otherwise returns false.
    public boolean isEmpty()
    {
	return _size==0;
    }

    //Returns the first element of the deque without removing it.
    public T peekFront()
    {
	return _front.getValue();
    }

    //Returns the last element of the deque without removing it.
    public T peekLast()
    {
	return _end.getValue();
    }

    public static void main(String[] args)
    {
	
    }
}
