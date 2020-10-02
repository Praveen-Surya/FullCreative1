package org.full.main;

public class StringHandler {

	public String replaceString(String inputStr, String oldStr, String newStr) {

		String resultStr = "";
		char[] inputChar = inputStr.toCharArray();
		if (inputStr.contains(oldStr)) {
			if (oldStr.length() == 1) {
				for (int index = 0; index < inputChar.length; index++) {

					for (int index1 = 0; index1 < oldStr.length(); index1++) {

						if (inputChar[index] == oldStr.charAt(index1)) {
							inputChar[index] = newStr.charAt(index1);

						}
						resultStr += inputChar[index];
					}
				}
			} else {
				for (int i = 0; i < inputChar.length; i++) {
					String temp = "";
					while (i < inputChar.length && inputChar[i] != ' ') {
						temp = temp + inputChar[i];
						i++;
					}

					if (temp.equals(oldStr) && i < inputChar.length) {
						resultStr = resultStr + newStr + " ";

					} else if (temp.equals(oldStr) && i == inputChar.length) {
						resultStr = resultStr + newStr;

					} else if (temp.equals(oldStr) || i < inputChar.length) {
						resultStr = resultStr + temp + " ";

					} else if (temp.equals(oldStr) || i == inputChar.length) {
						resultStr = resultStr + temp;
					}
				}
			}
		} else {
			resultStr = inputStr;
		}
		return resultStr;

	}
}