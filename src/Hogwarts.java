public class Hogwarts {
    private String name;
    private int magicPower;
    private int apparitionPower;

    public Hogwarts(String name, int magicPower, int apparitionPower) {
        this.name = name;
        this.magicPower = magicPower;
        this.apparitionPower = apparitionPower;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getApparitionPower() {
        return apparitionPower;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public void setApparitionPower(int apparitionPower) {
        this.apparitionPower = apparitionPower;
    }
}