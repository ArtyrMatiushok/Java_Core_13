package les13.Zrada;

import java.util.Scanner;

public class Senator extends Person {
	private String lastname;
	private String name;
	private boolean bribeTaker;
	private int sizeOfBribe;
	
	public Senator(int weight, int height, String lastname, String name, boolean bribeTaker) {
		super(weight, height);
		this.lastname = lastname;
		this.name = name;
		this.bribeTaker = bribeTaker;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isBribeTaker() {
		return bribeTaker;
	}

	public void setBribeTaker(boolean bribeTaker) {
		this.bribeTaker = bribeTaker;
	}

	public int getSizeOfBribe() {
		return sizeOfBribe;
	}

	public void setSizeOfBribe(int sizeOfBribe) {
		this.sizeOfBribe = sizeOfBribe;
	}
	
	public void toBribe() {
		if (!bribeTaker)
			System.out.println("This senator does not take bribes");
		else {
			Scanner in = new Scanner(System.in);
			System.out.println("Input your size of the bribe: ");
			int size = in.nextInt();
			if (size > 5000)
				System.out.println("The police will imprison the senator");
			else
				this.sizeOfBribe = size;
			in.close();
		}
	}

	@Override
	public String toString() {
		return "Senator [lastname=" + lastname + ", name=" + name + ", bribeTaker=" + bribeTaker + ", sizeOfBribe="
				+ sizeOfBribe + "]";
	}

}
