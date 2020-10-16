import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LCATest {
	
	LCA tree = new LCA();

	@Test
	void testFindLCA() {
		tree.root = new Node(1); 
	    tree.root.left = new Node(2); 
	    tree.root.right = new Node(3); 
	    tree.root.left.left = new Node(4); 
	    tree.root.left.right = new Node(5); 
	    tree.root.right.left = new Node(6); 
	    tree.root.right.right = new Node(7); 
	    
	    int a = tree.findLCA(4,5);
	    int b = tree.findLCA(4,6);
	    int c = tree.findLCA(3,4);
	    int d = tree.findLCA(2,4);
	    int e = tree.findLCA(114,5);
	    
	    assertEquals(2, a);
	    assertEquals(1, b);
	    assertEquals(1, c);
	    assertEquals(2, d);
	    assertEquals(-1, e);
	}

}
