public class Date{
    private int jour; 
    private int mois;
    private int annee;

    public Date(int jour, int mois, int annee){
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }

    public String toString(){
        return "Date : " + jour + "-" + mois + "-" + annee;
    }
    
}