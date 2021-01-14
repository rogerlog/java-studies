import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class AnaliseNumeros{
	
  public static void main(String[] args) throws IOException {
  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int count = 0;
    int pares = 0;
    int impares = 0;
    int positivos = 0;
    int negativos = 0;
      
    while(count < 5) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int valor = Integer.parseInt(st.nextToken());  
      
      if(valor > 0){
        positivos++;
      } else if(valor < 0){
        negativos++;
      }
      
      if(valor %2 == 0){
        pares++;
      }else{
        impares++;
      }
      
      count++;
    }
    
    System.out.println(pares+" valor(es) par(es)");
    System.out.println(impares + " valor(es) impar(es)");
    System.out.println(positivos + " valor(es) positivo(s)");
    System.out.println(negativos + " valor(es) negativo(s)");
  }
}
