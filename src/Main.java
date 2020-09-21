public class Main {

    public static void main(String[] args) {

       /* Hero hero = new Hero();
        hero.setHeroesHealth(300);
        hero.setHeroesDamage(50);
        hero.setSuperAbility("superKick");
        System.out.println("Damage = " + hero.getHeroesDamage() +
                " " + "Health = " + hero.getHeroesHealth() +
                " " + hero.getSuperAbility() );

        */


     //   Hero hero1 = new Hero(50.0, 300);

        Boss boss = new Boss();
        boss.setSaveType("Claws");
        boss.setBossDamage(40);
        boss.setBossHeath(350);
        System.out.println("Damage = " + boss.getBossDamage()+ "," +
                " Health lvl = " + boss.getBossHeath()+ "," +
                " Uses - " + boss.getSaveType());

        Boss boss1 = new Boss(350,40, "claws");

        Hero[] heroes = createHeroes();
        for (Hero hero: heroes) {
            System.out.println("Heroes health: " + hero.getHeroesHealth() +
                    " Heroes Damage " + hero.getHeroesDamage() +
            " Heroes Ability " + hero.getSuperAbility());

        }
         //   System.out.println("information"+  );

        }


    public static Hero[] createHeroes(){
        Hero spider = new Hero(30,130, "walkByWall");
        Hero iron = new Hero(40, 135, "ironBody");
        Hero wonder = new Hero(15, 100);

        Hero[] heroes = {spider, iron, wonder};
        return heroes;
    }


    }



