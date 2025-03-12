package zadaci;

public class Zadatak2 {
    public static void main(String[] args) {

        iscrtaj(10,5);
    }

    static void iscrtaj(int x ,int y){

        for (int i = 1; i <=x ; i++) {
            if (i%2 == 0){
                for (int j = 1; j <= y; j++) {
                    System.out.print('\u25CB');
                }
                System.out.println();

            }else {
                for (int j = 1; j < y; j++) {
                    System.out.print('\u25A3');

                }
                System.out.println();
            }

        }

    }
}
