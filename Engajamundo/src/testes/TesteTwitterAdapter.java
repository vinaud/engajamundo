package testes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import twitter.TwitterAdapter;
import twitter4j.TwitterException;

/**
 *
 * @author vinaud
 */
public class TesteTwitterAdapter {
    
    public TesteTwitterAdapter() {
    }

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        TwitterAdapter ta = new TwitterAdapter();
    }
    
    @After
    public void tearDown() {
    }
    
     @Test
     public void testGetTweets() throws TwitterException {
          TwitterAdapter ta = new TwitterAdapter();
         ta.getTweetsEngajamundo();
     
     }
}
