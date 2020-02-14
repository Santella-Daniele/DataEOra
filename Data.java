class Data{
private int giorno;
private int mese;
private int anno;

public Data(int Giorno,int Mese,int Anno){
    this.giorno=Giorno;
    this.mese=Mese;
    this.anno=Anno;

}

public void incrementaGiorno(int giorni){

int a,b,g;
a=30;
b=1;
g=this.giorno+giorni;

do{
    if(g<a){
    this.giorno=this.giorno+giorni;
    }else{
        if(g>=365){
            this.anno=this.anno+b;
           g=this.giorno-365;
          this.giorno=this.giorno+(giorni-365);
        }
        
    }
    if(g>=a){
            this.mese=this.mese+b;
            this.giorno=this.giorno+(giorni-a);

        }
        
    b++;
   g=this.giorno-a;
    }while(g==0&&g<0);
}

public void stampaData(){
 System.out.printf("%d/%d/%d",this.giorno,this.mese,this.anno);
}
}