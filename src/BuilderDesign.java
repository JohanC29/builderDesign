
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author estudiante.cal
 */
public class BuilderDesign {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Se crea un cliente que va realizar la compra
        Cliente objcliente = new Cliente("1010", "Cliente 1");

        Producto[] productos = new Producto[3];
        productos[0] = new Camara("Canon", "RX-T1", 1, 50000);
        productos[1] = new Camara("Sony", "SONY-ETL", 1, 95000);
        productos[2] = new Impresion("True", seteoFotos(), 2, 10000);
        // El cliente toma 2 camaras y 3 impresiones
        // Organizo la clase de pedido con los productos
        Pedido pedido = new Pedido(objcliente, productos, new Date(), 1569754314);
        // El cliente solicita el precio y digita el numero de la tarjeta
        // para realizar el pago
        // Comentario 1
        objcliente.imprimirInfoCliente();
        System.out.println("");
        
        pedido.imprimirFactura();

    }

    public static Foto[] seteoFotos() {
        // Cargamos la foto que se va a imprimir
        Foto[] arrFoto = new Foto[3];

        for (int i = 0; i < arrFoto.length; i++) {
            arrFoto[i] = new Foto("ImagenDeArboles-" + i);
        }
        return arrFoto;
    }

}
