package lektion8.auto;

public class lieblingsauto {
        public static  void main(String args[]) {
        Auto mustang = new Auto("Ford", "Mustang", "Rot", 12000, 300, "Automatik");

        Auto jimny = new Auto("Suzuki", "Jimny", "Grün", 1300, 86, "Schaltgetriebe");

        Auto astra = new Auto("Opel", "Astra", "Weiß", 1600, 125, "Schaltgetriebe");

        int groessterhubraum = Math.max(mustang.hubraum, Math.max(jimny.hubraum, astra.hubraum));

        if (mustang.hubraum == groessterhubraum) {
            System.out.println(mustang);
        }
        else if(astra.hubraum == groessterhubraum) {
            System.out.println(astra);
            }
        else if (jimny.hubraum == groessterhubraum) {
            System.out.println(jimny);
            }
        }
}