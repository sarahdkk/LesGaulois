package personnages;

public class Chaudron {
	private int quantitePotion = 0;
    private int forcePotion = 0;
    
    public boolean resterPotion() {
    	return quantitePotion > 0;
    }
    
    public void remplirChaudron(int quantite, int force) {
        this.quantitePotion = quantite;
        this.forcePotion = force;
    }
    
    public int prendreLouche() {
        if (resterPotion()) {
            quantitePotion--;
            return forcePotion;
        }
        return 1;
    }
    
  
}
