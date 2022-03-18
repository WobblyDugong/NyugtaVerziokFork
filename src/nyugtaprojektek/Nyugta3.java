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
    
    public static void main(String[] args) {
        
        final String HUF = "Ft";
        int[] tetel = {350,90,1320};
        String szaggatottVonal = "--------------------";
        String duplaVonal = "====================";
        
        csillagok("%14s\n","Nyugta 3");
        
        tetelek(tetel[0],tetel[1],tetel[2],HUF);

        System.out.println(duplaVonal);
        
        int osszesen = tetel[0] + tetel[1] + tetel[2];
        kiiras("Összesen",osszesen,HUF);
        
        System.out.println(szaggatottVonal);
        
        int szervizDijMertek = 10;
        int szervizDij = osszesen / szervizDijMertek;
        kiiras("Szervízdíj",szervizDij,HUF);
        System.out.printf("(%d%%)\n", szervizDijMertek);
        
        System.out.println(duplaVonal);
        
        int fizetendo = osszesen + szervizDij;
        kiiras("Fizetendő",fizetendo,HUF);
        
        double euro = fizetendo / 373.0;
        final String eur = "\u20ac";

        System.out.printf("%10s%7.2f %s\n","", euro, eur);//
        
        System.out.println(szaggatottVonal);
        
        System.out.println("");
        String rovidVonal = "_______";
        System.out.print(rovidVonal);
        String rovidVonalValaszto = "      ";
        System.out.print(rovidVonalValaszto);
        System.out.println(rovidVonal);
        System.out.print(" Dátum");
        System.out.print(rovidVonalValaszto);
        System.out.println("   Név");
        
        csillagok("%11s\n","CÉG");
        
    }

}
