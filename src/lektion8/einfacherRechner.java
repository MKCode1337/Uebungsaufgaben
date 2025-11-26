package lektion8;

public class einfacherRechner {
    public static void main(String[] args) {
        int ergebnis = Integer.valueOf(args[0]);
        switch (args[args.length-1]) {
                case "+":
                    for (int i = 0; i < args.length-2; i++) {
                        int summand = Integer.valueOf(args[i+1]);
                        ergebnis = ergebnis + summand;
                    }
                    break;
                case "-":
                    for (int i = 0; i < args.length-2; i++) {
                        int substrat = Integer.valueOf(args[i+1]);
                        ergebnis -= substrat;
                        }
                    break;
                default:
                    System.out.println("Fehlerhafte Eingabe!");
                    System.exit(0);
            }
            System.out.println("Das Ergebnis ist: "+ergebnis);
            System.exit(0);
        }
    }
