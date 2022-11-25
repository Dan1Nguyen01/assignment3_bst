package utilities;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.NoSuchElementException;

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
		size++;
		height++;
	}

	@Override
	public BSTreeNode getRoot() throws TreeException {
		return root;
	}

	@Override
	public int getHeight() throws TreeException {

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
				return isContain = true;
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
			} else if (((Comparable) root.getElement()).compareTo(node.getElement()) > 0)
				root = root.getLeft();
		}

		return null;
	}

	@Override
	public boolean add(Comparable newEntry) throws NullPointerException {
		boolean isAdd = false;
		BSTreeNode<E> node = new BSTreeNode(newEntry);
		if (newEntry == null) {
			throw new NullPointerException();
		}
		if (root == null) {
			root = node;
			isAdd = true;
			size++;

		} else {
			while (!isAdd) {
				if (((Comparable) (node).getElement()).compareTo(root.getElement()) > 0) {
					if (root.getRight() == null) {
						root.setRight(node);
						size++;
						isAdd = true;
					} else {
						root = root.getRight();
					}

				} else if (((Comparable) node.getElement()).compareTo(root.getElement()) < 0) {
					if (root.getLeft() == null) {
						root.setLeft(node);
						size++;
						isAdd = true;
					} else {
						root = root.getLeft();
					}
				}
			}
		}
		return isAdd;
	}

	@Override
	public Iterator inorderIterator() {
		return new InorderIterator();
	}

	private class InorderIterator implements Iterator<E> {
		private ArrayList<E> list = new ArrayList<E>();
		private int curr = 0;// point the current element in a list

		public InorderIterator() {
			inorder();// traverse binary tree and store elements in a list
		}

		// inorder traverse from the root
		private void inorder() {
			inorder(root);
		}

		private void inorder(BSTreeNode<E> root) {
			if (root == null)
				return;
			inorder(root.getLeft());
			list.add(root.getElement());
			inorder(root.getRight());

		}

		@Override
		public boolean hasNext() {

			return curr < list.size() ? true : false;
		}

		@Override
		public E next() throws NoSuchElementException {
			return list.get(curr++);
		}

	}

	@Override
	public Iterator preorderIterator() {
		return new PreorderIterator();
	}

	private class PreorderIterator implements Iterator<E> {
		private ArrayList<E> list = new ArrayList<E>();
		private int curr = 0;

		public PreorderIterator() {
			preorder();
		}

		private void preorder() {
			preorder(root);

		}

		private void preorder(BSTreeNode<E> root) {
			if (root == null)
				return;
			list.add(root.getElement());
			preorder(root.getLeft());
			preorder(root.getRight());

		}

		@Override
		public boolean hasNext() {
			return curr < list.size() ? true : false;
		}

		@Override
		public E next() throws NoSuchElementException {

			return list.get(curr++);
		}

	}

	@Override
	public Iterator postorderIterator() {
		return new PostOrderIterator();
	}

	private class PostOrderIterator implements Iterator<E> {
		private ArrayList<E> list = new ArrayList<E>();
		private int curr = 0;

		public PostOrderIterator() {
			postorder();
		}

		private void postorder() {
			postorder(root);

		}

		private void postorder(BSTreeNode<E> root) {
			if (root == null)
				return;
			postorder(root.getLeft());
			postorder(root.getRight());
			list.add(root.getElement());

		}

		@Override
		public boolean hasNext() {
			return curr < list.size();
		}

		@Override
		public E next() throws NoSuchElementException {
			return list.get(curr++);
		}

	}

}
