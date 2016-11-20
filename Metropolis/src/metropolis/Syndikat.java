package metropolis;
import java.util.ArrayList;

public class Syndikat {

	public String name;
	public ArrayList<Schurke> mitglieder = new ArrayList<Schurke>();

	public Syndikat(String name){
		this.name = name;
	}

	public void enterINSyndikat(Schurke schurke){
		mitglieder.add(schurke);
	}


	@Override
	public String toString(){
		return "Syndikat [name = " + name+ ", mitglieder=" + mitglieder + " ]";
	}

	public long getEinkommen(){
		long gesamtEinkommen = 0;
		for(int i = 0; i< mitglieder.size(); i++){
			gesamtEinkommen = gesamtEinkommen + mitglieder.get(i).einkommen;
		}
		return gesamtEinkommen;
	}
}
