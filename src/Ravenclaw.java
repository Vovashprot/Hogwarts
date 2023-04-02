public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int smartness;

    public Ravenclaw(String name, int magicPower, int apparitionPower, int intelligence, int wisdom, int smartness) {
        super(name, magicPower, apparitionPower);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.smartness = smartness;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getSmartness() {
        return smartness;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setSmartness(int smartness) {
        this.smartness = smartness;
    }
}
