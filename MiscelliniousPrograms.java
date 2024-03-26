class Cabin {
	public int cabinNumber;

	Cabin(int number) {
		this.cabinNumber = number;
	}
}

 class Professor {
	public String name;
	public Cabin cabin;

	public Professor(String name, Cabin c) {
		this.name = name;
		this.cabin = c;
	}

	public void updateCabin(Cabin c) {
		this.cabin.cabinNumber = c.cabinNumber;
	}

	public static void main(String args[]) {
		Cabin c1 = new Cabin(121);
		Professor p1 = new Professor("Ronald", c1);
		Professor p2 = new Professor("Bonnie", c1);
		System.out.println(p1.name);
		Cabin c2 = new Cabin(122);
		p1.updateCabin(c2);
		System.out.println(p1.cabin.cabinNumber);
		System.out.println(p2.cabin.cabinNumber);
	}

}
 