package personnages;
import village.Village; 

public class Gaulois {
	
	private String nom;
	private int force;
	private int effetPotion = 1;
	private Village village;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	
	public String getNom() {
		return nom;
	}
	
	public void setVillage(Village village) {
		this.village = village;
	}
	
	public void setEffetPotion(int effetPotion) {
        this.effetPotion = effetPotion;
    }
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}


	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	
	public void frapper(Romain romain) {
        System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
        int forceCoup = (force * effetPotion) / 3;
        romain.recevoirCoup(forceCoup);
        if (effetPotion > 1) {
            effetPotion--;
        }
    }
	
	public void sePresenter() {
		if (village == null) {
			System.out.println("Le Gaulois " + nom + " : \"Bonjour, je m'appelle " + nom + ". Je voyage de villages en villages.\"");
		} else if (this == village.getChef()) {
			System.out.println("Le Gaulois " + nom + " : \"Bonjour, je m'appelle " + nom + ". Je suis le chef le village : " + village.getNom() + ".\"");
		} else {
			System.out.println("Le Gaulois " + nom + " : \"Bonjour, je m'appelle " + nom + ". J'habite le village : "+ village.getNom() + ".\"");
		}
	}
	
	@Override
    public String toString() {
        return nom;
    }
    
    
    public static void main(String[] args) {
        Gaulois asterix = new Gaulois("Astérix", 8);
        System.out.println(asterix.getNom());
        System.out.println(asterix);
    }


	
}
