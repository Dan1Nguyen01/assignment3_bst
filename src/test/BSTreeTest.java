/**
 * 
 */
package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exceptions.TreeException;
import referenceBasedTreeImplementation.BSTreeNode;
import utilities.BSTree;

/**
 * @author danng
 *
 */
class BSTreeTest {
	BSTree node;
	BSTreeNode root;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * Test method for {@link utilities.BSTree#BSTree()}.
	 */
	@Test
	void testBSTree() {
		assertNull(root);
	}

	/**
	 * Test method for {@link utilities.BSTree#BSTree(java.lang.Object)}.
	 * @throws TreeException 
	 */
	@Test
	void testBSTreeE() throws TreeException {
		node = new BSTree("A");
		root = new BSTreeNode("A");
		assertEquals(root.getElement(), node.getRoot().getElement());
	}

	/**
	 * Test method for {@link utilities.BSTree#getRoot()}.
	 */
	@Test
	void testGetRoot() {
		root = new BSTreeNode ("root");
		assertEquals("root",root.getElement() );
	}

	/**
	 * Test method for {@link utilities.BSTree#getHeight()}.
	 */
	@Test
	void testGetHeight() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link utilities.BSTree#size()}.
	 */
	@Test
	void testSize() {
		node.add("1");
		node.add("2");
		
		assertEquals(2, node.size);
	}

	/**
	 * Test method for {@link utilities.BSTree#isEmpty()}.
	 */
	@Test
	void testIsEmpty() {
		assertNull(root);
	}

	/**
	 * Test method for {@link utilities.BSTree#clear()}.
	 */
	@Test
	void testClear() {
		node.add("1");
		node.add("2");
		
		node.clear();
		
		assertEquals(0, node.getHeight());
		assertEquals(0, node.size());
		assertNull(root);
	}

	/**
	 * Test method for {@link utilities.BSTree#contains(java.lang.Comparable)}.
	 */
	@Test
	void testContains() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link utilities.BSTree#search(java.lang.Comparable)}.
	 */
	@Test
	void testSearch() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link utilities.BSTree#add(java.lang.Comparable)}.
	 */
	@Test
	void testAdd() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link utilities.BSTree#inorderIterator()}.
	 */
	@Test
	void testInorderIterator() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link utilities.BSTree#preorderIterator()}.
	 */
	@Test
	void testPreorderIterator() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link utilities.BSTree#postorderIterator()}.
	 */
	@Test
	void testPostorderIterator() {
		fail("Not yet implemented");
	}

}
