public class Main {

    public static void main(String[] args) {

        EstrategiaComision estrategia = new ComisionEstandar();

        Vendedor vendedor = new Vendedor(
                "Fernando",
                1000,
                estrategia
        );

        System.out.println("=== COMISIÓN ESTÁNDAR ===");
        vendedor.mostrarDetalle();

        vendedor.cambiarEstrategia(
                new ComisionPersonalizada("Daniel")
        );

        System.out.println("\n=== COMISIÓN PERSONALIZADA ===");
        vendedor.mostrarDetalle();
    }
}