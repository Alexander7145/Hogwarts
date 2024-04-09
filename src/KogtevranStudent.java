public class KogtevranStudent extends HogwartsStudent{



    private int clever;
    private int witty;
    private int creative;


    public KogtevranStudent(String name, int powerOfMagic, int transgressionDistance, int clever, int witty, int creative) {
        super(powerOfMagic, transgressionDistance);
        this.clever = clever;
        this.creative = creative;
        this. witty = witty;
    }

    public int getClever() {
        return clever;
    }


    public int getWitty() {
        return witty;
    }
    public int getCreative(){
        return creative;
    }

    private int calculateSumAttributes() {
        return clever + witty + creative;

    }

    public void compareKogtevranStudent(KogtevranStudent kogtevranStudent) {
        if (this.calculateSumAttributes() > kogtevranStudent.calculateSumAttributes()) {
            System.out.println(" 1 студент имеет большую мощность магии чем студент 2 ");
        } else if (this.calculateSumAttributes() < kogtevranStudent.calculateSumAttributes()) {
            System.out.println(" 1 студент имеет меньшую мощность магии чем студент 2 ");
        } else {
            System.out.println(" Студенты когтевран равны ");
        }
    }
}