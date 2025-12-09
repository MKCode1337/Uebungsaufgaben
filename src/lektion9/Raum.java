package lektion9;

import lektion10.Student;

public class Raum {
    private String kennung;
    private int kapazitaet;
    private boolean belegt;
    private Student[] student;

    public Raum(String kennung, int kapazitaet) {
            this.kennung = kennung;
            this.kapazitaet = kapazitaet;
            this.belegt = false;
            this.student = new Student[kapazitaet];
    }

    public void printStudentenImRaum() {
        for (int i = 0; i < this.student.length; i++) {
            if (this.student[i] != null) {
                System.out.println("Raum " + getKennung() + " mit Student " + this.student[i].getName() + " belegt. MatrikelNr.: " + this.student[i].getMatrikelNr());
            }
        }
        if (!this.isBelegt()) {
            System.out.println("Raum "+this.getKennung()+" ist leer.");
        }
    }

    public void verlasseRaum(Student student) {
        for (int i = 0; i < this.student.length; i++) {
            if (this.student[i] != null) {
                if (student.getName().equals(this.student[i].getName())) {
                    this.student[i] = null;
                }
            }
        }
        // prüfen ob Raum leer
        for (Student s : this.student) {
            if (s != null) {
                this.setBelegung(true);
            }
            else if (s == null) {
                this.setBelegung(false);
            }
        }
    }

    public void betreteRaum(Student student) {
        int indexFreierPlatz = 0;
        for (int i = 0; i < this.student.length; i++) {
            if (this.student[i] == null) {
                indexFreierPlatz = i;
                this.setBelegung(true);
                break;
            }
        }
        this.student[indexFreierPlatz] = student;
    }

    public String getKennung() {
        return kennung;
    }
    public int getKapazitaet() {
        return kapazitaet;
    }
    public void setBelegung(boolean belegt) {
        this.belegt = belegt;
    }
    public boolean isBelegt() {
        return this.belegt;
    }
}