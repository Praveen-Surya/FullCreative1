package org.full;

public class AccessModifiers {

	public static int empId = 1001;
	String empName = "Napier";
	private String empNickName = "Napi";
	protected String bloodGroup = "B+ve";

	protected AccessModifiers(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
}
