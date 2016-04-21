package iut.tdd;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumeralsTest {

	@Test
	public void should_return_I_when_1() {
		// Given
		String input = "1";
		String expected = "I";
		RomanNumerals romanNumeral = new RomanNumerals();
		// When
		String actual = romanNumeral.convertToRoman(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void should_return_3_when_III() {
		String input = "III";
		String expected = "3";
		RomanNumerals romanNumeral = new RomanNumerals();
		String actual = romanNumeral.convertFromRoman(input);
		Assert.assertEquals(expected, actual);

	}
	
	@Test
	public void should_return_M_when_1000() {
		// Given
		String input = "1000";
		String expected = "M";
		RomanNumerals romanNumeral = new RomanNumerals();
		// When
		String actual = romanNumeral.convertToRoman(input);
		// Then
		Assert.assertEquals(expected, actual);
	}

}
