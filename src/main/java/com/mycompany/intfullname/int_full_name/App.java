package com.mycompany.intfullname.int_full_name;

/**
 * Conversor de Inteiros de até três dígitos em String contendo o nome
 *
 */
public class App {
	
	public String toName(int i) {
		
		if (i<0 || i>=1000){
			throw new RuntimeException("Out of range");
		}		
		
		String unidade = this.convertUnit(i);
		String dezena = this.convertDec(i);
		String centena = this.convertCen(i);
				
		String result = "";
		
		String conectorCentena = "";
		String conectorDezena = "";
		
		if(dezena.isEmpty()){
			if (!centena.isEmpty() && !unidade.isEmpty()){
				conectorDezena = " e ";
			}			
		}
		else{
			if (!centena.isEmpty()){
				conectorCentena = " e ";
			}			
			if (!unidade.isEmpty()){
				conectorDezena = "e";
			}
		}
		
		result = centena + conectorCentena + dezena + conectorDezena + unidade;
		
		//System.out.println("Result : " + result );
		
		return result;
		
	}


	private String convertUnit(int i){
		
		int centena = (i % 1000) / 100;
		int dezena = (i % 100) / 10;
		int unidade = (i % 10);		
		
		if (centena == 0 && dezena == 0 && unidade == 0)	
			return "zero";
		
		if (dezena == 1)
			return "";
		
		switch(unidade){
			case 1: return "um";
			case 2: return "dois";
			case 3: return "três";
			case 4: return "quatro";
			case 5: return "cinco";
			case 6: return "seis";
			case 7: return "sete";
			case 8: return "oito";
			case 9: return "nove";
		}
		
		return "";
	}
	

	
	public String convertDec(int i){
		
		int dezena = (i % 100) / 10;
		int unidade = (i % 10);
				
		if (dezena == 1){
			if (unidade == 0){
				return "dez";
			}
			else{
				switch(unidade){
					case 1: return "onze";
					case 2: return "doze";
					case 3: return "treze";
					case 4: return "quatorze";
					case 5: return "quinze";
					case 6: return "dezesseis";
					case 7: return "dezessete";
					case 8: return "dezoito";
					case 9: return "dezenove";
				}
			}
		}
		else{
			switch(dezena){
				case 2: return "vinte";
				case 3: return "trinta";
				case 4: return "quarenta";
				case 5: return "cinquenta";
				case 6: return "sessenta";
				case 7: return "setenta";
				case 8: return "oitenta";
				case 9: return "noventa";			
			}
		}

		return "";
	}
	
	
	public String convertCen(int i){
		
		int centena = (i % 1000) / 100;
		int dezena = (i % 100) / 10;
		int unidade = (i % 10);
		
		if (centena == 1 && dezena == 0 && unidade == 0)
			return "cem";
		
		switch(centena){
			case 1: return "Cento";
			case 2: return "Duzentos";
			case 3: return "Trezentos";
			case 4: return "Quatrocentos";
			case 5: return "Quinhentos";
			case 6: return "Seiscentos";
			case 7: return "Setecentos";
			case 8: return "Oitocentos";
			case 9: return "Novecentos";
		}
	
		return "";
	}
	
	
	/*
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    */
    

}
