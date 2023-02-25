
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author estudiante.cal
 */
public class Pedido {

    private Cliente cliente;
    private Producto[] producto;
    private Date fecha;
    private int numeroTarjetaCredito;

    public Pedido(Cliente cliente, Producto[] producto, Date fecha, int numeroTarjetaCredito) {
        this.cliente = cliente;
        this.producto = producto;
        this.fecha = fecha;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

    public Producto[] getProducto() {
        return producto;
    }

    public void setProducto(Producto[] producto) {
        this.producto = producto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNumeroTarjetaCredito() {
        return numeroTarjetaCredito;
    }

    public void setNumeroTarjetaCredito(int numeroTarjetaCredito) {
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

    public void imprimirInfoPedido() {
        int i = 1;
        for (Producto producto1 : producto) {
            System.out.println("Item :" + (i++));
            producto1.imprimirInfoProducto();
            System.out.println("");

        }
    }

    public int getPrecioTotal() {
        int result = 0;
        for (Producto producto1 : producto) {
            result += producto1.getNumero() + producto1.getPrecio();
        }
        return result;
    }

    public void imprimirFactura() {
        this.imprimirInfoPedido();
        System.out.println("Total a pagar: " + this.getPrecioTotal());
    }
    

}
