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

   
     @Test
     public void testGetTweets() throws TwitterException {
          TwitterAdapter ta = new TwitterAdapter();
         ta.getTweetsEngajamundo();
     
     }
}
