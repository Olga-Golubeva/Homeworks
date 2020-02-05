package inheritance;

class Person {
	private String name;
	private String address;
	
	public Person(String name, String address){
		this.name = name;
		this.address = address;
	
	}

	public String getAdress() {
		return address;
	}

	public void setAdress(String adress) {
		this.address = adress;
	}

	public String getName() {
		return name;
	}
	
	public String toString(){
		return this.name +"("+this.address+")";
	}
	 
	
}
