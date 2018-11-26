package numberpyramid;
import java.io.*;
public class NumberPyramid {

    public static void main(String[] args) throws Exception {
        BufferedReader gg = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter row count: ");
        int count = Integer.parseInt(gg.readLine());
        
        for(int i=1; i<=count; i++){
            for(int s=i; s<=(count-1)*2; s++){
                System.out.print("    ");
            }
            for(int l = i; l>=1; l--){
                System.out.printf("%4d",l);
            }
            for(int r=2; r<=i; r++){
                System.out.printf("%4d",r);
            }
            System.out.println(" ");
        }
    }
    
}
