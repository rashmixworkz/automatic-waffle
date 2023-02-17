package com.xworkz.Technical;

public class maximumAndMinimumOccuring {

	public static void main(String[] args) {
		String str = "Music is moonlight in the gloomy night of life";
		str=str.toLowerCase();
		int[] freq = new int[str.length()];
		char minChar = str.charAt(0);
		char maxChar = str.charAt(0);
		int max, min, count = 0;

		char[] array = str.toCharArray();

		for (int i = 0; i < array.length; i++) {
			freq[i] = 1;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j] && array[i] != '0' && array[i] != ' ') {
					freq[i]++;

					array[j] = '0';
				}
			}
		}
		min = max = freq[0];
		for (int i = 0; i < freq.length; i++) {

			if (min > freq[i]) {
				min = freq[i];
				minChar = array[i];
			}
			if (max < freq[i]) {
				max = freq[i];

				maxChar = array[i];
				count++;
			}
		}
		System.out.println("maximum occuring charcter: " + maxChar);
		System.out.println("minimum occuring charcter: " + minChar);

	}

}
