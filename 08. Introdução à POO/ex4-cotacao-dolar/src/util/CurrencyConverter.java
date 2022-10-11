package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double converter(double dollarQuote, double amount) {
		return dollarQuote * amount * (1.0 + IOF);
	}

}
