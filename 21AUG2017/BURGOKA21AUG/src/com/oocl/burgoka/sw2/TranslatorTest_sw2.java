package com.oocl.burgoka.sw2;

import net.webservicex.*;

public class TranslatorTest_sw2 {

	public TranslatorTest_sw2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
			String translate = "beautiful";
			TranslateService tService = new TranslateService();
			TranslateServiceSoap tSoap = tService.getTranslateServiceSoap();
			String trans = tSoap.translate("EnglishTOFrench", translate);
			System.out.println(trans);
	
			
	}
}
