package com.occl.burgoka.sw3;

import net.webservicex.*;

public class Currency_sw3 {

	public Currency_sw3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	
		//if(args.length != 1) {
			//System.out.println("Currency!");
		//}
		//else {
			//String curre1 = args[0];
			//String curre2 = args[1];
			CurrencyConvertor con = new CurrencyConvertor();
			CurrencyConvertorSoap conSoap = con.getCurrencyConvertorSoap();
			//Currency currency = new Currency();
			//CurrencyConvertor conve = currency.
			double curr = conSoap.conversionRate(Currency.USD, Currency.PHP);
			System.out.println(curr);	
		//}
	}
}
