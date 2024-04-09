public class SlizerinStudent extends HogwartsStudent{

private int cunning;
private int determination;
private int authority;


public SlizerinStudent(String name, int powerOfMagic, int transgressionDistance, int cunning, int determination, int authority) {
    super(powerOfMagic, transgressionDistance);
    this.cunning = cunning;
    this.determination = determination;
    this. authority = authority;
}

public int getCunning() {
    return cunning;
}

public int getDetermination() {
    return determination;
}

public int getAuthority() {
    return authority;
}
private int calculateSumAttributes(){
    return cunning + determination + authority;






}

public void compareSlizerinStudent(SlizerinStudent slizerinStudent) {
    if (this.calculateSumAttributes() > slizerinStudent.calculateSumAttributes()) {
        System.out.println(" 1 студент имеет большую мощность магии чем студент 2 ");
    } else if (this.calculateSumAttributes() < slizerinStudent.calculateSumAttributes()) {
        System.out.println("1 студент имеет меньшую мощность магии чем студент 2 ");
    } else {
        System.out.println(" Студенты слизерин равны ");
    }
}
}