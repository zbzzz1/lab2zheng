/** Project: Lab2 Monsters
 * Purpose Details: Vampire monster
 * Course: IST242
 * Author: Ziyan Zheng
 * Date Developed: 02/04/26
 * Last Date Changed: 02/05/26
 * Rev: 1.0
 */

public class Vampire extends Monster {

    public Vampire(String name, int level, int health, int attackPower, MonsterPower specialPower) {
        super(name, level, health, attackPower, specialPower);
    }

    public void specialPowers() {
        System.out.println("Vampire " + getName() + " uses special power: " + getSpecialPower());
    }
}
