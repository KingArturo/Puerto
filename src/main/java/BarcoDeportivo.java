public class BarcoDeportivo extends Barco {

    private int potencia;

    public BarcoDeportivo(String matricula, double eslora, int anoFabric, Cliente propietario, int potencia) {
        super(matricula, eslora, anoFabric, propietario);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    @Override
    public String toString() {
        String aDevolver = "";
        aDevolver += "Barco Deportivo ";
        aDevolver += super.toString();
        aDevolver += " potencia " + potencia;
        return aDevolver;
    }

    /**
     * Metodo que devuelve un número entero con
     * el resultado de la suma del número de camarotes y
     * el de la potencia.
     * @return
     */
    public int calcularBernua() {
        return potencia;
    }
}

