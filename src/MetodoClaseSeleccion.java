public class MetodoClaseSeleccion {
    int[] arreglo;

    public MetodoClaseSeleccion(int[] arreglo){
        this.arreglo = arreglo;
    }

    public void sort(int[] arr){
        int tam = arr.length;
        for(int i = 0; i < tam - 1 ; i++){
            int indiceDelMenor = i;
            for(int j = i + 1; j < tam; j++){
                if(arr[indiceDelMenor] > arr[j]){
                    indiceDelMenor = j;
                }
            }
            if(i != indiceDelMenor){
                int aux = arr[i];
                arr[i] = arr[indiceDelMenor];
                arr[indiceDelMenor] = aux;
            }
        }
    }

    public void sortDes(int[] arr){
        int tam = arr.length;
        for(int i = 0; i < tam - 1 ; i++){
            int indiceDelMenor = i;
            for(int j = i + 1; j < tam; j++){
                if(arr[indiceDelMenor] < arr[j]){
                    indiceDelMenor = j;
                }
            }
            if(i != indiceDelMenor){
                int aux = arr[i];
                arr[i] = arr[indiceDelMenor];
                arr[indiceDelMenor] = aux;
            }
        }
    }



    public void printArreglo(){
        for(int num : arreglo){
            System.out.print(num + ", ");
        }
        System.out.println();
    }
}
