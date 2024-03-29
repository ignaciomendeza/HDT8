import java.util.Vector;
/*
 * Diego Soto (22737), Ignacio Méndez (22613)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 8
 * 03-04-2023
 * Clase VectorHeap: Implementa PriorityQueue2
 */

//Obtenida de (c) 1998, 2001 duane a. bailey

// An implementation of a priority queue in a vector.
// (c) 1998, 2001, 2002 duane a. bailey

/**
 * This class implements a priority queue based on a traditional
 * array-based heap.
 *
 * @version $Id: VectorHeap.java 8 2006-08-02 19:03:11Z bailey $
 * @author, 2001 duane a. bailey
 */
public class VectorHeap<T> implements PriorityQueue2<T>
{
    /**
     * The data, kept in heap order.
     */
    protected Vector<T> data;  // the data, kept in heap order

    /**
     * Construct a new priority queue
     *
     * @post constructs a new priority queue
     */
    public VectorHeap()
    {
        data = new Vector<T>();
    }

    /**
     * Construct a new priority queue from an unordered vector
     *
     * @post constructs a new priority queue from an unordered vector
     */
    public VectorHeap(Vector<T> v)
    {
        int i;
        data = new Vector<T>(v.size()); // we know ultimate size
        for (i = 0; i < v.size(); i++)
        {   // add elements to heap
            add((Comparable)v.get(i));
        }
    }

    /**
     * Returns parent index
     * @param i a node index
     * @return parent of node at i
     * @pre 0 <= i < size
     * @post returns parent of node at location i
     */
    protected static int parent(int i)
    {
        return (i-1)/2;
    }

    /**
     * Returns left child index.
     * @param i a node index
     * @return left child of node at i
     * @pre 0 <= i < size
     * @post returns index of left child of node at location i
     */
    protected static int left(int i)
    {
        return 2*i+1;
    }

    /**
     * Returns right child index.
     * @param i a node index
     * @return right child of node at i
     * @pre 0 <= i < size
     * @post returns index of right child of node at location i
     */
    protected static int right(int i)
    {
        return 2*(i+1);
    }

    /**
     * Fetch lowest valued (highest priority) item from queue.
     *
     * @pre !isEmpty()
     * @post returns the minimum value in priority queue
     * 
     * @return The smallest value from queue.
     */
    public Comparable getFirst()
    {
        return (Comparable)data.get(0);
    }

    /**
     * Returns the minimum value from the queue.
     *
     * @pre !isEmpty()
     * @post returns and removes minimum value from queue
     * 
     * @return The minimum value in the queue.
     */
    public T remove()
    {
        T minVal = (T) getFirst();
        data.set(0,data.get(data.size()-1));
        data.setSize(data.size()-1);
        if (data.size() > 1) pushDownRoot(0);
        return minVal;
    }

    /**
     * Add a value to the priority queue.
     *
     * @pre value is non-null comparable
     * @post value is added to priority queue
     * 
     * @param value The value to be added.
     */
    public void add(T value)
    {
        data.add(value);
        percolateUp(data.size()-1);
    }

    /**
     * Determine if the queue is empty.
     *
     * @post returns true iff no elements are in queue
     * 
     * @return True if the queue is empty.
     */
    public boolean isEmpty()
    {
        return data.size() == 0;
    }

    /**
     * Moves node upward to appropriate position within heap.
     * @param leaf Index of the node in the heap.
     * @pre 0 <= leaf < size
     * @post moves node at index leaf up to appropriate position
     */
    protected void percolateUp(int leaf)
    {
        int parent = parent(leaf);
        T value = (T)(data.get(leaf));
        while (leaf > 0 &&
          (((Comparable) value).compareTo((T)(data.get(parent))) < 0))
        {
            data.set(leaf,data.get(parent));
            leaf = parent;
            parent = parent(leaf);
        }
        data.set(leaf,value);
    }

    /**
     * Moves node downward, into appropriate position within subheap.
     * @param root Index of the root of the subheap.
     * @pre 0 <= root < size
     * @post moves node at index root down 
     *   to appropriate position in subtree
     */
    protected void pushDownRoot(int root)
    {
        int heapSize = data.size();
        T value = (T)data.get(root);
        while (root < heapSize) {
            int childpos = left(root);
            if (childpos < heapSize)
            {
                if ((right(root) < heapSize) &&
                  (((Comparable)(data.get(childpos+1))).compareTo
                   ((Comparable)(data.get(childpos))) < 0))
                {
                    childpos++;
                }
                // Assert: childpos indexes smaller of two children
                if (((Comparable)(data.get(childpos))).compareTo
                    (value) < 0)
                {
                    data.set(root,data.get(childpos));
                    root = childpos; // keep moving down
                } else { // found right location
                    data.set(root,value);
                    return;
                }
            } else { // at a leaf! insert and halt
                data.set(root,value);
                return;
            }       
        }
    }

    /**
     * Determine the size of the queue.
     *
     * @post returns number of elements within queue
     * 
     * @return The number of elements within the queue.
     */
    public int size()
    {
        return data.size();
    }

    /**
     * Remove all the elements from the queue.
     *
     * @post removes all elements from queue
     */
    public void clear()
    {
        data.clear();
    } 
    
    /**
     * Construct a string representation of the heap.
     *
     * @post returns string representation of heap
     * 
     * @return The string representing the heap.
     */
    public String toString()
    {
        return "<Vector<T>Heap: "+data+">";
    }

    @Override
    public void add(Comparable value) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
}
