package metropolis;

public abstract class Einwohner {

	protected String name;
	public long einkommen;


	public Einwohner(String name, long einkommen){
		this.name = name;
		this.einkommen = einkommen;
	}
}
