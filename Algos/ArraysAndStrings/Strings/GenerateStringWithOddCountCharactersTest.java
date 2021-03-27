package Algos.ArraysAndStrings.Strings;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Iterator;

class GenerateStringWithOddCountCharactersTest {
    GenerateStringWithOddCountCharacters obj = new GenerateStringWithOddCountCharacters();

    @Test
    public void testOddLength() {
        int len = 3;
        String result = obj.generateStringWithOddCountCharacters(len);
        verifyResult(result);

    }

    @Test
    public void testEvenLength() {
        int len = 2;
        String result = obj.generateStringWithOddCountCharacters(len);
        verifyResult(result);
    }

    @Test
    public void testZeroLength() {
        int len = 0;
        String result = obj.generateStringWithOddCountCharacters(len);
        verifyResult(result);
    }

    @Test
    public void testNegativeLength() {
        int len = -1;
        String result = obj.generateStringWithOddCountCharacters(len);
        verifyResult(result);
    }

    private boolean verifyResult(String result) {
        HashSet<Character> unique = getUniqueCharacters(result);
        Iterator iter = unique.iterator();
        while (iter.hasNext()) {
            if ((countCharacter(result, (char) iter.next())) % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    private int countCharacter(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (c == str.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    private HashSet<Character> getUniqueCharacters(String str) {
        HashSet<Character> result = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            result.add(str.charAt(i));
        }
        return result;
    }
}