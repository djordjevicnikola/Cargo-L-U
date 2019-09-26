package tovardomaci09132019;

import java.util.ArrayList;

public class Paket extends Tovar {
	public ArrayList<Tovar> tovar = new ArrayList<Tovar>();

	public Paket() {
		super();
	}

	public void dodaj(Tovar t) {
		tovar.add(t);
	}

	@Override
	public String vrsta() {
		String vrsta = "paket[";
		for (int i = 0; i < tovar.size(); i++) {
			if (i == tovar.size() - 1) {
				vrsta += tovar.get(i).vrsta() + "]";
			} else {
				vrsta += tovar.get(i).vrsta() + ", ";
			}
		}
		return vrsta;
	}

	@Override
	public double tezina() {
		double tezina = 0;
		for (int i = 0; i < tovar.size(); i++) {
			tezina += tovar.get(i).tezina();
		}
		return tezina;
	}

}
