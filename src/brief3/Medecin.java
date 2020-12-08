package brief3;

public class Medecin extends Personne {

	public Medecin(String nom, int age) {
		super(nom, age);
	}
	
	public String toString() {
		return super.toString() + "et je travaille en tant que médecin !";
	}
	
	public void afficher() {
		System.out.println(toString());
	}
}
