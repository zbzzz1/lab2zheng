/** Project: Lab2 Monsters
 * Purpose Details: Abstract parent class for all monsters
 * Course: IST242
 * Author: Ziyan Zheng
 * Date Developed: 02/04/26
 * Last Date Changed: 02/08/26
 * Rev: 1.0
 */

/**
 * Adds two numbers and returns the result.
 *
 * @param This is the color of the monster.
 * @param size This is the size of the monster.
 */

public abstract sealed class Monsters
        permits Werewolf, Ghost, Vampire {
    private String name;
    private int level;
    private int health;
    private int attackPower;
    private int defensePower;
    private int speed;
    private MonsterPower specialPower;

    public Monsters(String name, int level, int health, int attackPower, int defensePower, int speed, MonsterPower specialPower) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.attackPower = attackPower;
        this.defensePower = defensePower;
        this.speed = speed;
        this.specialPower = specialPower;
    }

    public abstract void specialPowers();
    public abstract String getSubclassInfo();

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getLevel() { return level; }
    public void setLevel(int level) { this.level = level; }

    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = health; }

    public int getAttackPower() { return attackPower; }
    public void setAttackPower(int attackPower) { this.attackPower = attackPower; }

    public int getDefensePower() { return defensePower; }
    public void setDefensePower(int defensePower) { this.defensePower = defensePower; }

    public int getSpeed() { return speed; }
    public void setSpeed(int speed) { this.speed = speed; }

    public MonsterPower getSpecialPower() { return specialPower; }
    public void setSpecialPower(MonsterPower specialPower) { this.specialPower = specialPower; }
}

