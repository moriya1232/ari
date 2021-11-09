public class ari {

    public static void main(String[] args) {

        char a = '*';

        for (int i=0; i<=5; i++) {
            for(int j=0;j<=5; j++) {
                if(i==0 || i == 5) {
                    System.out.print(a);
                }
                else if(j==0 || j == 5) {
                    System.out.print(a);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i=0; i<=5; i++) {
            for(int j=0;j<=5; j++) {
                System.out.print(a);
            }
            System.out.println();
        }



    }
}
