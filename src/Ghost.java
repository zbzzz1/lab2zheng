/** Project: Lab2 Monsters
 * Purpose Details: Ghost is the monster
 * Course: IST242
 * Author: Ziyan Zheng
 * Date Developed: 02/04/26
 * Last Date Changed: 02/08/26
 * Rev: 1.0
 */

public final class Ghost extends Monsters {
    private int untouchable;
    private int hauntRange;

    public Ghost(String name, int level, int health, int attackPower, int defensePower, int speed, MonsterPower specialPower, int untouchable, int hauntRange) {
        super(name, level, health, attackPower, defensePower, speed, specialPower);
        this.untouchable = untouchable;
        this.hauntRange = hauntRange;
    }

    public void specialPowers() {
        System.out.println("Ghost " + getName() + " uses " + getSpecialPower() );
    }

    public String getSubclassInfo() {
        String untouchableStatus = (untouchable == 1) ? "Yes" : "No";
        return "Ghost Characteristics: Haunt Range = " + getHauntRange() + " Untouchable = " + untouchableStatus;
    }

    public int getUntouchable() { return untouchable; }
    public void setUntouchable(int untouchable) { this.untouchable = untouchable; }

    public int getHauntRange() { return hauntRange; }
    public void setHauntRange(int hauntRange) { this.hauntRange = hauntRange; }
}

