public class Main {

    public static void main(String[] args) {

        Hero hero = new Hero();
        hero.setHeroesHealth(300);
        hero.setHeroesDamage(50);
        hero.setSuperAbility("superKick");
        System.out.println("Damage = " + hero.getHeroesDamage() +
                " " + "Health = " + hero.getHeroesHealth() +
                " " + hero.getSuperAbility() );


        Hero hero1 = new Hero(50.0, 300);

        Boss boss = new Boss();
        boss.setSaveType("Claws");
        boss.setBossDamage(40);
        boss.setBossHeath(350);
        System.out.println("Damage = " + boss.getBossDamage()+ "," +
                " Healt lvl = " + boss.getBossHeath()+ "," +
                " Uses - " + boss.getSaveType());

        Boss boss1 = new Boss(350,40, "claws");



    }
}
