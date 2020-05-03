package ua.lviv.lgs;


public class Application_03 {

	public static void main(String[] args) {
		int[] array1 = { 1, 10, 100, 200, 699, 489, 99, 399, 500, 6999 };

		int min = array1[0];
		for (int i = 0; i < array1.length; i++)

			if (min > array1[i])
				min = array1[i];

		System.out.println(min + " - найменше значення з масиву.");

		int max = array1[0];

		for (int i = 0; i < array1.length; i++)
			if (max < array1[i])
				max = array1[i];
		System.out.println(max + " - найбільше значення з масиву.");

	}

}

//commit to github
