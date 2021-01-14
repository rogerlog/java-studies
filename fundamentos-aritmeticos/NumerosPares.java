import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class NumerosPares{
	
  public static void main(String[] args) throws IOException {
  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int valor = Integer.parseInt(st.nextToken());
    int count = 1;
      
    while(count <= valor) {
      if(count %2 == 0){
        System.out.println(count);
      }
      count++;
    }
  }
}
