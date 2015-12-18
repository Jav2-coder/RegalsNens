package net.javierjimenez;

public class LlistaNens {

	private static String regals;
	
	public LlistaNens(String r){
		
		regals = r;
		
	}
	
	public int comprobarLlista(String llista) {
		
		String[] regalsNen = llista.split(": ");
		String[] desitjNen = regalsNen[1].split(",");
	
		int totalNens = 0;
		
		int comprobar = 0;
		
		for (String regal : desitjNen) {
            
			if(!regals.contains(regal)){
				comprobar--;
			}
        }
		
		if (comprobar == 0) totalNens++;
		
		return totalNens;
	}
}
