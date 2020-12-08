package brief3;

public abstract class Personne {
	private String nom;
	private int age;
	
	public Personne(String nom, int age) {
		super();
		this.nom = nom;
		this.age = age;
	}
	
	public String toString() {
		return "Je suis " + nom + ", j’ai " + age + " ans ";
	}
	public abstract void afficher();
}
