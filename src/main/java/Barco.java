public class Barco {

    //Matricula del barco
    private String matricula;
    //Longitud del barco
    private int eslora;
    //Año en el que el barco fue fabricado
    private int anoFabric;

    /**
     * Constructor de la clase Barco que pide que introduccas
     * la matricula, la eslora y el año de facricación.
     * @param matricula
     * @param eslora
     * @param anoFabric
     */
    public Barco(String matricula, int eslora, int anoFabric) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anoFabric = anoFabric;
    }

    /**
     * Metodo que devuelve una cadena de texto con
     * la matricula del barco.
     * @return
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Metodo que devuelve un numero entero con
     * la longitud del abrco.
     * @return
     */
    public int getEslora() {
        return eslora;
    }

    /**
     * Metodo que devuelve un numero entero con
     * el año de fabricación del barco.
     * @return
     */
    public int getAnoFabric() {
        return anoFabric;
    }

    @Override
    public String toString() {
        return  "matricula=" + matricula + "\n" +
                ", eslora=" + eslora +
                ", anoFabric=" + anoFabric;
    }

    /**
     * Metodo que devuelve un número entero con
     * el resultado de la suma del número de camarotes y
     * el de la potencia.
     * @return
     */
    public int calcularBernua() {
        return 1;
    }
}
