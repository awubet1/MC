import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {

    private GradeBook gradeBook1;
    private GradeBook gradeBook2;

    @Test
    void testGradeBook() {
        // Not necessary to test the constructor in this case
        // because the setup is already done in the other tests.
    }

    @Test
    void testAddScore() {
        gradeBook1 = new GradeBook(5);
        gradeBook2 = new GradeBook(5);

        assertTrue(gradeBook1.addScore(85.0));
        assertTrue(gradeBook1.addScore(90.5));
        assertTrue(gradeBook2.addScore(78.5));
        assertTrue(gradeBook2.addScore(92.0));

        // Adding more than the capacity, should return false
        assertFalse(gradeBook1.addScore(88.0));
        assertFalse(gradeBook2.addScore(95.5));
    }

    @Test
    void testSum() {
        gradeBook1 = new GradeBook(5);
        
        gradeBook2 = new GradeBook(5);

        gradeBook1.addScore(85.0);
        gradeBook1.addScore(90.5);
        gradeBook2.addScore(78.5);
        gradeBook2.addScore(92.0);

        assertEquals(175.5, gradeBook1.sum(), 0.0001);
        assertEquals(170.5, gradeBook2.sum(), 0.0001);
    }

    @Test
    void testMinimum() {
        gradeBook1 = new GradeBook(5);
        gradeBook2 = new GradeBook(5);

        gradeBook1.addScore(85.0);
        gradeBook1.addScore(90.5);
        gradeBook2.addScore(78.5);
        gradeBook2.addScore(92.0);

        assertEquals(85.0, gradeBook1.minimum(), 0.0001);
        assertEquals(78.5, gradeBook2.minimum(), 0.0001);
    }

    @Test
    void testFinalScore() {
        gradeBook1 = new GradeBook(5);
        gradeBook2 = new GradeBook(5);

        gradeBook1.addScore(85.0);
        gradeBook1.addScore(90.5);
        gradeBook2.addScore(78.5);
        gradeBook2.addScore(92.0);

        assertEquals(90.5, gradeBook1.finalScore(), 0.0001);
        assertEquals(92.0, gradeBook2.finalScore(), 0.0001);
        
        GradeBook gradeBook3 = new GradeBook(5);
        assertEquals(0, gradeBook3.finalScore(), 0.0001);

        // Test case - Only one score
        GradeBook gradeBook4 = new GradeBook(5);
        gradeBook4.addScore(85.0);
        assertEquals(85.0, gradeBook4.finalScore(), 0.0001);
    }

    @Test
    void testGetScoreSize() {
        gradeBook1 = new GradeBook(5);
        gradeBook2 = new GradeBook(5);

        gradeBook1.addScore(85.0);
        gradeBook1.addScore(90.5);
        gradeBook2.addScore(78.5);
        gradeBook2.addScore(92.0);

        assertEquals(2, gradeBook1.getScoreSize());
        assertEquals(2, gradeBook2.getScoreSize());
    }

    @Test
    void testToString() {
        gradeBook1 = new GradeBook(5);
        gradeBook2 = new GradeBook(5);

        gradeBook1.addScore(85.0);
        gradeBook1.addScore(90.5);
        gradeBook2.addScore(78.5);
        gradeBook2.addScore(92.0);

        assertEquals("85.0 90.5", gradeBook1.toString());
        assertEquals("78.5 92.0", gradeBook2.toString());
    }

    @AfterEach
    void tearDown() {
        gradeBook1 = null;
        gradeBook2 = null;
    }
}
