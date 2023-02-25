/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author estudiante.cal
 */
public class Impresion extends Producto{
    private String color;
    private Foto[] foto;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Impresion(String color, Foto[] foto, int numero, int precio) {
        super(numero, precio);
        this.color = color;
        this.foto = foto;
    }

    public Foto[] getFoto() {
        return foto;
    }

    public void setFoto(Foto[] foto) {
        this.foto = foto;
    }
    
    public String nombre(){
       return "Impresion";
    }
    
   
    @Override
    public void imprimirInfoProducto(){
        System.out.println("Tipo: Impresion");
        System.out.println("Color: "+this.color);
        System.out.println("Cantidad Fotos: "+this.foto.length);
        System.out.println("Detalle Fotos:");
        for (Foto foto1 : foto) {
            System.out.println("- "+foto1.getFichero());
        }
        System.out.println("Precio: "+(super.getPrecio()*super.getNumero()));
    }

}
