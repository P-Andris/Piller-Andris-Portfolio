package nyugtaprojekt3;

public class NyugtaProjekt3 {

    public static void main(String[] args) {
        String csillagok = "*******************";
        System.out.println(csillagok);
        System.out.printf("%13s\n", "Nyugta 2");
        System.out.println(csillagok);
        
        String huf = "Ft";
        int tetel1 = 350, tetel2 = 90, tetel3 = 1320;
        System.out.printf("Tétel 1:%4s %d %s\n", "", tetel1, huf);
        System.out.printf("Tétel 1:%5s %d %s\n", "", tetel2, huf);
        System.out.printf("Tétel 3:%3s %d %s\n", "", tetel3, huf);

        String duplaVonal = "===================";
        System.out.println(duplaVonal);
        
        int osszesen = tetel1 + tetel2 + tetel3;
        System.out.printf("Összesen:%2s %d %s\n", "", osszesen, huf);
        
        String szaggatottVonal = "-------------------";
        System.out.println(szaggatottVonal);
        
        int kedvMertek = 10;
        int kedvezmeny = osszesen / kedvMertek;
        System.out.printf("Kedvezmény:%1s %d %s\n", "", kedvezmeny, huf);
        System.out.printf("(%d%%)\n", kedvMertek);
        
        System.out.println(duplaVonal);
        
        int fizetendo = osszesen - kedvezmeny;
        System.out.printf("Fizetendő:  %d %s\n", fizetendo, huf);
        double euro = fizetendo / 350.0;
        huf = "\u20ac"; //EZ NEM JÓ!!!!
        System.out.printf("%8s %f %s\n", "", euro, huf);
        
        System.out.println(szaggatottVonal);
        
        System.out.println("");
        
        String rovidVonal = "_______";
        System.out.print(rovidVonal);
        String rovidVonalValaszto = "%4s";
        System.out.print(rovidVonalValaszto);
        System.out.println(rovidVonal);
        
        System.out.printf("%3s", "Dátum");
        System.out.print(rovidVonalValaszto);
        
        System.out.printf("%10s", "Név");
        
        System.out.println(csillagok);
        
        System.out.printf("%10s", "CÉG");
        System.out.println(csillagok);
    }
    
}
