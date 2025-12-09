package lektion10;

public class Student {
    private String name;
    private int matrikelNr;

    public Student(String name, int matrikelNr) {
        this.name = name;
        this.matrikelNr = matrikelNr;
    }

    public String getName() {
        return name;
    }

    public int getMatrikelNr() {
        return matrikelNr;
    }
}
