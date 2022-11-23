package utilities;

import exceptions.TreeException;
import referenceBasedTreeImplementation.BSTreeNode;

public class BSTree<E> implements BSTreeADT {
	private int size;
	private int height;
	private BSTreeNode<E> root;

	public BSTree() {
		// construct an emty BST
		this.root = null;
	}

	public BSTree(E element) {
		this.root = new BSTreeNode<E>(element, null, null);
	}

	@Override
	public BSTreeNode getRoot() throws TreeException {
		return root;
	}

	@Override
	public int getHeight() {
		return height;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		if (root == null) {
			return true;
		}
		return false;
	}

	@Override
	public void clear() {
		root = null;
		height = 0;
		size = 0;

	}

	@Override
	public boolean contains(Comparable entry) throws TreeException {
		boolean isContain = false;
		
		return isContain;
	}

	@Override
	public BSTreeNode search(Comparable entry) throws TreeException {
		if(root==null){
			throw new TreeException();
		}
		while (root!= null){
			if(root.getElement().equals(((BSTreeNode)entry).getElement())){
				return root;
			}else if(root.getElement()< ((BSTreeNode<E>) entry).getElement()){
				root= root.getLeft();
			}else {
				root = root.getRight();
			}
		}
		return null;
	}

	@Override
	public boolean add(Comparable newEntry) throws NullPointerException {
		if(newEntry== null) {
			throw new NullPointerException();
		}else {
			BSTreeNode<E> node  =  new BSTreeNode (newEntry);
			if(node.getElement()>root.getElement()) {
				node.setRight(node.getRight());
			}else if(node.getElement()<root.getElement()) {
				node.setLeft(node.getLeft());
			}
		}
		return true;
	}

	@Override
	public Iterator inorderIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator preorderIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator postorderIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean hasLeftChild() {

		return false;
	}

	public boolean hasRightChild() {

		return false;
	}

	public boolean isLeaf(BSTreeNode currentNode) {
		if (currentNode.getLeft() == null && currentNode.getRight() == null) {
			return true;
		}
		return false;
	}

}
