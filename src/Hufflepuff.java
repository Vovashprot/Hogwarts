public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int honesty;
    private int loyalty;

    public Hufflepuff(String name, int magicPower, int apparitionPower, int industriousness, int honesty, int loyalty){
        super(name, magicPower, apparitionPower);
        this.industriousness = industriousness;
        this.honesty = honesty;
        this.loyalty = loyalty;
    }
    public void hufflepuffComparison(Hufflepuff studentTwo){
        if (this.honesty + this.loyalty + this.industriousness > studentTwo.honesty + studentTwo.loyalty + studentTwo.industriousness)
        {
            System.out.println(this.getName() + " - самый сильный ученик");
         }
        else if (this.honesty + this.loyalty + this.industriousness < studentTwo.honesty + studentTwo.loyalty + studentTwo.industriousness)
        {
            System.out.println(studentTwo.getName() + " - самый сильный ученик");
        }
        else {System.out.println("Студенты равны");}
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getHonesty() {
        return honesty;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setBravery(int industriousness) {
        this.industriousness = industriousness;
    }

    public void setHonor(int honesty) {
        this.honesty = honesty;
    }

    public void setGenerosity(int loyalty) {
        this.loyalty = loyalty;
    }
}