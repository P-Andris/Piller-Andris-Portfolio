import java.util.*;

public class feladat_v2_20211111 {
    public static void main(String[] args) {
        Random r = new Random(); // Véletlenszám generálás

        Scanner sc = new Scanner(System.in); // Szöveg és/vagy szám bekérése felhasználótól
        
        int kockadobasJatekos_Szerencse, kockadobasJatekos, kockadobasSzorny; // Kockadobások

        int aranyPenz = 0; // Aranypénz; Kezdeti érték: 0
        
        int szerencseJatekos, eleteroJatekos, eleteroSzorny, ugyessegJatekos, ugyessegSzorny, tamadoeroJatekos, tamadoeroSzorny; // Játékos és szörny tulajdonságai
        
        int oldalSzam; // Oldalszám megadása

        int harcbanVan = 0; // Harcol-e a játékos (0 = nincs harc, 1 = van harc)

        System.out.println("Halállabirintus");
        System.out.println("---------------");

        // Játékos adatai:
        eleteroJatekos = 7;
        ugyessegJatekos = 7;
        System.out.print("Mi a neved? ");
        String jatekosNeve = sc.nextLine();
        System.out.printf("A játékos neve: %s", jatekosNeve);
        System.out.printf("\nÉleterő: %d, ügyesség: %d", eleteroJatekos, ugyessegJatekos);

        System.out.println("\n\nElőzmény: Egy versenyre nevezel, aminek a lényege az, hogy át kell kelni a Halállabirintuson. A labirintusban tárgyakat találhatsz és szörnyekkel kell harcoljál.");
        System.out.print("A továbbhaladáshoz lapozz az első oldalra: ");

        do {
            oldalSzam = sc.nextInt();
            switch(oldalSzam) {
                case 1:
                    System.out.print("\nMiután öt percet haladtál lassan az alagútban, egy kőasztalhoz érsz, amely a bal oldali fal mellett áll. Hat doboz van rajta, egyikükre a te neved festették. Ha kiakarod nyitni a dobozt, lapozz a 270. oldalra. Ha inkább tovább haladsz észak felé, lapozz a 66. oldalra: ");
                    break;
                case 56:
                    System.out.print("\nLátod, hogy az akadály egy széles, barna, sziklaszerű tárgy. Megérinted, és meglepve tapasztalod, hogy lágy, szivacsszerű. Ha át szeretnél mászni rajta, lapozz a 373., ha ketté akarod vágni a kardoddal, lapozz a 215. oldalra: ");
                    break;
                case 66:
                    System.out.print("\nNéhány perc gyaloglás után egy elágazáshoz érsz az alagútban. Egy, a falra festett fehér nyíl nyugatfelé mutat. A földön nedves lábnyomok jelzik, merre haladtak az előtted járók. Nehéz biztosan megmondani, de úgy tűnik, hogy három közülük a nyíl irányába halad, míg egyikük úgy döntött, hogy keletnek megy. Ha nyugat felé kívánsz menni, lapozz a 293., ha keletnek, lapozz a 56. oldalra: ");
                    break;
                case 137:
                    System.out.print("\nAhogy végigmész az alagúton, csodálkozva látod, hogy egy jókora vasharang csüng alá a boltozatról.\nAdj meg egy oldalszámot: ");
                    break;
                case 215:
                    System.out.print("\nKardod könnyedén áthatol a spóragolyó vékonykülső burkán. Sűrű barna spórafelhő csap ki a golyóból, és körülvesz. Némelyik spóra a bőrödhöz tapad, és rettenetes viszketést okoz. Nagy daganatok nőnek az arcodon és karodon, és a bőröd mintha égne. 2 ÉLETERŐ pontot veszítesz. Vadul vakarózva átléped a leeresztett golyót, és keletnek veszed az utad.\nAdj meg egy oldalszámot: ");
                    eleteroJatekos = eleteroJatekos - 2;
                    break;
                case 270:
                    System.out.print("\nA doboz teteje könnyedén nyílik. Benne két aranypénzt találsz, és egy üzenetet, amely egy kis pergamenen neked szól. Előbb zsebre vágod az aranyakat, aztán elolvasod az üzenetet: „Jól tetted. Legalább volt annyi eszed, hogy megállj és elfogadd az ajándékot. Most azt tanácsolom neked, hogy keress és használj különféle tárgyakat, ha sikerrel akarsz áthaladni Halállabirintusomon.” Az aláírás Szukumvit. Megjegyzed a tanácsot, apródarabokra téped a pergament, és tovább mészészak felé. Lapozz a 66. oldalra: ");
                    aranyPenz = aranyPenz + 2;
                    break;
                case 293:
                    System.out.print("\nA három pár nedves lábnyomot követve az alagút nyugati elágazásában hamarosan egy újabb elágazáshoz érsz. Ha továbbmész nyugat felé a lábnyomokat követve, lapozz a 137. oldalra. Ha inkább észak felé mész a harmadik pár lábnyom után, lapozz a 387. oldalra: ");
                    break;
                case 373:
                    System.out.print("\nFelmászol a lágy sziklára, attól tartasz, hogy bármelyik pillanatban elnyelhet. Nehéz átvergődni rajta, mert puha anyagában alig tudod a lábadat emelni, de végül átvergődsz rajta. Megkönnyebbülten érsz újra szilárd talajra, és fordulsz kelet felé.\nAdj meg egy oldalszámot: ");
                    break;
                case 387:
                    System.out.print("\nHallod, hogy elölről súlyos lépések közelednek. Egy széles, állatbőrökbe öltözött, kőbaltás, primitív lény lép elő. Ahogy meglát, morog, a földre köp, majd a kőbaltát felemelve közeledik, és mindennek kinéz, csak barátságosnak nem. Előhúzod kardodat, és felkészülsz, hogy megküzdj a Barlangi Emberrel.");
                    harcbanVan = 1;
                    break;
                default:
                    System.out.print("\nRossz oldalszámot adtál meg!\nKérlek adj meg egy másik oldalszámot: "); // Ha nem a fenti számokból választasz, akkor ezt fogja kiírni
                    break;
            }
        }
        while(harcbanVan == 0);

        // Szörny tulajdonságai:
        ugyessegSzorny = 7; // Ügyesség = 7
        eleteroSzorny = 7; // Életerő = 7

        // Harc:
        /* while(harcbanVan == 1) {
            kockadobasJatekos = r.nextInt(6) + 1;
            kockadobasSzorny = r.nextInt(6) + 1;

            

        } */
        
        System.out.println("\nA játékos jelenlegi adatai:");
        System.out.printf("\nÉleterő: %d, ügyesség: %d, összegyűjtött aranypénz: %d", eleteroJatekos, ugyessegJatekos, aranyPenz);

        System.out.println("\n\nVÉGE!");
    }
}
