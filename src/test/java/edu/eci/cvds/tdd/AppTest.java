package edu.eci.cvds.tdd;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    public void testShouldBeAcorrectAge() throws Exception {
        assertTrue(App.correctIncorrectAge(17));
    }

    public void testShouldNotBeAcorrectAge() throws Exception {
        assertFalse(App.correctIncorrectAge(20));
    }

    public void testShouldNotBeAvalidAge() throws Exception {
        assertFalse(App.correctIncorrectAge(100));
    }

    public void testShouldBeAnError() throws Exception {
        assertFalse(App.correctIncorrectAge(-10000));
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

}
