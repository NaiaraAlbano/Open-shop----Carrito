/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package openshop;

import java.util.ArrayList;

/**
 *
 * @author Naiara
 */
public class RegistroProducto {
    
    public static ArrayList<Producto> Productos = new ArrayList<Producto>();
    Producto producto1 = new Producto("Cafetera", 3000, "Philips");

    public RegistroProducto() {

        //una forma de agregar variable de tipo producto
        Productos.add(producto1);
        //forma abreviada de agregar producto a la lista
        Productos.add(new Producto("Celular", 249999.99, "Apple"));
        Productos.add(new Producto("Televisor", 22000, "Sony"));
        Productos.add(new Producto("Ojotas", 700, "Havaianas"));
        Productos.add(new Producto("Teclado", 6500.99, "Razer"));
    }

    public static void MostrarProductos() {
       
        System.out.print("\nListado de productos:");
        int pos = 1;
        for (Producto item : Productos) {
            System.out.println();
            System.out.print(pos + "-" + item.Nombre + " " + item.Marca + " $" + item.Precio);

            pos++;
        }
    }
}
