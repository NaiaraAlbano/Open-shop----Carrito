/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package openshop;

/**
 *
 * @author Naiara
 */
public class Producto {
    public String Nombre;
        public double Precio;
        public String Marca;

        public Producto(String nombre, double precio, String marca)
        {
            this.Nombre = nombre;
            this.Precio = precio;
            this.Marca = marca;
        }

        public String getNombre() {
                return Nombre;
        }
        public void setNombre(String nombre) {
                Nombre = nombre;
        }
        public double getPrecio() {
                return Precio;
        }
        public void setPrecio(double precio) {
                Precio = precio;
        }
        public String getMarca() {
                return Marca;
        }
        public void setMarca(String marca) {
                Marca = marca;
        }
}
