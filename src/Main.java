/** Project: Lab2 Monsters
 * Purpose Details: Monsters Main
 * Course: IST242
 * Author: Ziyan Zheng
 * Date Developed: 02/04/26
 * Last Date Changed: 02/08/26
 * Rev: 1.0
 */

public class Main {
    public static void main(String[] args) {
        Monsters m1 = new Vampire("Blade", 10, 200, 50, 30, 25, MonsterPower.TELEPORTATION, 9, 10);
        Monsters m2 = new Werewolf("Max", 8, 180, 60, 40, 65, MonsterPower.SUPER_STRENGTH, 1, 8);
        Monsters m3 = new Ghost("Ella", 6, 150, 40, 25, 85, MonsterPower.INVISIBILITY, 1, 30);
        Monsters m4 = new Vampire("Leo", 9, 190, 45, 35, 30, MonsterPower.FIRE_BREATH, 8, 9);
        Monsters m5 = new Ghost("Mia", 3, 120, 35, 20, 90, MonsterPower.POISON_BREATH, 0, 20);

        m1.setSpecialPower(MonsterPower.MIND_CONTROL);
        m2.setSpecialPower(MonsterPower.FIRE_BREATH);
        m3.setSpecialPower(MonsterPower.POISON_BREATH);
        m4.setSpecialPower(MonsterPower.SHADOW_DISAPPEAR);
        m5.setSpecialPower(MonsterPower.TELEPORTATION);

        Monsters[] monsters = {m1, m2, m3, m4, m5};

        System.out.println("MONSTERS");
        for (int i = 1; i <= 5; i = i + 1) {
            Monsters m = monsters[i - 1];
            System.out.println("MONSTER " + i);
            System.out.println("Type: " + m.getClass().getSimpleName());
            System.out.println("Name: " + m.getName());
            System.out.println("Level: " + m.getLevel() + " Health: " + m.getHealth());
            System.out.println("Attack: " + m.getAttackPower() + " Defense: " + m.getDefensePower() + " Speed: " + m.getSpeed());
            System.out.println("Special Power: " + m.getSpecialPower());
            System.out.println(m.getSubclassInfo());
        }

        System.out.println(" The monsters uses their special power: ");
        for (Monsters m : monsters) {
            m.specialPowers();
        }
    }
}