public class Gryffindor extends Hogwarts {
    private int bravery;
    private int honor;
    private int generosity;

public Gryffindor(String name, int magicPower, int apparitionPower, int bravery, int honor, int generosity){
    super(name, magicPower, apparitionPower);
    this.bravery = bravery;
    this.honor = honor;
    this.generosity = generosity;
}

    public int getBravery() {
        return bravery;
    }

    public int getHonor() {
        return honor;
    }

    public int getGenerosity() {
        return generosity;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setGenerosity(int generosity) {
        this.generosity = generosity;
    }
}