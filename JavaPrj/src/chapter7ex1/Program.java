package chapter7ex1;

import java.util.Random;

public class Program {

	public static void main(String[] args) {

		/*
		 * 1. �˸��� : ���� ������ �׸�(��������� �׸�)-��ƼƼ:��ü 2. ���� : �˸��̵��� ������ �ִ��� ����������..�ؼ� �˸��̵���
		 * �������ִ� ���� 3. ������ : ������� �Է�/����� �����ִ� ����� �������̽�
		 */

		// �˸���
		int[] lotto = new int[6];
//		chapter6ex5.entity.Lotto lo1 = new chapter6ex5.entity.Lotto();
//		chapter7ex1.entity.Lotto lotto = new chapter7ex1.entity.Lotto();
		// ���� ���� entity �̸��� ���� ���, �ּҸ� �̿��� �������Ѵ�.
		// �� ���� ����ϴ°� �׳� import�� �ֱ�
//		Lotto lotto = new Lotto();

		// ��ȣ�� ���� gen
		Random rand = new Random();
		for (int i = 0; i < 6; i++)
			lotto[i] = rand.nextInt(45) + 1;

		// ��ȣ�� ��� print
		for (int i = 0; i < 6; i++)
			System.out.printf("%d ", lotto[i]);

		System.out.println();

		// ��ȣ�� ���� sort
		for (int j = 0; j < 5; j++)
			for (int i = 0; i < 5 - j; i++)
				if (lotto[i] > lotto[i + 1]) {
					int temp = lotto[i];
					lotto[i] = lotto[i + 1];
					lotto[i + 1] = temp;
				}

		// ��ȣ�� ��� print
		for (int i = 0; i < 6; i++)
			System.out.printf("%d ", lotto[i]);

		System.out.println();

	}

}