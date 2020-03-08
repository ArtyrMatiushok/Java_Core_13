package les13.Zrada;

import java.util.*;

public class Fraction {
	private String title;
	private LinkedList<Senator> senators = new LinkedList<Senator>();
	
	public Fraction(String title) {
		this.setTitle(title);
	}
	
	public void addSenator() {
		Scanner in = new Scanner(System.in);
		System.out.println("Input senator weight for add: ");
		int weight = in.nextInt();
		System.out.println("Input senator height for add: ");
		int height = in.nextInt();
		System.out.println("Inut senator lastname for add: ");
		in.nextLine();
		String lastname = in.nextLine();
		System.out.println("Input senator name for add: ");
		String name = in.nextLine();
		System.out.println("Input senator bribe taker for add: ");
		boolean bribeTaker = in.nextBoolean();
		
		senators.add(new Senator(weight, height, lastname, name, bribeTaker));
	}
	
	public void removeSenator() {
		Scanner in = new Scanner(System.in);
		System.out.println("Input senator weight for remove: ");
		int weight = in.nextInt();
		System.out.println("Input senator height for remove: ");
		int height = in.nextInt();
		System.out.println("Inut senator lastname for remove: ");
		in.nextLine();
		String lastname = in.nextLine();
		System.out.println("Input senator name for remove: ");
		String name = in.nextLine();
		System.out.println("Input senator bribe taker for remove: ");
		boolean bribeTaker = in.nextBoolean();
		
		senators.remove(new Senator(weight, height, lastname, name, bribeTaker));
	}
	
	public void showAllBribeTakers() {
		Iterator<Senator> it = senators.iterator();
		
		while (it.hasNext()) {
			Senator s = it.next();
			if (s.isBribeTaker())
				System.out.println("Bribe Taker - " + s);
		}
	}
	
	public void showTheBestBribeTaker() {
		Iterator<Senator> it = senators.iterator();
		
		Senator s1 = it.next();
		while (it.hasNext()) {
			Senator s2 = it.next();
			if (s2.getSizeOfBribe() > s1.getSizeOfBribe())
				s1 = s2;
		}
		System.out.println("The best bribe taker in the fraction " + title + " is " + s1.toString());
	}
	
	public void showAllSenators() {
		for (Senator s : senators)
			System.out.println(s.toString());
	}
	
	public void clear() {
		senators.clear();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Fraction [title=" + title + ", senators=" + senators + "]";
	}
}
