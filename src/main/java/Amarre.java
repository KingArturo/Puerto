public class Amarre {

    //Número identificativo del amarre
    private int numAmarre;
    //Cliente que alquila el amarre
    private Cliente client;
    //Barco que esta en el amarre
    private Barco barco;
    //Número de días que se ha alquilado
    private int diasAlquiler;

    /**
     * Contructor de la clase Amarre que pide que
     * introduccas el número que lo identifica.
     * @param numAmarre
     */
    public Amarre(int numAmarre) {
        this.numAmarre = numAmarre;
        client = null;
        barco = null;
        diasAlquiler = 0;
    }

    /**
     * Devuekve un número entero con el numero del amarre
     * @return
     */
    public int getNumAmarre() {
        return numAmarre;
    }

    /**
     * Devuelve el cliente que está alquilando el amarre
     * @return
     */
    public Cliente getClient() {
        return client;
    }

    /**
     * devuelve el barco que esta en el amarre
     * @return
     */
    public Barco getBarco() {
        return barco;
    }

    /**
     * Devuelve el número de días por los que ha
     * sido alquilado el amarre
     * @return
     */
    public int getDiasAlquiler() {
        return diasAlquiler;
    }

    public void addbarco(Barco enbarcacion) {
        barco = enbarcacion;
    }

    public void addCliente(Cliente cliente) {
        client = cliente;
    }

}
