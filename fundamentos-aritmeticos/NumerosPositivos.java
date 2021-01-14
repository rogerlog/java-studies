import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class NumerosPositivos {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int positivos = 0;
    
    for(int i=0; i<6; i++){
      
      StringTokenizer st = new StringTokenizer(br.readLine());
      double valor = Double.parseDouble(st.nextToken());
      
      if(valor > 0 ) {
        positivos++;
      }
    }
    System.out.println(positivos+" valores positivos");
  }
}
