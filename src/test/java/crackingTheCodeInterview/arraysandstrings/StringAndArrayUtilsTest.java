package crackingTheCodeInterview.arraysandstrings;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringAndArrayUtilsTest {

    /**
     * 1.1 Implement an algorithm to determine if a string has all unique characters. What if you
     can not use additional data structures?
     */
    @Test
    public void testUniqueCharacters() {
          assertTrue(StringAndArrayUtils.hasUniqueCharacters("abc"));
          assertTrue(StringAndArrayUtils.hasUniqueCharacters("xyz"));
          assertFalse(StringAndArrayUtils.hasUniqueCharacters("aac"));
          assertFalse(StringAndArrayUtils.hasUniqueCharacters(null));
          assertFalse(StringAndArrayUtils.hasUniqueCharacters(""));


    }

    @Test
    public void hasUniqueCharactersWithoutAdditionalDataStructure() {
        assertTrue(StringAndArrayUtils.hasUniqueCharactersWithoutAdditionalDataStructure("abc"));
        assertTrue(StringAndArrayUtils.hasUniqueCharactersWithoutAdditionalDataStructure("xyz"));
        assertFalse(StringAndArrayUtils.hasUniqueCharactersWithoutAdditionalDataStructure("aac"));
        assertFalse(StringAndArrayUtils.hasUniqueCharactersWithoutAdditionalDataStructure(null));
        assertFalse(StringAndArrayUtils.hasUniqueCharactersWithoutAdditionalDataStructure(""));


    }
}
