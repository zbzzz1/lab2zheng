/** Project: Lab2 Monsters
 * Purpose Details: Werewolf is the
 * monster
 * Course: IST242
 * Author: Ziyan Zheng
 * Date Developed: 02/04/26
 * Last Date Changed: 02/08/26
 * Rev: 1.0
 */

public final class Werewolf extends Monsters {
    private int lycanForm;
    private int furThickness;

    public Werewolf(String name, int level, int health, int attackPower, int defensePower, int speed, MonsterPower specialPower, int lycanForm, int furThickness) {
        super(name, level, health, attackPower, defensePower, speed, specialPower);
        this.lycanForm = lycanForm;
        this.furThickness = furThickness;
    }

    public void specialPowers() {
        System.out.println("Werewolf " + getName() + " uses " + getSpecialPower() );
    }
    public String getSubclassInfo() {
        String lycanStatus = (lycanForm == 1 ) ? "Transformed to Wolf Form" : "Stayed in Human Form";
        return "Werewolf Characteristics: Lycanthropy Stage = " + lycanStatus + " Fur Thickness = " + getFurThickness();
    }
    public int getLycanForm() { return lycanForm; }
    public void setLycanForm(int lycanForm) { this.lycanForm = lycanForm; }

    public int getFurThickness() { return furThickness; }
    public void setFurThickness(int furThickness) { this.furThickness = furThickness; }
}