package Array;


public class Array2d {

    public static void main(String[] args) {

            String[][] ninjasEAldeias = new String[3][3];
            ninjasEAldeias[0][0] = "naruto";
            ninjasEAldeias[0][1] = "sasuke";
            ninjasEAldeias[0][2] = "sakura";

            ninjasEAldeias[1][0] = "hinata";
            ninjasEAldeias[1][1] = "kakashi";
            ninjasEAldeias[1][2] = "itachi";
            
            ninjasEAldeias[2][0] = "obito";
            ninjasEAldeias[2][1] = "madara";
            ninjasEAldeias[2][2] = "pain";

            for(int i = 0; i < ninjasEAldeias.length; i++) {
                System.out.println(ninjasEAldeias[i][1]);
            }

      
    }
}
