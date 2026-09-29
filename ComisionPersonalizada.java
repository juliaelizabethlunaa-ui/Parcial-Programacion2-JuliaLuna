public class ComisionPersonalizada implements EstrategiaComision {

    private String nombre;

    public ComisionPersonalizada(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public double calcularComision(double montoVenta) {
        String primerNombre = nombre.trim().split("\\s+")[0];
        int cantidadLetras = primerNombre.length();

        double porcentaje = 5 + cantidadLetras;

        return montoVenta * (porcentaje / 100);
    }
}