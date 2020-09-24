package chapter6ex3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program4_new {

	public static void main(String[] args) throws IOException {

		NumList list = new NumList();

		list.size = 0;
		list.nums = null;

		// �����͸� int[] nums �迭�� �ε��ϴ� �ڵ带 �ۼ��ϰ�
		load(list);

		while (true) {
			System.out.println("<<   �޴�   >>");
			System.out.println("1. �� �Է�");
			System.out.println("2. �հ� ���ϱ�");
			System.out.println("3. ¦���� ���� ���");
			System.out.println("4. ����");
			System.out.printf("���� �޴� �� �� ������ �����ϼ��� >> ");
			Scanner scan = new Scanner(System.in);
			int choice = scan.nextInt();

			if (choice == 1) {

				// ����ڷκ��� ���� �ϳ��� �Է� �޴´�.
				System.out.print("���ڸ� �Է��ϼ��� > ");
				scan = new Scanner(System.in);
				int num = scan.nextInt();
				add(list, num);
				System.out.println();

			} else if (choice == 2) {

				// nums �迭�� �հ踦 ���ϰ�
				int sum = sum(list);
				System.out.println("�迭�� �հ� : " + sum);
				System.out.println();

			} else if (choice == 3) {

				// nums �� �߿��� ¦���� ������ ���ϰ�
				int count = getEvenNumberCount(list);
				System.out.println("¦���� ���� : " + count);
				System.out.println();

			} else if (choice == 4) {

				System.out.println("���α׷��� �����մϴ�.");
				break;

			} else {
				
				System.out.println("�߸��� ���ڸ� �Է��Ͽ����ϴ�. \n1~4 �� �ϳ��� �Է��ϼ���.");
			
			}
		}
		System.out.println();
	}

	private static void add(NumList list, int num) {

		// ������ ���ڶ�� ������ �÷��ִ� �۾�
		// 1. list.nums.length ���� 5�� ū �迭 temp �� �غ��Ѵ�.
		// list.nums.length;
		// list.size
		if (list.size == list.nums.length) {
			int[] temp = new int[list.size + 5];

			// 2. ���� list.nums�迭�� �ִ� ������ temp������ �ű��.
			for (int i = 0; i < list.size; i++)
				temp[i] = list.nums[i];

			// 3. temp�� �����ϴ� �迭�� list.nums�� ������Ų��.
			list.nums = temp;
		}

		list.nums[list.size] = num;
		list.size++;

	}

	private static int getEvenNumberCount(NumList list) {

		int count = 0;
		for (int i = 0; i < list.size; i++)
			if (list.nums[i] % 2 == 0)
				count++;

		return count;
	}

	static int sum(NumList list) {

		int sum = 0;
		for (int i = 0; i < list.size; i++)
			sum += list.nums[i];

		return sum;
	}

	static void load(NumList list) throws IOException {

		FileInputStream fis = new FileInputStream("res/data.txt");
		Scanner scan = new Scanner(fis);

		list.size = scan.nextInt();
		list.nums = new int[list.size];

		for (int i = 0; i < list.size; i++) {
			list.nums[i] = scan.nextInt();
		}

		fis.close();
	}

}