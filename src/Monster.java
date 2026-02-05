/** Project: Lab2 Monsters
 * Purpose Details: Abstract monster class for all monsters
 * Course: IST242
 * Author: Ziyan Zheng
 * Date Developed: 02/04/26
 * Last Date Changed: 02/05/26
 * Rev: 1.0
 */

public abstract class Monster {
    private String name;
    private int level;
    private int health;
    private int attackPower;
    private MonsterPower specialPower;

    public Monster(String name, int level, int health, int attackPower, MonsterPower specialPower) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.attackPower = attackPower;
        this.specialPower = specialPower;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public MonsterPower getSpecialPower() {
        return specialPower;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public void setSpecialPower(MonsterPower specialPower) {
        this.specialPower = specialPower;
    }

    public abstract void specialPowers();
}
