import java.util.Locale;
import java.util.Set;

public class main {

	public static void main(String[] args) {
		String product1 = "computer";
		String product2 = "office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'f';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("products:");
		System.out.printf("%s, wich price is $ %.2f %n", product1, price1);
		System.out.printf("%s, wich price is $ %.2f %n", product2, price2);
		System.out.printf("%nrecord: %d years old, code %d and gender: %s %n%n", age, code, gender);
		System.out.printf("measure with eight decimal places: %.8f %n", measure);
		System.out.printf("rouded (three decimal places): %.3f %n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);
	}

}
