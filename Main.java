import java.util.Scanner;
class Main{
    public static void main(String[] args){
       
        
        Scanner tastiera=new Scanner(System.in);
        System.out.printf("Inserire la data:Giorno/Mese/Anno\n");
        System.out.printf("Inserire il Giorno\n");
        int Giorno=tastiera.nextInt();
        System.out.printf("Inserire il Mese\n");
        int Mese=tastiera.nextInt();
        System.out.printf("Inserire l'anno\n");
        int Anno=tastiera.nextInt();
        DataEOra B=new DataEOra(Giorno,Mese,Anno);

        System.out.printf("Inserire i giorni da incrementare\n");
        int giorni=tastiera.nextInt();
       
        Scanner t=new Scanner(System.in);
        System.out.printf("Inserire l'orario(Ora Minuti Secondi)\n");
        String orario=t.nextLine();


        B.cambiaOra(orario);
        

        B.incrementaGiorno(giorni);

        
        B.stampaData();

        



    }
}