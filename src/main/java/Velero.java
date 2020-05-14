public class Velero extends Barco {

    private int numMastiles;

    public Velero(String matricula, int eslora, int anoFabric, int numMastiles) {
        super(matricula, eslora, anoFabric);
        this.numMastiles = numMastiles;
    }

    public int getNumMastiles() {
        return numMastiles;
    }

    @Override
    public String toString() {
        String aDevolver = "";
        aDevolver += "Velero ";
        aDevolver += super.toString();
        aDevolver += " número de Mastiles " + numMastiles;
        return aDevolver;
    }
}
