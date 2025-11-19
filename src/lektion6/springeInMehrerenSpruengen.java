package lektion6;

public class springeInMehrerenSpruengen {
    public static int springeInMehrerenSpruengen(int distanz,int schritt1, int schritt2){
        int zweitedistanz = distanz;

        if(distanz==0)
            return 1;
        else if(distanz>1)
        distanz=distanz-schritt1;
        zweitedistanz = distanz-schritt2;
        return springeInMehrerenSpruengen(distanz,schritt1,schritt2) + springeInMehrerenSpruengen(zweitedistanz,schritt1,schritt2);
    }

    public static void main(String[] args) {
        System.out.println(springeInMehrerenSpruengen(4,2,1));
    }
}