package ciklusokhasznalata_20211021;

public class CiklusokHasznalata2_20211021 {
    
    public static void main(String[] args) {
        int i, db;
        boolean jegy, paratlan;

        // Első öt pozitív szám: 2 4 6 8 10
        i = 2;
        while (i <= 10) {
            System.out.println(i + " ");
            i = i + 2;
        }
        
        System.out.println("");
        
        // Az első öt páratlan szám 21-től: 21 23 25 27 29
        i = 21;
        while (i <= 29) {
            System.out.println(i + " ");
            i = i + 2;
        }
        
        // Nem kel ismerni az utolsó értéket
        i = 21;
        db = 0;
        while (db < 5) {
            System.out.println(i + " ");
        }
        
        // Kétjegyű páratlan számok
        i = 0;
        while (i < 100) {
            jegy = i > 9 && i < 100;
            paratlan = i % 2 == 1;
            if (jegy && paratlan) System.out.println(i + " ");
        }
        i++;
        
        System.out.println("");
        
        System.out.println("Néhány szám \",\" karakterrel elválasztva:");
        // 1. opció
        i = 7;
        System.out.print(i = i + 3);
        while (i < 23) {
            i = i + 3;
            System.out.print(", " + i);
        }
        System.out.println("");
        // 2. opció
        i = 7;
        while (i < 23) {
            System.out.print(i);
            if (i < 20) System.out.print(", ");
            i += 3;
        }
        
        // Három jegyű páros számok, tíz darab legyen egy sorban, legyenek vesszővel elválasztva
        i = 100;
        db = 0;
        while (i < 999) {
            System.out.print(i);
            i = i + 2;
            db = db + 1;
            if (db < 10) System.out.print(", ");
            if (db == 10) {
                System.out.println("");
                db = 0;
            }
        }
        
        System.out.println("");
    }
}
