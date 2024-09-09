import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class QuickSort {
   
    public static void main(String[] args) throws IOException {
    
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        
        System.out.print("\n Ingrese Numero de Datos a Ingresar : ");

        int tam = Integer.parseInt(in.readLine());

        
        int arr[] = new int[tam];

        System.out.println();

        int j = 0;

        for (int i = 0 ; i < arr.length;i++)
        {
            j+=1;
            System.out.print("Elemento " + j + " : ");
            arr[i] = Integer.parseInt(in.readLine());
        }

        quickSort(arr, 0, tam - 1);
        
        System.out.println("\nMetodo QuickSort");
        for(int l = 0;l < arr.length; l++)
        {            
            System.out.print(arr[l]+"\n");
        }
    }

    static void quickSort(int arreglo[], int p, int r)
    {
        if(p < r)
        {
            int q = Particion(arreglo, p, r);
            quickSort(arreglo, p, q - 1);
            quickSort(arreglo, q + 1, r);
        }
    }    
    static int Particion(int arreglo[], int p, int r)
    {
        int x = arreglo[r];
        int i = p - 1, t;
        for(int j = p; j < r; j++)
        {
            if(arreglo[j] <= x)
            {
                i++;
                t = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = t;
            }
        }
        t = arreglo[i + 1];
        arreglo[i + 1] = arreglo[r];
        arreglo[r] = t;
        
        return i + 1;
     }
}