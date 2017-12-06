package com.volvo.simplilearn;

public class ConvertNumberToWords {

	public String convertToWords(String number) {
		String numberInWords = "";

		int numberOfDigits = number.length();
		char charArray[] = number.toCharArray();
		Integer numberAsInt = Integer.parseInt(number);
		if (numberAsInt <= 0 || numberAsInt > 999) {
			numberInWords = "Invalid Number";
			return numberInWords;
		}
		if (numberAsInt > 19) {
			int j = 0;
			for (int i = numberOfDigits; i > 0; i--) {
				String prefix = getPrefix(i, charArray[j]);
				j = j + 1;
				numberInWords = numberInWords + " " + prefix;
			}
		} else {
			numberInWords = SingleDigitInWords(numberAsInt);
		}
		return numberInWords;

	}

	public String getPrefix(int i, char digit) {

		String numberInWords = "";

		if (i == 1) {
			String number = digit + "";
			Integer numberAsInt = Integer.parseInt(number);
			numberInWords = SingleDigitInWords(numberAsInt);
		}
		if (i == 2) {
			String number = digit + "0";
			Integer numberAsInt = Integer.parseInt(number);

			numberInWords = SingleDigitInWords(numberAsInt);
		}
		if (i == 3) {
			String number = digit + "";
			Integer numberAsInt = Integer.parseInt(number);
			numberInWords = SingleDigitInWords(numberAsInt);
			numberInWords = numberInWords + " Hundred";
		}

		return numberInWords;
	}

	public String SingleDigitInWords(int number) {

		String digitInWords = "";

		switch (number) {

		case 1:
			digitInWords = "One";
			break;
		case 2:
			digitInWords = "Two";
			break;

		case 3:
			digitInWords = "Three";
			break;

		case 4:
			digitInWords = "Four";
			break;

		case 5:
			digitInWords = "Five";
			break;

		case 6:
			digitInWords = "Six";
			break;

		case 7:
			digitInWords = "Seven";
			break;

		case 8:
			digitInWords = "Eight";
			break;

		case 9:
			digitInWords = "Nine";
			break;

		case 10:
			digitInWords = "Ten";
			break;

		case 11:
			digitInWords = "Eleven";
			break;

		case 12:
			digitInWords = "Tweleve";
			break;

		case 13:
			digitInWords = "Thirteen";
			break;

		case 14:
			digitInWords = "Fourteen";
			break;

		case 15:
			digitInWords = "Fifteen";
			break;

		case 16:
			digitInWords = "Sixteen";
			break;

		case 17:
			digitInWords = "Seventeen";
			break;

		case 18:
			digitInWords = "Eighteen";
			break;

		case 19:
			digitInWords = "Nineteen";
			break;

		case 20:
			digitInWords = "Twenty";
			break;

		case 30:
			digitInWords = "Thirty";
			break;

		case 40:
			digitInWords = "Fourty";
			break;

		case 50:
			digitInWords = "Fifty";
			break;

		case 60:
			digitInWords = "Sixty";
			break;

		case 70:
			digitInWords = "Seventy";
			break;

		case 80:
			digitInWords = "Eighty";
			break;

		case 90:
			digitInWords = "Ninety";
			break;

		}

		return digitInWords;
	}

}
