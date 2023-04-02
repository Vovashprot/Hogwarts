public class Slytherin extends Hogwarts {
    int guile;
    int lustForPower;
    int ambitions;

    public Slytherin(String name, int magicPower, int apparitionPower, int guile, int lustForPower, int ambitions) {
        super(name, magicPower, apparitionPower);
        this.guile = guile;
        this.lustForPower = lustForPower;
        this.ambitions = ambitions;
    }

    public int getGuile() {
        return guile;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public int getAmbitions() {
        return ambitions;
    }

    public void setGuile(int guile) {
        this.guile = guile;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public void setAmbitions(int ambitions) {
        this.ambitions = ambitions;
    }
}
