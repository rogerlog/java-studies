import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ContagemCedulas{
	
  public static void main(String[] args) throws IOException {
  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int valor = Integer.parseInt(st.nextToken());
    
    int[] notas = {100, 50, 20, 10, 5, 2, 1};
    int[] qtd = {0, 0, 0, 0, 0, 0, 0};
    
    System.out.println(valor);
  
    for(int i = 0; i <= 6; i++ ){
      while (valor >= notas[i]){
        valor = valor - notas[i];
        qtd[i]++;
      }
    }
    for(int i = 0; i<=6; i++){
      System.out.println(qtd[i] + " nota(s) de R$ "+notas[i]+",00");
    }
  }
}
