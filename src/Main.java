/** Project: Lab2 Monsters
 * Purpose Details: the monster project
 * Course: IST242
 * Author: Ziyan Zheng
 * Date Developed: 02/04/26
 * Last Date Changed: 02/05/26
 * Rev: 1.0
 */


public class Main {
    public static void main(String[] args) {
        Monster m1 = new Vampire("Blade", 10, 200, 50, MonsterPower.TELEPORTATION);
        Monster m2 = new Werewolf("Max", 8, 180, 60, MonsterPower.SUPER_STRENGTH);
        Monster m3 = new Ghost("Ella", 7, 150, 40, MonsterPower.INVISIBILITY);
        Monster m4 = new Vampire("Leo", 9, 190, 45, MonsterPower.FIRE_BREATH);
        Monster m5 = new Ghost("Mia", 3, 120, 35, MonsterPower.POISON_BREATH);

        Monster[] monsters = {m1, m2, m3, m4, m5};

        monsters[0].setSpecialPower(MonsterPower.MIND_CONTROL);
        monsters[1].setSpecialPower(MonsterPower.FIRE_BREATH);
        monsters[2].setSpecialPower(MonsterPower.POISON_BREATH);
        monsters[3].setSpecialPower(MonsterPower.SHADOW_DISAPPEAR);
        monsters[4].setSpecialPower(MonsterPower.TELEPORTATION);

        System.out.println(" All Monsters ");
        for (Monster m : monsters) {
            System.out.println(
                    "Type: " + m.getClass().getSimpleName() +
                            "  Name: " + m.getName() +
                            "  Level: " + m.getLevel() +
                            "  Health: " + m.getHealth() +
                            "  Attack: " + m.getAttackPower() +
                            "  Power: " + m.getSpecialPower()
            );
            m.specialPowers();
        }
    }
}
