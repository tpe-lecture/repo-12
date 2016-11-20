package steuer;

public interface Körperschaftssteuerpflichtig  {

	public static final int koerperschaftssteuerpflichtig = 15;

	public abstract long koerperSteuerBerechnen(long besteuerung);
}
