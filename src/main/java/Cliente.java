/**
 * Clase que guarda toda la información referente a un cliente.
 */
public class Cliente {

    //Nombre del cliente
    private String name;
    //DNI del cliente
    private String dni;

    /**
     * Contrunctor de la clase Cliente que pide por parametro el nombre y
     * el DNI del cliente.
     * @param clientName
     * @param clientDni
     */
    public Cliente(String clientName, String clientDni) {
        name = clientName;
        dni = clientDni;
    }

    /**
     * Metodo que devuelve el nombre del cliente.
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Metodo que devuelve el DNI del cliente.
     * @return
     */
    public String getDni() {
        return dni;
    }
}
