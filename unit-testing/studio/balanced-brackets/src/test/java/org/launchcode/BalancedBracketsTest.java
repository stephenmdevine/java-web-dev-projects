package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void oneOpenBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void oneClosedBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void reverseBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void bracketsAroundTextReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void bracketsAroundSymbolsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[@LaunchC0de {]"));
    }
    @Test
    public void openClosedOpenClosedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }
    @Test
    public void closedOpenClosedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][]"));
    }
    @Test
    public void noBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }
    @Test
    public void openClosedOpenReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]["));
    }
    @Test
    public void openOpenClosedClosedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }
    @Test
    public void textOutsideOfBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[ ]Code"));
    }
    @Test
    public void tenOpenAndTenClosedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("1[2[3[4[5[6[7[8[9[10[]10]9]8]7]6]5]4]3]2]1"));
    }
    @Test
    public void tenOpenAndNineClosedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("1[2[3[4[5[6[7[8[9[10[]9]8]7]6]5]4]3]2]1"));
    }
    @Test
    public void textOpenTextClosedReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }
    @Test
    public void openClosedTextReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }
    @Test
    public void textClosedTextOpenReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
    @Test
    public void openBracketAndTextReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
}