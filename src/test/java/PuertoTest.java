import org.junit.Test;

import static org.junit.Assert.*;

public class PuertoTest {
    @Test
    public void test01() {
        Puerto puerto = new Puerto();

        Cliente cliente1 = new Cliente("Arturo", "1234Z");
        Cliente cliente2 = new Cliente("Bayon", "1234Z");
        Cliente cliente3 = new Cliente("Roberto", "1234Z");

        Barco barco1 = new Yate("236-C", 50, 2012, 1200, 35);
        Barco barco2 = new BarcoDeportivo("236-C", 50, 2012, 1200);
        Barco barco3 = new Velero("236-C", 50, 2012, 3);

        puerto.alquilarAmarre(100, cliente1,barco1);
        puerto.alquilarAmarre(365, cliente2,barco2);
        puerto.alquilarAmarre(30, cliente3,barco3);

        System.out.println(puerto.estadoDeLosAmarres());

        puerto.liquidarAlquilar(0);

       System.out.println(puerto.estadoDeLosAmarres());
    }

}