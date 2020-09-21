public class Hero {
    private int heroesHealth;
    private double heroesDamage;
    private String superAbility;

   //public Hero(){}

    public Hero(double heroesDamage, int heroesHealth){
        this.heroesHealth=heroesHealth;
        this.heroesDamage=heroesDamage;
    }

    public Hero(double heroesDamage, int heroesHealth, String superAbility){
        this.heroesHealth=heroesHealth;
        this.heroesDamage=heroesDamage;
        this.superAbility=superAbility;
    }



    public int getHeroesHealth() {
        return heroesHealth;
    }

    public void setHeroesHealth(int heroesHealth) {
        this.heroesHealth = heroesHealth;
    }

    public double getHeroesDamage() {
        return heroesDamage;
    }

    public void setHeroesDamage(double heroesDamage) {
        this.heroesDamage = heroesDamage;
    }

    public String getSuperAbility() {
        return superAbility;
    }

    public void setSuperAbility(String superAbility) {
        this.superAbility = superAbility;
    }
}
