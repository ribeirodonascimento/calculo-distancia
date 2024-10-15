import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int x = 60;
        int y = 90;
        int distancia = s.nextInt();
        int tempo = distancia * 2;
        System.out.println(tempo + " minutos");
    }
}