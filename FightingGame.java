
class Fighter {
    String name;
    int health;
    int attack_power;

    Fighter(String name, int health, int attack_power) {
        this.name = name;
        this.health = health;
        this.attack_power = attack_power;
    }

    public void attack(Fighter opponent) {
        System.out.println(this.name + " is attacking " + opponent.name);
        opponent.health -= this.attack_power;
        System.out.println(opponent.name + " health is now " + opponent.health);
    }

    public boolean isAlive() {
        if (health > 0) {
            return true;
        } else {
            return false;
        }
    }
}

public class FightingGame {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Ali", 100, 20);
        Fighter fighter2 = new Fighter("Aisha", 120, 15);

        while (fighter1.isAlive() && fighter2.isAlive()) {
            fighter1.attack(fighter2);
            if (!fighter2.isAlive()) {
                System.out.println(fighter1.name + " wins!");
                break;
            }
            fighter2.attack(fighter1);
            if (!fighter1.isAlive()) {
                System.out.println(fighter2.name + " wins!");
                break;
            }
        }
    }
}

