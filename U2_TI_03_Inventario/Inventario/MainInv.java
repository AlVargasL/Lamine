import GestorInventario.Inventario;
import GestorInventario.Producto;

public class MainInv {

    public static void main(String[] args) throws Exception {

        Inventario inv = new Inventario(3);

        Producto p1 = new Producto(null, null, 0);
        p1.setCodigo("001");
        p1.setNombre("Computadora");
        p1.setCantidad(10);

        Producto p2 = new Producto(null, null, 0);
        p2.setCodigo("002");
        p2.setNombre("Monitor");
        p2.setCantidad(5);

        Producto p3 = new Producto(null, null, 0);
        p3.setCodigo("003");
        p3.setNombre("Mouse");
        p3.setCantidad(1);

        Producto p4 = new Producto(null, null, 0);
        p4.setCodigo("004");
        p4.setNombre("Teclado");
        p4.setCantidad(2);

        System.out.println("-----------------------------------------------");
        System.out.println("Producto 001 agregado: " + inv.agregarProducto(p1));
        System.out.println("Producto 002 agregado: " + inv.agregarProducto(p2));
        System.out.println("Producto 003 agregado: " + inv.agregarProducto(p3));
        System.out.println("Producto 004 agregado: " + inv.agregarProducto(p4));

        System.out.println("Total de productos: " + inv.totalItems());
        System.out.println("-----------------------------------------------");

        System.out.println("Buscar Producto 001:" + (inv.buscar("001") != null));
        System.out.println("Buscar Producto 050:" + (inv.buscar("050") != null));
        System.out.println("-----------------------------------------------");

        System.out.println("Producto 003 eliminado: " + inv.eliminarProducto("003"));
        System.out.println("Total de productos: " + inv.totalItems());
        System.out.println("-----------------------------------------------");

        System.out.println("Producto 004 agregado: " + inv.agregarProducto(p4));
        System.out.println("Total de productos: " + inv.totalItems());
        System.out.println("-----------------------------------------------");

    }
}