public class Main {
    public static void main(String[] args)
    {
        GriffindorStudent harry = new GriffindorStudent("Harry Potter",20, 20, 7, 20, 25);
        GriffindorStudent germiona = new GriffindorStudent("Germiona Granger", 18, 15, 20,20,20);
        GriffindorStudent wisly = new GriffindorStudent("Ron Wisly", 15, 15, 7, 20, 20);


        harry.compareByBasicAttributes(germiona);

        harry.compareGriffindorStudent(germiona);

        Puffendyi zakharia = new Puffendyi("Zakharia Smit", 20,15,10,15,25);
        Puffendyi cedric = new Puffendyi("Cedric Digory", 20, 25, 23,21,25);
        Puffendyi jastin = new Puffendyi("Jastin Finch", 23, 23, 17,15,23);

        zakharia.comparePuffendyi(jastin);

        KogtevranStudent chang = new KogtevranStudent(" Chjo Chang", 23, 14,11,20,30);
        KogtevranStudent padma = new KogtevranStudent("Padma Patil", 11, 23, 23, 15,23);
        KogtevranStudent marcus = new KogtevranStudent("Marcus Belby", 20,15,17,11,25);

        chang.compareKogtevranStudent(marcus);

        SlizerinStudent draco = new SlizerinStudent("Draco Malfoi",22,17,23,11,15);
        SlizerinStudent graham = new SlizerinStudent("Graham Montegu", 22,15,23,13,33);
        SlizerinStudent gregory = new SlizerinStudent(" Gregory Goil", 22, 15, 24, 22, 30);

        draco.compareSlizerinStudent(graham);
    }
}
