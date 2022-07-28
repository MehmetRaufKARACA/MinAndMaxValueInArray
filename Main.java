import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int[] arr = {15,12,788,1,-1,-778,2,0};

        int[] arrMin= new int[arr.length];    
        int[] arrMax= new int[arr.length];     

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz:");
        int number=scan.nextInt();


        int a=0,b=0;


        for (int i=0;i< arr.length;i++){

            if (arr[i]>=number){

                arrMax[a]=arr[i];           
                a++;

            }
            if (arr[i]<=number){

                arrMin[b]=arr[i];
                b++;
            }
        }
        int min=arrMax[0];
        int max=arrMin[0];


        for (int i:arrMax){

            if (i<min && i>number){        
                min=i;                  
            }
        }

        for (int i:arrMin){

            if (i>max && i<number){      
                max=i;
            }
        }
        System.out.println("Girilen sayidan kucuk en yakin sayi:"+max);

        System.out.println("Girilen sayidan buyuk en yakin sayi:"+min);

    }
}