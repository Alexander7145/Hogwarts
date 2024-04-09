public class GriffindorStudent extends HogwartsStudent {

    private int nobility;
    private int honor;
    private int courage;


    public GriffindorStudent(String name, int powerOfMagic, int transgressionDistance, int nobility, int honor, int courage) {
        super(powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }

    private int calculateSumAttributes() {
        return nobility + honor + courage;

    }

    public void compareGriffindorStudent(GriffindorStudent griffindorStudent) {
        if (this.calculateSumAttributes() > griffindorStudent.calculateSumAttributes()) {
            System.out.println(" Студент имеет большую мощность магии чем другой ");
        } else if (this.calculateSumAttributes() < griffindorStudent.calculateSumAttributes()) {
            System.out.println(" Студент имеет  меньшую мощность магии чем другой ");
        } else {
            System.out.println(" Студенты хогвартса равны ");
        }
    }

    }

