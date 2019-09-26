package tovardomaci09132019;

import java.util.ArrayList;

public class Kamion {
	private String regBroj;
	private double nosivost;
	private ArrayList<Tovar> tovar = new ArrayList<Tovar>();
	private double teret = 0;

	public Kamion(String regBroj, double nosivost) {
		super();
		this.regBroj = regBroj;
		this.nosivost = nosivost;
	}

	public boolean stavi(Tovar t) {
		if (teret + t.tezina() < nosivost) {
			teret += t.tezina();
			tovar.add(t);
			return true;
		}
		return false;
	}

	public void skini() {
		teret = 0;
		for (int i = 0; i < tovar.size(); i++) {
			tovar.remove(i);
		}
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(regBroj + " (" + teret + "/" + nosivost + ")\n  ");
		for (int i = 0; i < tovar.size(); i++) {
			sb.append(tovar.get(i).toString() + "\n  ");
		}
		return sb.toString();
	}
}
