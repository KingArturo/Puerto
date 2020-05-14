public class BarcoDeportivo extends Barco {

    private int potencia;

    public BarcoDeportivo(String matricula, int eslora, int anoFabric, int potencia) {
        super(matricula, eslora, anoFabric);
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
}

