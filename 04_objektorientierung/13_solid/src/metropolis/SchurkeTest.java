package metropolis;

import static org.junit.Assert.*;


import org.junit.Test;

public class SchurkeTest {

	@Test
		public static void main(String[]args){
			Schurke azog = new Schurke("Azog der Schänder",  27990, "Orkismus");
			Schurke hannibal = new Schurke("Hannibal Lecter",  19910, "Kannibalismus");
			Schurke onox = new Schurke("onox",  270201, "Legendismus");


			Syndikat superschurken = new Syndikat("Syndikat der Superschurken");

			superschurken.enterINSyndikat(azog);
			superschurken.enterINSyndikat(hannibal);
			superschurken.enterINSyndikat(onox);


		}


}
