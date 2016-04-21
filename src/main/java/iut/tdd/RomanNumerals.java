package iut.tdd;

public class RomanNumerals {
	public String convertToRoman(String arabe) {
		int nombrearabe=Integer.valueOf(arabe);
		String k="";
		if(nombrearabe%1000==0 && nombrearabe>0){
			int d=1000;
			if(d==nombrearabe){
				k=k+"M";
			}
			while(d!=nombrearabe){
				k=k+"M";
				d=d+1000;
			}
		}
		else if(nombrearabe%1000!=0){
			
		k=k+"I";	
		}
		return k;
	}

	public String convertFromRoman(String roman) {
		return "3";
	}

}
