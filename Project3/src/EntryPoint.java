/*
 * Neil Dighe
 * April 30th
 * EntryPoint.java
 * Class to test binary tree and binary node
 */
public class EntryPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree<Character> tree1 = new BinaryTree<Character>();
		tree1.add('E');
		tree1.add('C');
		tree1.add('F');
		tree1.add('D');
		tree1.add('B');
		tree1.add('A');
		
		for(char x: tree1) {
			System.out.print("|" + x + "| ");
		}
		
		System.out.println();
		
		BinaryTree<Integer> tree2 = new BinaryTree<Integer>(); //boxing good
		tree2.add(4);
		tree2.add(7);
		tree2.add(6);
		tree2.add(1);
		tree2.add(9);
		tree2.add(5);
		
		for(int x: tree2) {
			System.out.print("|" + x + "| ");
		}
		
		System.out.println();
		
		BinaryTree<Double> tree3 = new BinaryTree<Double>();
		tree3.add(4.00);
		tree3.add(4.0);
		tree3.add(Math.PI);
		tree3.add(7.69);
		tree3.add(Math.E);
		
		for(Double x: tree3) {
			System.out.print("|" + x + "| ");
		}
		
		System.out.println();
		
		BinaryTree<Boolean> tree4 = new BinaryTree<Boolean>();
		tree4.add(false);
		tree4.add(true);
		tree4.add(false);
		tree4.add(false);
		tree4.add(true);
		tree4.add(false);
		
		for(boolean x: tree4) {
			System.out.print("|" + x + "| ");
		}

	}

}
