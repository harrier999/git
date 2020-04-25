package pi;
public class pi {
	public static void main(String[] args) {
		double pi=0;
		System.out.println(pi);
		for(int i =0;i<10000;i++) {
			pi+=1.0/(4*i+1);
			pi-=1.0/(4*i+3);
		}
		System.out.println(4*pi);
	}
}
