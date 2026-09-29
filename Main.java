public class Main {

    public static void main(String[] args) {

        EstrategiaComision estrategia =
                new ComisionPersonalizada("Julia Elizabeth Luna Gámez");

        Vendedor vendedor = new Vendedor(
                "Daniel",
                1000,
                estrategia
        );

        System.out.println("=== COMISIÓN PERSONALIZADA ===");
        vendedor.mostrarDetalle();
    }
}