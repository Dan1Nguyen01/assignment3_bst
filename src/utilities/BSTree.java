package utilities;

import java.util.Comparator;

import exceptions.TreeException;
import referenceBasedTreeImplementation.BSTreeNode;

public class BSTree<E> implements BSTreeADT {
	private int size;
	private int height;
	private BSTreeNode<E> root;

	public BSTree() {
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
		if (root == null) {
			throw new TreeException();
		}

		BSTreeNode node = new BSTreeNode(entry);
		while (root != null) {

			if (root.getElement().equals(node.getElement())) {
				isContain = true;
			} else if (((Comparable) root.getElement()).compareTo(node.getElement()) < 0) {
				root = root.getRight();
			} else {
				root = root.getLeft();
			}

		}

		return isContain;
	}

	@Override
	public BSTreeNode search(Comparable entry) throws TreeException {
		if (root == null) {
			throw new TreeException();
		}
		BSTreeNode node = new BSTreeNode(entry);
		while (root != null) {
			if (root.getElement().equals(node.getElement())) {
				return root;
			} else if (((Comparable) root.getElement()).compareTo(node.getElement()) < 0) {
				root = root.getRight();
			} else {
				root = root.getLeft();
			}
		}
		return null;
	}

	@Override
	public boolean add(Comparable newEntry) throws NullPointerException {
		boolean isAdd = false;
		if (newEntry == null) {
			throw new NullPointerException();
		} else {
			BSTreeNode<E> node = new BSTreeNode(newEntry);
			if (((Comparable) (node).getElement()).compareTo(root.getElement()) > 0) {
				node.setRight(node.getRight());
				size++;
				isAdd = true;
			} else if (((Comparable) node.getElement()).compareTo(root.getElement()) < 0) {
				node.setLeft(node.getLeft());
				size++;
				isAdd = true;
			}
		}
		
		return isAdd;
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

	public boolean hasLeftChild(BSTreeNode node) {
		boolean leftChild = node.getLeft() != null ? true : false;
		return leftChild;
	}

	public boolean hasRightChild(BSTreeNode node) {
		boolean rightChild = node.getRight() != null ? true : false;
		return rightChild;

	}

	public boolean isLeaf(BSTreeNode node) {

		boolean leaf = hasLeftChild(node) && hasLeftChild(node) ? true : false;

		return leaf;
	}

}
