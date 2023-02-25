/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author estudiante.cal
 */
public class Camara extends Producto{
    private String marca;
    private String modelo;

    public Camara(String marca, String modelo, int numero, int precio) {
        super(numero, precio);
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public void imprimirInfoProducto(){
        System.out.println("Tipo: Camara");
        System.out.println("Marca: "+this.marca);
        System.out.println("Mdelo: "+this.modelo);
        System.out.println("Precio: "+(super.getPrecio()*super.getNumero()));
    }
    
    
}
