/*
 * Neil Dighe
 * April 30th
 * BinaryNode.java
 * Class to determine a generic binary node
 */
public class BinaryNode<T>
{
    protected T element; //what the node contains
    protected BinaryNode<T> left, right; //the "children" of the node

    /**
     * Creates a new tree node with the specified data.
     *
     * @param obj the element that will become a part of the new tree node
    */
    public BinaryNode(T obj) 
    {
        element = obj;
        left = null;
        right = null;
    }

   
    /**
     * Returns the number of non-null children of this node.
     *
     * @return the integer number of non-null children of this node 
     */
    public int numChildren() 
    {
        int children = 0;

        if (left != null)
            children = 1 + left.numChildren();

        if (right != null)
            children = children + 1 + right.numChildren();

        return children;
    }
    
    /**
     * Return the element at this node.
     *
     * @return the element stored at this node
     */
    public T getElement() 
    {
        return element;
    }
    
    /**
     * Return the right child of this node.
     *
     * @return the right child of this node
     */
    public BinaryNode<T> getRight() 
    {
        return right;
    }
    
    /**
     * Sets the right child of this node.
     *
     * @param node the right child of this node
     */
    public void setRight(BinaryNode<T> node) 
    {
        right = node;
    }
    
    /**
     * Return the left child of this node.
     *
     * @return the left child of the node
     */
    public BinaryNode<T> getLeft() 
    {
        return left;
    }
    
    /**
     * Sets the left child of this node.
     *
     * @param node the left child of this node
     */
    public void setLeft(BinaryNode<T> node) 
    {
        left = node;
    }
}
