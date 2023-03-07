
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoPerezBarrosoIgnacio2223 miVehiculoPerezBarrosoIgnacio2223;
        int stockActual;
        
        miVehiculoPerezBarrosoIgnacio2223 = new VehiculoPerezBarrosoIgnacio2223("Seat",18000,100);
        operativaVehiculosPerezBarrosoIgnacio2223(miVehiculoPerezBarrosoIgnacio2223); 
        stockActual = miVehiculoPerezBarrosoIgnacio2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

    private static void operativaVehiculosPerezBarrosoIgnacio2223(VehiculoPerezBarrosoIgnacio2223 miVehiculoPerezBarrosoIgnacio2223) {
        int cantidad=50;
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoPerezBarrosoIgnacio2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoPerezBarrosoIgnacio2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
    }

}
    
