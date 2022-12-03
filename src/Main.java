import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        int inp=scan.nextInt();
        int n=inp;
        int turn=1;
        if(inp>0){
            printerPos(inp,n,turn);
        }
        else{
            printerNeg(inp,n,turn);
        }



    }
    static void printerPos(int x,int y,int turn){
        if(turn>2){
            System.exit(0);
        }
        if(x>0){
            System.out.print(x+" ");
            printerPos(x-5,y,turn);
        }
        else{
            printerNeg(x,y,turn+1);
        }
    }
    static void printerNeg(int x,int y,int turn){
        if(turn>2){
            System.exit(0);
        }
        if(x<=y){
            System.out.print(x+" ");
            printerNeg(x+5,y,turn);
        }
        else{
            printerPos(x,y,turn+1);
        }
    }


}