package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class lab4test {
	
	Point pA = new Point(0,0);
	Point pB = new Point(2,0);
	Point pC = new Point(1,1);
	Point pD = new Point(0,5);
	Triangle myShape = new Triangle(pA, pB, pC);
	Triangle whyme = new Triangle(pA,pD,pC);
	Point A = new Point(0,0);
	Point B = new Point(0,0);
	Point C = new Point(0,0);
	Point a1 = new Point(4,0);
	Point a2 = new Point(8,0);
	Point a3 = new Point(12,0);
	Point a4 = new Point(16,0);
	Triangle z = new Triangle(A,B,C);
	Triangle x = new Triangle(a1,a2,a3);
	Triangle y = new Triangle(a4,a2,a3);
	
	@Test
	void testTriangle() {
		assertNotNull(myShape);
	}
	
	@Test
	void testPerimeter() {
		assertEquals(myShape.perimeter(), 2 + 2*(Math.sqrt(2)));
	}
	
	@Test
	void testIsEquilateral() {
		assertEquals(z.isEquilateral(), true);
	}
	
	@Test
	void testIsEquilateral1() {
		assertEquals(x.isEquilateral(), false);
	}
	
	@Test
	void testIsEquilateral2() {
		assertEquals(y.isEquilateral(), false);
	}
	
	@Test
	void testIsEquilateral3() {
		assertEquals(whyme.isEquilateral(), false);
	}
	
	@Test
	void testIsEquilateral4() {
		C = new Point(1,2);
		z = new Triangle(A,B,C);
		assertEquals(z.isEquilateral(), false);
	}

	@Test
	void testPoint() {
		assertNotNull(pA);
	}
	
	@Test
	void testDistance() {
		assertEquals(pA.distance(pB), 2);
	}

	@Test
	void testHashCode() {
		Point k = new Point(2,3);
		assertEquals(k.hashCode(), (int)21);
	}
	
	@Test
	void testEquals() {
		assertTrue(pB.equals(pB));
	}
	
	@Test
	void testEquals2() {
		assertFalse(pA.equals(null));
	}
	
	@Test
	void testEquals3() {
		assertFalse(pA.equals(myShape));
	}
	
	@Test
	void testEquals4() {
		assertFalse(pA.equals(pB));
	}
	
	@Test
	void testEquals5() {
		assertFalse(pA.equals(pD));
	}
	
	@Test
	void testEquals6() {
		Object l = new Point(1,1);
		Object k = new Point(1,1);
		assertTrue(k.equals(l));
	}
	
	
}
