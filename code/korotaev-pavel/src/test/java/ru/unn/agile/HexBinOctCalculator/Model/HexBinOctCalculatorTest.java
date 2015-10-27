package ru.unn.agile.HexBinOctCalculator.Model;

import org.junit.Test;
import static org.junit.Assert.*;

public class HexBinOctCalculatorTest {
    @Test
    public void canAddTwoBinNumbers() {
        String firstNumber = "101";
        String secondNumber = "10";

        String result = HexBinOctCalculator.add(firstNumber, secondNumber, NumeralSystem.BIN);

        assertTrue(result.equals("111"));
    }

    @Test
    public void canSubtractTwoBinNumbers() {
        String firstNumber = "111";
        String secondNumber = "11";

        String result = HexBinOctCalculator.subtract(firstNumber, secondNumber, NumeralSystem.BIN);

        assertTrue(result.equals("100"));
    }

    @Test
    public void canMultiplyTwoBinNumbers() {
        String firstNumber = "11";
        String secondNumber = "11";

        String result = HexBinOctCalculator.multiply(firstNumber, secondNumber, NumeralSystem.BIN);

        assertTrue(result.equals("1001"));
    }

    @Test
    public void canDivideTwoBinNumbers() {
        String firstNumber = "1111";
        String secondNumber = "10";

        String result = HexBinOctCalculator.divide(firstNumber, secondNumber, NumeralSystem.BIN);

        assertTrue(result.equals("111"));
    }

    @Test
    public void canAddTwoHexNumbers() {
        String firstNumber = "ab";
        String secondNumber = "cd";

        String result = HexBinOctCalculator.add(firstNumber, secondNumber, NumeralSystem.HEX);

        assertTrue(result.equals("178"));
    }

    @Test
    public void canSubtractTwoHexNumbers() {
        String firstNumber = "cde";
        String secondNumber = "5";

        String result = HexBinOctCalculator.subtract(firstNumber, secondNumber, NumeralSystem.HEX);

        assertTrue(result.equals("cd9"));
    }

    @Test
    public void canMultiplyTwoHexNumbers() {
        String firstNumber = "4";
        String secondNumber = "be";

        String result = HexBinOctCalculator.multiply(firstNumber, secondNumber, NumeralSystem.HEX);

        assertTrue(result.equals("2f8"));
    }

    @Test
    public void canDivideTwoHexNumbers() {
        String firstNumber = "bc";
        String secondNumber = "a";

        String result = HexBinOctCalculator.divide(firstNumber, secondNumber, NumeralSystem.HEX);

        assertTrue(result.equals("12"));
    }

    @Test
    public void canAddTwoOctNumbers() {
        String firstNumber = "7";
        String secondNumber = "12";

        String result = HexBinOctCalculator.add(firstNumber, secondNumber, NumeralSystem.OCT);

        assertTrue(result.equals("21"));
    }

    @Test
    public void cabSubtractTwoOctNumbers() {
        String firstNumber = "35";
        String secondNumber = "17";

        String result = HexBinOctCalculator.subtract(firstNumber, secondNumber, NumeralSystem.OCT);

        assertTrue(result.equals("16"));
    }

    @Test
    public void canMultiplyTwoOctNumbers() {
        String firstNumber = "14";
        String secondNumber = "5";

        String result = HexBinOctCalculator.multiply(firstNumber, secondNumber, NumeralSystem.OCT);

        assertTrue(result.equals("74"));
    }

    @Test
    public void canDivideTwoOctNumbers() {
        String firstNumber = "71";
        String secondNumber = "6";

        String result = HexBinOctCalculator.divide(firstNumber, secondNumber, NumeralSystem.OCT);

        assertTrue(result.equals("11"));
    }

    @Test
    public void canNotDivideToZero() {
        String firstNumber = "23";
        String secondNumber = "0";

        String result = HexBinOctCalculator.divide(firstNumber, secondNumber, NumeralSystem.HEX);

        assertTrue(result.equals("Division by zero!"));
    }
}
