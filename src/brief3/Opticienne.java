package brief3;

public class Opticienne extends Personne {

	public Opticienne(String nom, int age) {
		super(nom, age);
	}

	public String toString() {
		return super.toString() + "et je travaille en tant que opticienne !";
	}
	
	public void afficher() {
		System.out.println(toString());
	}
}
