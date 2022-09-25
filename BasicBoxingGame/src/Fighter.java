public class Fighter {
	
	String name;
    int damage;
    int health;
    int weight;
    double dodge;
    
    public Fighter(String name, int damage, int health, int weight, double dodge) {
    	this.name = name;
    	this.damage = damage;
    	this.health = health;
    	this.weight = weight;
    	this.dodge = dodge;
	}
    
    public int hit(Fighter rival) {
    	System.out.println(this.name + " did " + this.damage + " damage.");

        if (rival.isDodge()) {
            System.out.println(rival.name + " dodges the incoming damage..");
            return rival.health;
        }

        if (rival.health - this.damage < 0)
            return 0;

        return rival.health - this.damage;
    	
    	
    }
    
    public boolean isDodge() {
    	double randomValue = Math.random() * 100;
    	return randomValue <= this.dodge;
    }
    
}
