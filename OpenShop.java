package openshop;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Naiara
 */
public class OpenShop {

    public static void main(String[] args) {
        System.out.println("--------------BIENVENIDO AL OPEN SHOP-------------\n");

        boolean continuar = true;
        Scanner entrada = new Scanner(System.in);

        while (continuar) {
            registrarCliente();
            inicioSeccion();

            boolean finalizado = Comprar();
            System.out.println("\n¿Desea continuar? presione 1 sino cualquier tecla");
            int eleccion = entrada.nextInt();
            if (eleccion != 1) {
                continuar = false;
            }
        }

    }

    static public boolean Comprar() {

        RegistroProducto registrar = new RegistroProducto();
        RegistroProducto.MostrarProductos();

        System.out.println();
        System.out.print("Seleccione un producto");
        Scanner input = new Scanner(System.in);
        String productoIngresado = input.nextLine();
        Integer posicion = Integer.parseInt(productoIngresado) - 1;
        Producto producto = RegistroProducto.Productos.get(posicion);

        System.out.println();
        System.out.print("Introduzca la cantidad que desea comprar: \n");
        input = new Scanner(System.in);
        String cantidadIngresada = input.nextLine();
        Integer intCantidad = Integer.parseInt(cantidadIngresada);

        Carrito.Agregar(producto, intCantidad);
        Carrito.MostrarCarrito();
        return true;
    }

    public static void inicioSeccion() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el nombre de usuario: \n");
        String usuario = entrada.nextLine();
        System.out.println("Ingrese el contraseña: \n");
        String contrasena = entrada.nextLine();

        verificarCuenta(usuario, contrasena);
    }

    public static void verificarCuenta(String usuario, String contrasena) {

        ArrayList<Cliente> clientes = new ArrayList();
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).usuario.equals(usuario)) {
                System.out.println("Usuario válido");

                if (clientes.get(i).contrasena.equals(contrasena)) {
                    System.out.println("Contraseña válida");
                    System.out.println("Sección iniciada correctamente");
                } else {
                    System.out.println("Contraseña inválida");
                }
            } else {
                System.out.println("Usuario inválido");
            }
        }

    }

    public static void registrarCliente() {
        Scanner entrada = new Scanner(System.in);
        boolean registrar = true;
        do {
            System.out.println("Ingrese el nombre: \n");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese el IdCLiente: \n");
            int idCliente = entrada.nextInt();
            System.out.println("Ingrese el apellido: \n");
            String apellido = entrada.nextLine();
            System.out.println("Ingrese el dni: \n");
            int dni = entrada.nextInt();
            System.out.println("Ingrese el mail: \n");
            String mail = entrada.nextLine();
            System.out.println("Ingrese el domicilio: \n");
            String domicilio = entrada.nextLine();
            System.out.println("Ingrese el provincia: \n");
            String provincia = entrada.nextLine();
            System.out.println("Ingrese el nombre de usuario: \n");
            String usuario = entrada.nextLine();
            System.out.println("Ingrese el contraseña: \n");
            String contrasena = entrada.nextLine();

            Cliente nuevoCliente = new Cliente(idCliente, domicilio, provincia, dni, usuario, contrasena, mail, nombre, apellido);
            clientes.add(nuevoCliente);

            JSON_MAPPER.writeValue(new File("/Este equipo/Documentos/Nueva/listadeClientes.json"), Clientes);

            Cliente cliente1 = JSON_MAPPER.readValue(new File("C:/Users/Naiara/Documents/NetBeansProjects//TiendaAbierta"), clientes);
            System.out.println(cliente1);

            ArrayList<Cliente> personasdesdejson = JSON_MAPPER.readValue(new File("/Este equipo/Documentos/Nueva/listadepersonas.json"), JSON_MAPPER.getTypeFactory().constructCollectionType(ArrayList.class, Cliente.class));
            System.out.println(personasdesdejson.get(1).getApellido());

        }
    }

    public static void gestionVenta() {
        ArrayList <Venta> venta = new venta();
         JSON_MAPPER.writeValue(new File("/Este equipo/Documentos/Nueva/listadeClientes.json"), venta);
	        
	        Venta = JSON_MAPPER.readValue(new File("C:/Users/Naiara/Documents/NetBeansProjects//TiendaAbierta"), benta);
	        System.out.println(cliente1);
	        
	        ArrayList<Cliente> venta = JSON_MAPPER.readValue(new File("/Este equipo/Documentos/Nueva/listadeventa.json"), JSON_MAPPER.getTypeFactory().constructCollectionType(ArrayList.class, Cliente.class));
	        System.out.println(ventadejson.get(1).getApellido());
    }
}
}
