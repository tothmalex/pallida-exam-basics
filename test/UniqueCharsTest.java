import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class UniqueCharsTest {
    @Test
   public void uniqueCharacters() throws Exception {
        UniqueChars word = new UniqueChars();
        assertEquals(Arrays.asList("n", "g", "r","a","m"), word.uniqueCharacters("anagram"));
    }

    public void uniqueCharacters2() throws Exception {
        UniqueChars word = new UniqueChars();
        assertEquals(Arrays.asList("l", "e", "x","a"), word.uniqueCharacters("alexa"));
    }

    public void uniqueCharacters3() throws Exception {
        UniqueChars word = new UniqueChars();
        assertEquals(Arrays.asList("l", "e", "m","r"), word.uniqueCharacters("elemer"));
    }

    public void uniqueCharacters4() throws Exception {
        UniqueChars word = new UniqueChars();
        assertEquals(Arrays.asList("l", "m", "a"), word.uniqueCharacters("alma"));
    }
}