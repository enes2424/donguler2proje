import java.util.Scanner;

public class PatikaProje {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num, total = 0;
		do {
			System.out.print("Sayı Giriniz : ");
			num = input.nextInt();
			if (num % 4 == 0) total += num;
		} while (num % 2 != 1);
		System.out.println("Toplam : " + total);
	}

}
