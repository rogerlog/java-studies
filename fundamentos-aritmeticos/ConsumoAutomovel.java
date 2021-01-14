import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ConsumoAutomovel{
	
  public static void main(String[] args) throws IOException {
  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int x = Integer.parseInt(st.nextToken());
    
    st = new StringTokenizer(br.readLine());
    double y = Double.parseDouble(st.nextToken());
    
    double saida = x/y;
    
    System.out.printf("%.3f km/l", saida);
  }
}
