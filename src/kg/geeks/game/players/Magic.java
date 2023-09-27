package kg.geeks.game.players;

public class Magic extends Hero {
    private int increasePower;
    public Magic(int health, int damage, int increaseAttack, String name) {
        super(health, damage, SuperAbility.BOOST, name);
        this.increasePower = increasePower;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (Hero hero : heroes) {
            if (hero.getHealth() > 0 && this !=hero) {
                hero.setDamage(hero.getDamage() + increasePower);
            }
        }

    }
}
