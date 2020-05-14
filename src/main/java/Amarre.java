public class Amarre {

    //Número identificativo del amarre
    private int numAmarre;
    //Cliente que alquila el amarre
    private Cliente client;
    //Barco que esta en el amarre
    private Barco barco;
    //Número de días que se ha alquilado
    private int diasAlquiler;

    public Amarre(int numAmarre) {
        this.numAmarre = numAmarre;
        client = null;
        barco = null;
        diasAlquiler = 0;
    }

    public int getNumAmarre() {
        return numAmarre;
    }

    public Cliente getClient() {
        return client;
    }

    public Barco getBarco() {
        return barco;
    }

    public int getDiasAlquiler() {
        return diasAlquiler;
    }
    
}
