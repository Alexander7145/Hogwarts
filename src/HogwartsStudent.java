abstract public class HogwartsStudent {

    private String name;
    private final int powerOfMagic;

    private final int transgressionDistance;

    public HogwartsStudent(int powerOfMagic, int transgressionDistance) {
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;

    }

    public String getName() {
        return name;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getTransgressiomDistance() {
        return transgressionDistance;
    }

    public int calculateBasicAttributesSum() {
        return powerOfMagic + transgressionDistance;
    }

    public void compareByBasicAttributes(HogwartsStudent hogwartsStudent) {
        if (this.calculateBasicAttributesSum() > hogwartsStudent.calculateBasicAttributesSum()) {
            System.out.println(" 1 Студент имеет большую мощность магии, чем 2 студент  ");
        } else if (this.calculateBasicAttributesSum() < hogwartsStudent.calculateBasicAttributesSum()) {
            System.out.println(" 1 Студент имеет меньшую мощность магии, чем 2 студент ");
        } else {
            System.out.println(" Студенты хогвартса равны ");

        }
    }




    }
