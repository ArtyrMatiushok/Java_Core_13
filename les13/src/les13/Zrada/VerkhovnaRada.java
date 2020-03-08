package les13.Zrada;

import java.util.Iterator;
import java.util.LinkedList;

public class VerkhovnaRada {
	private static VerkhovnaRada VR;
	private LinkedList<Fraction> fractions = new LinkedList<Fraction>();
	
	private VerkhovnaRada() {
		
	}
	
	public void addFraction(Fraction f) {
		fractions.add(f);
	}
	
	public void removeFraction(String titleOfFraction) {
		Iterator<Fraction> it = fractions.iterator();
		while (it.hasNext()) {
			Fraction f = it.next();
			if (f.getTitle().equalsIgnoreCase(titleOfFraction))
				fractions.remove(f);
		}
	}
	
	public void showAllFractions() {
		for (Fraction f : fractions)
			System.out.println(fractions);
	}
	
	public void showFraction(String title) {
		for (Fraction f : fractions)
			if (title.equalsIgnoreCase(f.getTitle())) {
				System.out.println(f);
				break;
			}
	}
	
	public void addSenatorToFraction(String title) {
		for (Fraction f : fractions)
			if (title.equalsIgnoreCase(f.getTitle())) {
				f.addSenator();
				break;
			}
	}
	
	public void removeSenatorFromFraction(String title) {
		for (Fraction f : fractions)
			if (title.equalsIgnoreCase(f.getTitle())) {
				f.removeSenator();
				break;
			}
	}
	
	public void showAllBribeTakersFromFraction(String title) {
		for (Fraction f : fractions)
			if (title.equalsIgnoreCase(f.getTitle())) {
				f.showAllBribeTakers();
				break;
			}
	}
	
	public void showTheBestBribeTakersFromFraction(String title) {
		for (Fraction f : fractions)
			if (title.equalsIgnoreCase(f.getTitle())) {
				f.showTheBestBribeTaker();
				break;
			}
	}
	
	public void showAllSenatorsFromFraction(String title) {
		for (Fraction f : fractions)
			if (title.equalsIgnoreCase(f.getTitle())) {
				f.showAllSenators();
				break;
			}
	}
	
	public void removeSenatorsFromFraction(String title) {
		for (Fraction f : fractions)
			if (title.equalsIgnoreCase(f.getTitle()))
				f.clear();
	}
	
	public static VerkhovnaRada getInstance() {
		if (VR == null)
			VR = new VerkhovnaRada();
		return VR;
	}
}
