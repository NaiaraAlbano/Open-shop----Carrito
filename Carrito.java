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
public class Carrito {

    public static ArrayList<ItemCarrito> Productos = new ArrayList<>();

    public static void Agregar(Producto producto, int cantidad) {

        ItemCarrito prodEnCarrito = new ItemCarrito();
        prodEnCarrito.Producto = producto;
        prodEnCarrito.Cantidad = cantidad;

        Productos.add(prodEnCarrito);
    }

    public static void MostrarCarrito() {
        System.out.print("");
        System.out.print("Tienes en tu carrito: ");

        Double totalCarrito = 0.0;

        for (ItemCarrito item : Productos) {

            Integer cantidad = item.Cantidad;
            Double precio = item.Producto.Precio;
            String nombre = item.Producto.Nombre;
            System.out.print(cantidad + "x " + nombre + " $" + cantidad * precio);

            totalCarrito = +cantidad * precio;
        }

        System.out.print("\nTotal: $" + totalCarrito);
    }
}
