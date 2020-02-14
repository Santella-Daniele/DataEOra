class DataEOra extends Data{
   private String orario;


    public DataEOra(int Giorno,int Mese,int Anno){
        super(Giorno, Mese, Anno);
       this.orario="null";
    }

    public void cambiaOra(String orario){
        this.orario=orario;
        
    }

    public void stampaData(){
        super.stampaData();
        System.out.printf("\t%s",this.orario);
    }
}