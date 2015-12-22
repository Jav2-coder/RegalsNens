package net.javierjimenez;

public class LlistaNens {

	private static String regals;
	int nensAmbRegal = 1;

	public LlistaNens(String r) {

		regals = r;

	}

	public void comprobarLlista(String llista) {

		String[] regalsNen = llista.split(": ");

		int comprobar = 0;
		
		if (regalsNen[1].contains(",")) {

			String[] desitjNen = regalsNen[1].split(",");

			for (String regal : desitjNen) {

				if (!regals.contains(regal)) {
					comprobar--;
				}
			}

		} else {

			if (!regals.contains(regalsNen[1])) {
				comprobar--;
			}
			
		}

		if (comprobar == 0) {

			System.out.println(nensAmbRegal + "-" + regalsNen[0]);
			nensAmbRegal++;

		}
	}
}
