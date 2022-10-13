import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String nama;
        int umur;

        System.out.print("Masukkan Nama \t: " );
        nama = input.nextLine();
        System.out.print("Masukkan Umur \t: " );
        umur = input.nextInt();
        if(umur >= 17){
            System.out.print("Selamat Anda dapat membuat KTP\n" );
        }
        else
        {
            System.out.print("Anda tidak dapat membuat KTP\n" );
        }
        System.out.print("\n" );
        int i = 0;
	    while (i < 2){
		    System.out.print("Ini contoh perulangan while\n" );
		    i++;
	    }
        System.out.print("\n" );
	    
	    int j = 0;
        do {												
            System.out.print("Ini contoh perulangan Do while\n" );
            j++;
        }
        while (j < 2);
        System.out.print("\n" );

        char y[]={'d', 'a', 'y', 'a', 'n', 's'};
        System.out.print("ARRAY 1D\n");
        for(int k=0; k<6; k++){        //perulangan For & array 1D
            System.out.println("Index ke" + k + " = " + y[k]);            
        }
        
        int x[][] = {{07,20}, {05,03}, {03,03}};
        System.out.println("ARRAY 2D\n");
        for(int e=0;e<3;e++)
	    {
		    for(int d=0;d<2;d++)
		    {
			    System.out.print(x[e][d] + "\t");
		    }
            System.out.println();
	    }
    }




}


    

