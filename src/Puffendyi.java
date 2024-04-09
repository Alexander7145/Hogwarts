public class Puffendyi extends HogwartsStudent{



    private int diligent;
    private int fidelity;
    private int honesty;


    public Puffendyi(String name, int powerOfMagic, int transgressionDistance, int diligent, int fidelity, int honesty) {
        super(powerOfMagic, transgressionDistance);
        this.diligent = diligent;
        this.fidelity = fidelity;
        this.honesty = honesty;
    }

    public int getDiligent() {
        return diligent;
    }

    public int getFidelity() {
        return fidelity;
    }

    public int getHonesty() {
        return honesty;
    }

    private int calculateSumAttributes() {
        return diligent + fidelity + honesty;

    }

    public void comparePuffendyi(Puffendyi puffendyi) {
        if (this.calculateSumAttributes() > puffendyi.calculateSumAttributes()) {
            System.out.println(" 1 Студент имеет большую мощность магии чем другой ");
        } else if (this.calculateSumAttributes() < puffendyi.calculateSumAttributes()) {
            System.out.println(" 1 Студент имеет  меньшую мощность магии чем другой  ");
        } else {
            System.out.println(" Студенты пуффедуй равны ");
        }
    }
}