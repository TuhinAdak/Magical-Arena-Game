/**
 * 
 */
package swiggy_game;

/**
 * 
 */
class Game {
// Class to define game logic
    private Player playerA;
    private Player playerB;

    public Game(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }

    public void start() {
        Player attacker;
        Player defender;

        // Determine who rolls first based on health. Player with less health becomes first attacker
        // while other player becomes first defender
        if (playerA.getHealth() < playerB.getHealth()) {
            attacker = playerA;
            defender = playerB;
        } else {
            attacker = playerB;
            defender = playerA;
        }

        while (attacker.healthCheck() && defender.healthCheck()) //checks if both attacker and defender have health greater than 0
        {
            // Attacker's turn
            int attackRoll = Dice.roll();
            int defendRoll = Dice.roll();

            int atk_dmg = attackRoll * attacker.getAttack();
            int def_str = defendRoll * defender.getStrength();
            int def_dmg = Math.max(0, atk_dmg - def_str);

            defender.dmg(def_dmg);
            System.out.println(attacker.getName() + " attacks " + defender.getName() + ": " +
                    "Attack Roll = " + attackRoll + ", Defend Roll = " + defendRoll +
                    ", Damage = " + def_dmg + ", " + defender.getName() + " Health = " + defender.getHealth());

            // Swap roles
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }

        // Determine the winner
        if (attacker.healthCheck() == false) 
        {
            System.out.println(defender.getName() + " wins!");
        } else {
            System.out.println(attacker.getName() + " wins!");
        }
    }
}
