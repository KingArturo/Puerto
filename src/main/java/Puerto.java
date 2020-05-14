import java.util.ArrayList;
import java.util.Iterator;

public class Puerto {

    //Guarda los amarres que no están alquilados
    private ArrayList<Amarre> amarres;
    //Guarda los amarres que están alquilados
    private ArrayList<Amarre> amerresAlquilados;

    /**
     * Contructor de la clase Puerto que crea
     * los 4 ammarres que tiene el puerto y lo
     * introduce en el ArrayList amarres.
     */
    public Puerto() {
        amarres = new ArrayList<>();
        amerresAlquilados = new ArrayList<>();
        addAmarre(4);
    }

    /**
     * Metodo que añade tantos amarres como número le
     * pasemos por parametro.
     * @param cantidad
     */
    public void addAmarre(int cantidad) {
        int cont = 0;
        int num = amarres.size();
        while(cont < cantidad) {
            Amarre amarre = new Amarre(num);
            amarres.add(amarre);
            num++;
            cont++;
        }
    }

    /**
     * Metodo que alquila el primer amarre libre y devuelve el precio
     * en caso de que no haya ninguno libre devuelve -1
     * @param numDias
     * @param client
     * @param barco
     * @return
     */
    public int alquilarAmarre(int numDias, Cliente client, Barco barco) {
        int precioAlquiler = -1;
        Amarre amarre = amarreDisponible();
        if(amarre != null) {
            amarres.remove(amarre);
            amarre.addDiasAlquiler(numDias);
            amarre.addCliente(client);
            amarre.addBarco(barco);
            amerresAlquilados.add(amarre);
            precioAlquiler(numDias,barco);
            amarre.addCliente(client);
        }
        return precioAlquiler;
    }

    /**
     * Comprueba si el amarre indicado por parematro esta libre y
     * lo devuelve si no devuelve null.
     * @return
     */
    public Amarre amarreDisponible() {
        Amarre amarreDisponible = null;
        if (amarres.size() > 0) {
            amarreDisponible = amarres.get(0);
        }
        return amarreDisponible;
    }

    /**
     * Calcula el precio del alquiler del amarre
     * @param numDias
     * @param barco
     * @return
     */
    public int precioAlquiler(int numDias, Barco barco) {
        int precio = 0;
        precio += numDias*(10*barco.getEslora());
        precio += 300*barco.calcularBernua();
        return precio;
    }

    /**
     * Comprueba si el amarre indicado por parametro está alquilado
     * y devuelve el precio del alquiler, si no devuelve -1
     * @return
     */
    public int liquidarAlquilarAmarre(int numAmarre) {
        int precioAlquiler = -1;
        boolean amarreAlquilado = false;
        for (Amarre amarre: amerresAlquilados) {
            if(amarre.getNumAmarre() == numAmarre) {
                amarreAlquilado = true;
            }
            if(amarreAlquilado) {
                amerresAlquilados.remove(amarre);
                precioAlquiler = precioAlquiler(amarre.getDiasAlquiler(),amarre.getBarco());
                amarre.removeDiasAlquilar();
                amarre.removeBarco();
                amarre.removeCliente();
                amarres.add(amarre);
            }
        }
        /**Iterator<Amarre> it = amerresAlquilados.iterator();
        while(it.hasNext()) {
            Amarre amarre = it.next();
            if(numAmarre == amarre.getNumAmarre()) {
                amerresAlquilados.remove(amarre);
                precioAlquiler(amarre.getDiasAlquiler(),amarre.getBarco());
                amarre.removeDiasAlquilar();
                amarre.removeBarco();
                amarre.removeCliente();
                amarres.add(amarre);
            }
        }*/


        return precioAlquiler;
    }

    public String estadoDeLosAmarres() {
        String estado = "";
        for (Amarre amarre : amarres) {
            estado += amarre.toString() + "\n";
        }
        for (Amarre amarre : amerresAlquilados) {
            estado += amarre.toString() + "\n";
        }
        return estado;
    }

}
