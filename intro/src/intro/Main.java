package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello world!");

		String ortaMetin = "İlginizi çekebilir";
		String altMetin = "Vade süresi";

		System.out.println(ortaMetin);

		int vade = 12;

		double dolarDun = 18.14;
		double dolarBugun = 18.11;

		boolean dolarDustumu = false;

		String okYonu = "";

		if (dolarBugun < dolarDun) {
			okYonu = "down.svg";
			System.out.println(okYonu);
		} else if (dolarBugun > dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);
		} else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}

		// Array
		String[] krediler = { "Hızlı kredi", "Maaşını halkbanktan", "Mutlu emeki" };
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}

	}

}
