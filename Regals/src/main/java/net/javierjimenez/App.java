package net.javierjimenez;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {

	private static String NOM_FITXER = "/llista_regals.txt";

	public static void main(String[] args) {

		BufferedReader llista = null;
		
		try {

			String llistaNens;
			String regalsNoel = null;

			llista = new BufferedReader(new FileReader(App.class.getResource(NOM_FITXER).getFile()));

			while ((llistaNens = llista.readLine()) != null) {

				if(!llistaNens.contains(":")){
					regalsNoel = llistaNens;
				}	
			}
			
			llista.close();
			
			llista = new BufferedReader(new FileReader(App.class.getResource(NOM_FITXER).getFile()));
			
			LlistaNens LN = new LlistaNens(regalsNoel);
			
			int nens = 0;
			
			while((llistaNens = llista.readLine()) != null) {
				
				if(llistaNens.contains(":")) nens = nens + LN.comprobarLlista(llistaNens);
				
			}

			System.out.println("Total de nens amb regal: " + nens);
			
		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (llista != null) llista.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}
		}
	}
}
