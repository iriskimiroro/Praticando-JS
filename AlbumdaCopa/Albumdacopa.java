import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Albumdacopa {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();
		int n = leitor.nextInt();
		int m = leitor.nextInt();
		for(int i = 0; i < m; i++) {
			int a = leitor.nextInt();
			list.add(a);
		}
		
		int total = list.stream().distinct().collect(Collectors.toList()).size();
		System.out.println(n - total);
	}
	
}	