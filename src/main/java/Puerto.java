import java.util.ArrayList;

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

}
