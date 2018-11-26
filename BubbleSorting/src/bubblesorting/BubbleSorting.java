package bubblesorting;
import java.util.*;
public class BubbleSorting {
    
    public static void main(String[] args){
        int[] Bubble={5, 2, 4, 1, 3};
        System.out.println("VALUES:");
        Print(Bubble);
        System.out.println("");
        
        Ascending(Bubble);
        Descending(Bubble);
        ShuffleArray(Bubble);
    }
    public static void Ascending(int Bubble[]){
        int temp;
        boolean sorted=false;
        while(sorted==false){
            sorted=true;
            for(int i = 0; i<Bubble.length-1; i++){
                if(Bubble[i] > Bubble[i+1]){
                    temp = Bubble[i+1];
                    Bubble[i+1] = Bubble[i];
                    Bubble[i] = temp;
                    sorted=false;
                }
            }
        }
        System.out.println("ASCENDING:");
        Print(Bubble);
    }
    
    public static void Descending(int Bubble[]){
        int temp;
        boolean sorted=false;
        while(sorted==false){
            sorted=true;
            for(int i = 0; i<Bubble.length-1; i++){
                if(Bubble[i] < Bubble[i+1]){
                    temp = Bubble[i+1];
                    Bubble[i+1] = Bubble[i];
                    Bubble[i] = temp;
                    sorted=false;
                }
            }
        }
        System.out.println("DESCENDING:");
        Print(Bubble);
    }
    
    public static void ShuffleArray(int []Bubble){
        int index, temp;
        Random random = new Random();
        for(int i = Bubble.length-1; i>0; i--){
            index = random.nextInt(i+1);
            temp = Bubble[index];
            Bubble[index] = Bubble[i];
            Bubble[i] = temp;
        }
        System.out.println("RANDOM:");
        Print(Bubble);
    }
    public static void Print(int Bubble[]){
        System.out.print("[ ");
        for(int i=0; i<Bubble.length; i++){
            System.out.print(Bubble[i]+", ");
        }
        System.out.println("]");
    }
}