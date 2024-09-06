import javax.swing.JOptionPane;

public class EJ1 {
    public static void main(String[] args) {
        System.out.println("h");
        
        int f = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de filas que desea"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de columnas que desea"));

        int matriz[][] = new int[f][c];

        //LLenar Matriz
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero que va en la posicion " + "["+i+"]" + "["+j+"]" + " de la matriz" ));
            }
        }

                                                    //SUMA DE MANERA SENCILLA

        int s1 = 0;
        int s2 = 0;

        //Valida si la matriz ingresada es 2*3
        /*if (f == 2 && c == 3) {

            //Suma en zig-zag de los numeros ingresados en la matriz
            s1 = matriz[0][0]+matriz[0][2]+matriz[1][1];
            s2 = matriz[0][1]+matriz[1][0]+matriz[1][2];  
            
            System.out.println("\nLa suma de las posiciones [0][0] ; [0][2] ; [1][1] de la matris es = " + s1);
            System.out.println("La suma de las posiciones [0][1] ; [1][0] ; [1][2] de la matris es = " + s2);

        } else {
            JOptionPane.showMessageDialog(null, "La matriz esta fuera del rango requerido para hacer la suma en zig-zag");
        }*/


                                                    //SUMA DE MANERA MAS DIFICIL:>
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                
                if ((i == 0 && j == 0) || (i == 0 && j == 2) || (i == 1 && j == 1)) {
                    s1 += matriz[i][j];
                }
                
                if ((i == 0 && j == 1) || (i == 1 && j == 0) || (i == 1 && j == 2)) {
                    s2 += matriz[i][j];
                }
            }
        }

        System.out.println("\nLa suma de las posiciones [0][0] ; [0][2] ; [1][1] de la matris es = " + s1);
        System.out.println("La suma de las posiciones [0][1] ; [1][0] ; [1][2] de la matris es = " + s2);
                         
                                                        
    }

}
