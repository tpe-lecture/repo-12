package metropolis;

import steuer.Gewerbesteuerpflichtig;

public abstract class Unternehmen implements Gewerbesteuerpflichtig {

	int gewinn;
	String name;

	public Unternehmen(int gewinn, String name){
		this.gewinn = gewinn;
		this.name = name;
	}
}
