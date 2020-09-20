public class Boss {
    private int bossHeath = 350;
    private String saveType = "Claws";
    private double bossDamage = 40;

    public Boss(){}

    public Boss(int bossHeath, double bossDamage, String
            saveType) {
        this.bossDamage = bossDamage;
        this.bossHeath = bossHeath;
        this.saveType = saveType;
    }

    public int getBossHeath() {
        return bossHeath;
    }

    public void setBossHeath(int bossHeath) {
        this.bossHeath = bossHeath;
    }

    public String getSaveType() {
        return saveType;
    }

    public void setSaveType(String saveType) {
        this.saveType = saveType;
    }

    public double getBossDamage() {
        return bossDamage;
    }

    public void setBossDamage(double bossDamage) {
        this.bossDamage = bossDamage;
    }
}
