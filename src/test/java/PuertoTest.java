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

        //System.out.println(puerto.estadoDeLosAmarres());

        assertEquals(puerto.estadoDeLosAmarres(), "Amarre numero 3\n" +
                "No esta alquilado en este momento\n" +
                "\n" +
                "Amarre numero 0\n" +
                "Dias alquilados 100\n" +
                "Cliente Arturo, dni 1234Z\n" +
                "Tipo de barco Yate Barco Deportivo matricula=236-C, eslora=50, anoFabric=2012 potencia 1200 numero de camarotes 35\n" +
                "\n" +
                "Amarre numero 1\n" +
                "Dias alquilados 365\n" +
                "Cliente Bayon, dni 1234Z\n" +
                "Tipo de barco Barco Deportivo matricula=236-C, eslora=50, anoFabric=2012 potencia 1200\n" +
                "\n" +
                "Amarre numero 2\n" +
                "Dias alquilados 30\n" +
                "Cliente Roberto, dni 1234Z\n" +
                "Tipo de barco Velero matricula=236-C, eslora=50, anoFabric=2012 numero de Mastiles 3\n" +
                "\n");

        puerto.liquidarAlquilar(2);

        assertEquals(puerto.estadoDeLosAmarres(),
                "Amarre numero 3\n" +
                "No esta alquilado en este momento\n" +
                "\n" +
                "Amarre numero 2\n" +
                "No esta alquilado en este momento\n" +
                "\n" +
                "Amarre numero 0\n" +
                "Dias alquilados 100\n" +
                "Cliente Arturo, dni 1234Z\n" +
                "Tipo de barco Yate Barco Deportivo matricula=236-C, eslora=50, anoFabric=2012 potencia 1200 numero de camarotes 35\n" +
                "\n" +
                "Amarre numero 1\n" +
                "Dias alquilados 365\n" +
                "Cliente Bayon, dni 1234Z\n" +
                "Tipo de barco Barco Deportivo matricula=236-C, eslora=50, anoFabric=2012 potencia 1200\n" +
                "\n" );
       //System.out.println(puerto.estadoDeLosAmarres());
    }

}