package aula10;

/*
  M006 Dado uma matriz quadrada de ordem 3
  faça um algoritmo que verifique se a matriz é
  simétrica (aij=aji).
*/
public class M006 {
    public static void main(String[] args){
        int[][] m1 = {{1,2,3}, {2,4,5}, {3,5,6}},
                m2 = {{1,2,3}, {4,5,6}, {7,8,9}};

        System.out.println("M1: " + ehSimetrica(m1));
        System.out.println("M2: " + ehSimetrica(m2));
    }

    private static boolean ehSimetrica(int[][] a) {
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a.length; j++){
                if (a[i][j] != a[j][i]){
                    return false;
                }
            }
        }
        return true;
    }
}
