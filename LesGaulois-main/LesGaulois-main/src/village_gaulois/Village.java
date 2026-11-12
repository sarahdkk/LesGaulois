package village_gaulois;

import personnages.Gaulois;

public class Village {

	private String nom;
	private Integer nbVillageois =0;
	private Gaulois chef;
	private Gaulois[] villageois;
	private static final int NB_VILLAGEOIS_MAX =30;

	public Village(String nom, Gaulois chef) {

			this.nom = nom;
			this.chef=chef;
			this.villageois= new Gaulois[NB_VILLAGEOIS_MAX];
	}

	public String getNom() {
		return nom;
	}

	public Gaulois getChef() {
		return chef;
	}


	public void ajouterVillageois(Gaulois gaulois) { //void car on nous demande pas de retouner une valleur

		if(nbVillageois<Villageois.lengh) {
			villageois[nbVillageois]=gaulois;
			nbVillageois++;
			gaulois.setVillage(this);
	
		}
	}

	public Gaulois trouverVillageois(int numVillageois) {
		if(numVillageois > 0 && numVillageois <= nbVillageois) {
			return Villageois[numVillageois -1 ];
		}
		else {
			System.out.println("Il n’y a pas autant d’habitants dans notre village !");
			return null;
		}
	}
	
	public void afficherVillageois() {
		System.out.printl("Dans le village \\\"\" + nom + \"\\\" du chef \" + chef.getNom() + \" vivent les légendaires gaulois :");
		for(int i=0; i<nbVillageois;i++) {
			System.out.println("- "+ villageois[i].getNom());
		}
	}
	
}

	public void main(String[] args ) {

		Gaulois Abraracourcix= new Gaulois("Abraracourcix",6);
		Village village = new village("Village des Irréductibles",Abraracourcix);
		village.trouverVillageois(30);
		Gaulois Asterix= new Gaulois("Asterix",8);
		village.ajouterVillageois(asterix);
		Gaulois gaulois = village.trouverVillageois(1);
		System.out.println(gaulois);
		gaulois=village.trouverVillageois(2);
		System.out.println(gaulois);
	}
	


}


// a mettre dans gaulois

public void sePresenter() {
	if(village==null) {
		System.out.println("Le Gaulois \" + nom + \" : \\\"Bonjour, je m'appelle \" + nom + \". Je voyage de villages en villages.\\\"\"");
		
	}
	else if(this == village.getChef()) {
		System.out.println("Le Gaulois \" + nom + \" : \\\"Bonjour, je m'appelle \" + nom + \". Je suis le chef du village : \" + village.getNom() + \".\\\"\"");
	}
	else {
		System.out.println("Le Gaulois \" + nom + \" : \\\"Bonjour, je m'appelle \" + nom + \". J'habite le village : \" + village.getNom() + \".\\\"\"");
	}

    