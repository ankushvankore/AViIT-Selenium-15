package com.ConditionalStatements;

public class Trial {

	public static void main(String[] args) {
		int no1 = 10, no2 = 20;
		int i = 1;

		/*
		 * for(i = 1; i <= 10; i++) { System.out.println(i); } System.out.println(i);
		 */

		/*for (;;) {
			if (i <= 10) {
				System.out.println(i);
			}
			else {
				break;
			}
			i++;
		}*/
		
		for(i = 1; i <= 20; i++) {
			if(i % 5 == 0) {
				//continue;
				break;
			}
			System.out.println(i);
		}
	}

}
