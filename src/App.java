public class App {
    public static void main(String[] args) throws Exception {
        metodoBurbuja();
    }

    public static void metodoBurbuja(){
        System.out.println("Metodo Burbuja");
        int[] arreglo = new int[]{10, -5, 0, 2, 7};
        MetodoBurbuja metodoBurbuja = new MetodoBurbuja(arreglo);
        System.out.println("Ascendente");
        metodoBurbuja.imprimirArreglo();
        metodoBurbuja.ordenarAscendente();
        metodoBurbuja.imprimirArreglo();

        System.out.println("Descendente");

        metodoBurbuja.imprimirArreglo();
        metodoBurbuja.ordenarDescendente();
        metodoBurbuja.imprimirArreglo();
    }

}
