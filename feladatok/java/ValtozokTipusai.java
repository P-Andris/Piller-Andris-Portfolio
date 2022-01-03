package valtozoktipusai;

public class ValtozokTipusai {

    public static void main(String[] args) {
        System.out.println("Szia Péter!");
        System.out.println("Szia " + "Péter" + "!");
        
        /* SZÖVEG */
        String nev = "Péter";
        System.out.println("Szia " + nev + "!");
        String egyBetu = "a";
        egyBetu = "xyz";//nemszerencsés elnevezés!!!
        String ures   = "";
        String szokoz = " ";
        String szamok = "123";
        szamok = "1-2-3-4";
        
        char csakEgyBetu = 'x';
        csakEgyBetu = ' ';//szóköz lehet
        csakEgyBetu = '\n';//ENTER is lehet
        //csakEgyBetu = '';//üres nem lehet
        //csakEgyBetu = 'xyz';//több betű nem lehet
        
        /* SZÁMOK */
        int egesz = 10;
        double pi = 3.14;
    }
    
}
