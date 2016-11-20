package metropolis;

public class Schurke extends Mutant {

	public String mutation;

	public Schurke(String name, int einkommen, String mutation) {
		super(name, einkommen);
		this.mutation = mutation;

	}

	@Override
	public String toString() {
		return "Mutation= " + mutation+" Name: "+ name;
	}


}
