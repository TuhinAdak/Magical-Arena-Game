/**
 * 
 */
package swiggy_game;

/**
 * 
 */
class Player {
    // Player class to define and initialise Player attributes
    private String name;
    private int health;
    private int strength;
    private int attack;

    public Player(String name, int health, int strength, int attack) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getAttack() {
        return attack;
    }

    public void dmg(int damage) { //calculates health after damage
        this.health -= damage;
        if (this.health < 0) {// if damage causes health to drop beyond 0, health is automatically set to 0
            this.health = 0;
        }
    }

    public boolean healthCheck() {//checks health status of player
        if (this.health > 0)
    		return true; // Returns true if the player is alive
    	else
    		return false; // Returns false if the player is not alive
    }
}
