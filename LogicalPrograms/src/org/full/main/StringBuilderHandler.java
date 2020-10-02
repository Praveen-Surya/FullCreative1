package org.full.main;

public class StringBuilderHandler {

	public String replaceString(String inputStr, String oldStr, String newStr) {

		StringBuilder resultStr = new StringBuilder();
		char[] inputChar = inputStr.toCharArray();
		if (inputStr.contains(oldStr)) {
			if (oldStr.length() == 1) {
				for (int index = 0; index < inputChar.length; index++) {

					for (int index1 = 0; index1 < oldStr.length(); index1++) {

						if (inputChar[index] == oldStr.charAt(index1)) {

							inputChar[index] = newStr.charAt(index1);

						}
						resultStr = resultStr.append(inputChar[index]);
					}
				}
			} else {
				for (int i = 0; i < inputChar.length; i++) {
					StringBuilder temp = new StringBuilder();
					while (i < inputChar.length && inputChar[i] != ' ') {
						temp = temp.append(inputChar[i]);
						i++;
					}

					if (temp.equals(oldStr) && i < inputChar.length) {
						resultStr = resultStr.append(newStr).append(" ");

					} else if (temp.equals(oldStr) && i == inputChar.length) {
						resultStr = resultStr.append(newStr);

					} else if (temp.equals(oldStr) || i < inputChar.length) {
						resultStr = resultStr.append(temp).append(" ");

					} else if (temp.equals(oldStr) || i == inputChar.length) {
						resultStr = resultStr.append(temp);
					}
				}
			}
		} else {
			return inputStr;
		}
		return resultStr.toString();

	}
}