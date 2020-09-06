import java.util.Scanner;

public class Decrypter {

    public void decrypt(int d1, int d2, int d3, int d4){
        int temp = 0;


        //swap 1&3 and 2&4
        //System.out.println("swapping");
        temp = d1;
        d1 = d3;
        d3 = temp;

        temp = d2;
        d2 = d4;
        d4 = temp;
        //printEncrypt(d1, d2, d3, d4);

        //reverse mod by 10 (add remainder to )
        //System.out.println("dividing by 10");
        d1 %= 10;
        d2 %= 10;
        d3 %= 10;
        d4 %= 10;
        //printEncrypt(d1, d2, d3, d4);


        //subtract 7
        //System.out.println("subtracting 7");
        d1 -= 7;
        d2 -= 7;
        d3 -= 7;
        d4 -= 7;
        //printEncrypt(d1, d2, d3, d4);





        //System.out.println("Your Encrypted Number: " + d1 + d2 + d3 + d4);

    }

}
