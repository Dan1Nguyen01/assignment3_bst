package referenceBasedTreeImplementation;

public class BSTreeNode<E> {
	private E element;
	private BSTreeNode<E> left;
	private BSTreeNode<E> right;

	public BSTreeNode(E elem, BSTreeNode<E> left, BSTreeNode<E> right) {

		this.element = elem;
		this.left = left;
		this.right = right;

	}

	public BSTreeNode(E elem) {
		this.element = elem;
		this.left =null;
		this.right = null;
	}

	public E getElement() {
		return element;
	}

	public void setElement(E element) {
		this.element = element;
	}

	public BSTreeNode<E> getLeft() {
		return left;
	}

	public void setLeft(BSTreeNode<E> left) {
		this.left = left;
	}

	public BSTreeNode<E> getRight() {
		return right;
	}

	public void setRight(BSTreeNode<E> right) {
		this.right = right;
	}

}
