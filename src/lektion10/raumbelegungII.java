package lektion10;

import lektion9.Raum;

public class raumbelegungII {
    public static void main(String[] args) {
        Student s1 = new Student("Max", 10005412);
        Student s2 = new Student("Peter", 10003498);
        Student s3 = new Student("Laura", 10003254);
        Student s4 = new Student("Vanessa", 10006644);

        Raum[] raeume =  new Raum[2];
        raeume[0] = new Raum("I.2.1", 30);
        raeume[1] = new Raum("I.2.15", 25);

        raeume[0].betreteRaum(s1);
        raeume[1].betreteRaum(s2);
        raeume[0].betreteRaum(s3);
        raeume[0].betreteRaum(s4);

        for (Raum r : raeume) {
            r.printStudentenImRaum();
        }
        raeume[0].verlasseRaum(s1);
        raeume[1].verlasseRaum(s2);
        raeume[0].verlasseRaum(s3);
        raeume[1].verlasseRaum(s4);

        for (Raum r : raeume) {
            r.printStudentenImRaum();
        }
    }
}
