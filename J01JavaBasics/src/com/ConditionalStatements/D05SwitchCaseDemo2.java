package com.ConditionalStatements;

import java.util.Scanner;

public class D05SwitchCaseDemo2 {

	public static void main(String[] args) {
		String browser;// = "Firefox";
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Tell me the browser: ");
		browser = scn.next();
		
		switch(browser)
		{
		case "Chrome":
			System.out.println("Executing the script on Chrome");
			break;
		case "Firefox":
			System.out.println("Executing the script on Firefox");
			break;
		case "Edge":
			System.out.println("Executing the script on Edge");
			break;
		case "Safari":
			System.out.println("Executing the script on Safari");
			break;
		default:
			System.out.println("Invalid browser");
		}
	}

}
