import java.util.ArrayList;
import java.util.Iterator;
/*
 * Neil Dighe
 * April 30th
 * BinaryTree.java
 * Class to determine a binary search tree of generic binary nodes
 */
public class BinaryTree<T extends Comparable<T>> implements Iterable<T> {

	private BinaryNode<T> myRoot;

	public void add(T data) //add a node to tree
	{
		BinaryNode<T> newNode = new BinaryNode<T>(data); 
		if (myRoot == null) //if root does not exist, instantiate the root and start building the tree
		{
			myRoot = newNode;
		} 
		else 
		{
			addToTree(myRoot, newNode); //outsource the adding logic to a different method should the root exist
		}
	}


	private void addToTree(BinaryNode<T> bNode, BinaryNode<T> newNode) 
	{

		if (newNode.getElement().compareTo(bNode.getElement()) < 0 ) //if the node being added is less than the parent, add to left
		{
			if(bNode.getLeft() == null) //if node does not exist, set it
			{
				bNode.setLeft(newNode);
			}
			else 
			{
				addToTree(bNode.getLeft(), newNode); //keep going until an appropriate slot is found
			}
		}
		else //if equal or greater value, go on right
		{
			if(bNode.getRight() == null) //if node does not exist, set it
			{
				bNode.setRight(newNode);
			}
			else
			{
				addToTree(bNode.getRight(), newNode); //keep going until an appropriate slot is found
			}
		}
	}

	
	public Iterator<T> iterator() 
	{
		// TODO Auto-generated method stub
		ArrayList<T> tempList = new ArrayList<T>(); //create a temporary space to store the values
		inOrder(myRoot, tempList); //start at the root, then obtain the whole tree

		return tempList.iterator();

	}

	protected void inOrder(BinaryNode<T> node, ArrayList<T> tempList) //in order traversal of tree
	{
		if (node != null) 
		{
			inOrder(node.getLeft(), tempList);
			tempList.add(node.getElement());
			inOrder(node.getRight(), tempList);
		}
	}
	
//	private class TreeIterator implements Iterator<T> {
//
//		public TreeIterator(Iterator<T> iterator) {
//			
//		}
//
//		@Override
//		public boolean hasNext() {
//			// TODO Auto-generated method stub
//			return false;
//		}
//
//		@Override
//		public T next() {
//			// TODO Auto-generated method stub
//			return null;
//		}
//		
//		public Iterator<T> iteratorInOrder()
//	    {
//	        ArrayList<T> tempList = new ArrayList<T>();
//	        inOrder(myRoot, tempList);
//	        
//	        return new TreeIterator(tempList.iterator());
//	    }
//	    /**
//	     * Performs a recursive inorder traversal.
//	     *
//	     * @param node the node to be used as the root for this traversal
//	     * @param tempList the temporary list for use in this traversal
//	     */
//	    protected void inOrder(BinaryNode<T> node, 
//	                           ArrayList<T> tempList) 
//	    {
//	        if (node != null)
//	        {
//	            inOrder(node.getLeft(), tempList);
//	            tempList.add(node.getElement());
//	            inOrder(node.getRight(), tempList);
//	        }
//	    }
//		
//		
//		
//	}

}
