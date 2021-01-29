public class Main{
    public static void main(String[] args) {

        int ROW = 4, COL = 4;

        /*for(int i = 0; i < ROW;i++) {
            for(int j = 0; j < ROW - i; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        /*for(int i = 1; i < 11; i++){

            for(int j = 1; j < 11; j++){

                System.out.print(i * j + "\t");
            }
            System.out.println();
        }*/

        for(int i = 1; i < 12; i+=4){

            for(int j = 0; j < 4; j++){

                System.out.print(i + j + "\t");
            }
            System.out.println();
        }
    }
}