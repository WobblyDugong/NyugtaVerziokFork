package nyugtaprojektek;
/* Probléma:
tüntessük el a kézzel beírt szóközöket,
a huf ne tartalmazzon eurót
a kedvezmény helyett legyen szervízdíj, amit hozzá kell adni a végössdzeghez
*/
public class Nyugta3 {
    
    private static void kiiras(String mi,int szam,String HUF){
        System.out.printf("%10s: %5d %s\n", mi, szam, HUF);
    }
    
    private static void tetelek(int tetel1, int tetel2, int tetel3, String HUF) {
        kiiras("Tétel 1",tetel1,HUF);
        kiiras("Tétel 2",tetel2,HUF);
        kiiras("Tétel 3",tetel3,HUF);
    }
    
    private static void csillagok(String helyezkedes,String csillagkoz) {
        String csillagok = "********************";
        System.out.println(csillagok);
        System.out.printf(helyezkedes, csillagkoz);
        System.out.println(csillagok);
    }
    
    private static int osszegzes(int[] tetel,String HUF){
        int osszeg = 0;
        for (int i = 0; i < tetel.length; i++) {
            osszeg=osszeg+tetel[i];
        }
        kiiras("Összesen",osszeg,HUF);
        return osszeg;
    }
    
    private static int szervizdijSzamolas(int osszesen, String HUF) {
        int szervizDijMertek = 10;
        int szervizDij = osszesen / szervizDijMertek;
        kiiras("Szervízdíj",szervizDij,HUF);
        System.out.printf("(%d%%)\n", szervizDijMertek);
        return szervizDij;
    }
    
    private static void rovidVonal(){
        String rovidVonal = "_______";
        System.out.print(rovidVonal);
    }
    private static void vonalValaszto(){
        String rovidVonalValaszto = "      ";
        System.out.print(rovidVonalValaszto);
    }
    private static void ujsor(){
        System.out.println("");
    }
    private static void nyugtaVeg(){
        ujsor();
        rovidVonal();
        vonalValaszto();
        rovidVonal();
        ujsor();
        System.out.print(" Dátum");
        vonalValaszto();
        System.out.println("   Név");
    }
    
    public static void main(String[] args) {
        /*visszatérő változók*/
        final String HUF = "Ft";
        int[] tetel = {350,90,1320};
        String szaggatottVonal = "--------------------";
        String duplaVonal = "====================";
        
        /*kezdő csillagsorok*/
        csillagok("%14s\n","Nyugta 3");
        
        /*alap tételek*/
        tetelek(tetel[0],tetel[1],tetel[2],HUF);
        System.out.println(duplaVonal);
        
        /*összegzés*/
        int osszesen = osszegzes(tetel,HUF);
        System.out.println(szaggatottVonal);
        
        /*szervizdij*/
        int szervizDij = szervizdijSzamolas(osszesen,HUF);
        System.out.println(duplaVonal);
        
        /*fizetendő*/
        int fizetendo = osszesen + szervizDij;
        kiiras("Fizetendő",fizetendo,HUF);
        
        /*euróban*/
        double euro = fizetendo / 373.0;
        final String eur = "\u20ac";
        System.out.printf("%10s%7.2f %s\n","", euro, eur);//
        System.out.println(szaggatottVonal);
        
        /*Aláírás*/
        nyugtaVeg();
        
        /*záró csillagsorok*/
        csillagok("%11s\n","CÉG");
        
    }
}
