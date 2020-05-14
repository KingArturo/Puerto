public class Yate extends BarcoDeportivo {

    //Guarda el numero de camarotes del yate
    private int numCamarotes;

    /**
     * Constructor de la clase BarcoDeportivo
     * @param matricula
     * @param eslora
     * @param anoFabric
     * @param potencia
     * @param numCamarotes
     */
    public Yate(String matricula, double eslora, int anoFabric, Cliente propietario, int potencia, int numCamarotes) {
        super(matricula, eslora, anoFabric, propietario, potencia);
        this.numCamarotes = numCamarotes;
    }

    /**
     * Devuelve un número entero con el
     * número de camarotes del yate.
     * @return
     */
    public int getNumCamarotes() {
        return numCamarotes;
    }

    /**
     * Metodo que devuelve un número entero con
     * el resultado de la suma del número de camarotes y
     * el de la potencia.
     * @return
     */
    public int calcularBernua() {
        return (numCamarotes+super.getPotencia());
    }

    @Override
    public String toString() {
        String aDevolver = "";
        aDevolver += "Yate ";
        aDevolver += super.toString();
        aDevolver += " numero de camarotes " + numCamarotes;
        return aDevolver;
    }
}
