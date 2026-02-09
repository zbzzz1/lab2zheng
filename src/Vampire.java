/** Project: Lab2 Monsters
 * Purpose Details: Vampire is the monster
 * Course: IST242
 * Author: Ziyan Zheng
 * Date Developed: 02/04/26
 * Last Date Changed: 02/08/26
 * Rev: 1.0
 */

public final class Vampire extends Monsters {
    private int sunVulnerability;
    private int bloodLust;

    public Vampire(String name, int level, int health, int attackPower, int defensePower, int speed, MonsterPower specialPower, int sunVulnerability, int bloodLust) {
        super(name, level, health, attackPower, defensePower, speed, specialPower);
        this.sunVulnerability = sunVulnerability;
        this.bloodLust = bloodLust;
    }

    public void specialPowers() {
        System.out.println("Vampire " + getName() + " uses " + getSpecialPower() );
    }

    public String getSubclassInfo() {
        return "Vampire's Characteristics: Sun Vulnerability = " + getSunVulnerability() + " Blood Lust = " + getBloodLust();
    }

    public int getSunVulnerability() { return sunVulnerability; }
    public void setSunVulnerability(int sunVulnerability) { this.sunVulnerability = sunVulnerability; }

    public int getBloodLust() { return bloodLust; }
    public void setBloodLust(int bloodLust) { this.bloodLust = bloodLust; }
}


