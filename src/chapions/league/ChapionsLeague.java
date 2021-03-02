package chapions.league;



import java.util.Random;
import java.util.Scanner;

public class ChapionsLeague {

    public static void main(String[] args) throws InterruptedException {
        
        Scanner entrada = new Scanner(System.in);
        Jogador j[] = new Jogador[4];
        int contagemJo = 0;
        
        String enter;
        
        Thread.sleep(1700);
        
        System.out.println("///////////////////////////");
        System.out.println("///BEM VINDO A CHAMPIONS///");
        System.out.println("///////////////////////////");
        System.out.println("                       BETA");
        System.out.println("");
        Thread.sleep(1300);
        System.out.println("Precione uma letra para começar...");
        enter = entrada.nextLine();
        System.out.println("");
        System.out.println("");
        
        System.out.println("LOADING");
        Thread.sleep(1300);
        System.out.print(".");
        Thread.sleep(1300);
        System.out.print(".");
        Thread.sleep(1300);
        System.out.print(".");
        Thread.sleep(1300);
        System.out.print(".");
        Thread.sleep(1300);
        System.out.print(".");
        Thread.sleep(1300);
        System.out.print(".");
        Thread.sleep(1300);
        System.out.print(".");
        Thread.sleep(1300);
        System.out.print(".");
        Thread.sleep(1300);
        System.out.print(".");
        Thread.sleep(1300);
        System.out.print(".");
        Thread.sleep(1300);
        System.out.print(".");
   
     
        System.out.println("");
        System.out.println("");
        System.out.println("FORNEÇA 4 JOGADORES");
        System.out.println("");
        for (int i = 0; i < 4 ; i++) {
            contagemJo = contagemJo + 1;
         j[i] = new Jogador();
            System.out.println("Solicite o nome do jogador: " + (i + 1) );
         j[i].nome = entrada.nextLine();
            System.out.println("----------------------------------------");
        }
        Thread.sleep(1300);
        System.out.println("");
        System.out.println("Esses são os campeões");
        for (int i = 0; i < 4; i++) {
            System.out.print(j[i].nome + ",");
        }
        System.out.println("");
        System.out.println("--------------------------------------------");
        Thread.sleep(1300);
        System.out.println("");
        System.out.println("Cadastre times para os jogadores");
        System.out.println("");
        String[] time = new String[contagemJo];
        System.out.println("");
        for (int i = 0; i < contagemJo; i++) {
            System.out.println("Solicite o time: " + ( i+1 ) );
            time[i] = entrada.nextLine();
            System.out.println("----------------------------------------");
        }
     
        
  int find = 0;
  int c = 0; 
     
int[] num = new int[4];        
Random r = new Random(); 

for(int i = 0; i < num.length; i++)
{
	find = r.nextInt(4);
	if ( i == 0 ) {
		num[i] = find;
	} else {
		c = 0;
		while (c < i)
		{
			if (num[c] == find)
			{
				find = r.nextInt(4);
				c = 0;
			} else {                   
				c++;
			}
		}
		num[i] = find;                
	}
}
j[0].time = time[num[0]];
j[1].time = time[num[1]];
j[2].time = time[num[2]];
j[3].time = time[num[3]];
Thread.sleep(1300);
        System.out.println("");
        System.out.println("Sorteando os clubes para os jogadores");
        
        System.out.print(".");
        Thread.sleep(1300);
        System.out.print(".");
        Thread.sleep(1300);
        System.out.print(".");
        Thread.sleep(1300);
        System.out.print(".");
        Thread.sleep(1300);
        System.out.print(".");
        Thread.sleep(1300);
        System.out.print(".");
        Thread.sleep(1300);
        System.out.print(".");
        Thread.sleep(1300);
        System.out.print(".");
        Thread.sleep(1300);
        System.out.print(".");
        Thread.sleep(1300);
        System.out.print(".");
        Thread.sleep(1300);
        System.out.print(".");
        System.out.println("");
        
        System.out.println("O time do "+ j[0].nome + " é o " + j[0].time);
        Thread.sleep(1100);
        System.out.println("");
        System.out.println("O time do "+j[1].nome + " é o " + j[1].time);
        Thread.sleep(1100);
        System.out.println("");
        System.out.println("O time do "+j[2].nome + " é o " + j[2].time);
        Thread.sleep(1100);
        System.out.println("");
        System.out.println("O time do "+j[3].nome + " é o " + j[3].time);
        Thread.sleep(1100);
  
    }
}
