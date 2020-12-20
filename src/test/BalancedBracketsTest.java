package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test //1
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test //2
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test //3
    public void onlyFirstBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test //4
    public void onlyLastBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]"));
    }

    @Test //5
    public void noBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }

    @Test //6
    public void balancedBracketsIsNotNull() {
        assertNotNull(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }
    @Test //7
    public void balancedBracketsDetectsThreeBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode]]"));
    }
    @Test //8
    public void stringWithNonAlphaCharactersReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code] Rocks! ?"));
    }

}
