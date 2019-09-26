package tovardomaci09132019;

public abstract class Tovar {
	public abstract String vrsta();

	public abstract double tezina();

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.vrsta() + "(" + this.tezina() + ")");
		return sb.toString();
	}
}
