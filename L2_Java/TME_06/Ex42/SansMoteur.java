public class SansMoteur extends Vehicule{

    public SansMoteur(String marque){
        super(marque);
    }

    public String toString(){
        return "Sans moteur : " + super.toString();
    }
    
}