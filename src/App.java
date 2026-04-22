public class App {
    public static void main(String[] args) throws Exception {
        metodoBurbuja();
        runMetodoBurbujaAvanzado();
        runSeleccion();
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

    public static void runMetodoBurbujaAvanzado(){
        int[] arreglo = new int[]{50, 5, 20, 30, 0, -10, 15};
        // 1ero instanciar la clase
        MetodoBurbujaAvanzado mBurbujaAvanzado = new MetodoBurbujaAvanzado(arreglo);
        System.out.println("Metodo Avanzado");
        mBurbujaAvanzado.printArreglo();
        System.out.println("Ascendente");
        mBurbujaAvanzado.sort(true);
        mBurbujaAvanzado.printArreglo();
        System.out.println("Descendente");
        mBurbujaAvanzado.sort(false);
        mBurbujaAvanzado.printArreglo();
    }

    public static void runSeleccion(){
        //Instanciar clase Seleccion
        int[] arr = new int[]{1, 10, 7, 9, 0, 1, 3, 4};
        MetodoClaseSeleccion mSeleccion = new MetodoClaseSeleccion(arr);
        System.out.println("------------------");
        mSeleccion.printArreglo();
        mSeleccion.sort(arr);
        mSeleccion.printArreglo();
        mSeleccion.sortDes(arr);
        mSeleccion.printArreglo();

        
    }
}