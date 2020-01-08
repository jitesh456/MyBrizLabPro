package functional_program;

public class Distance {
 public static void main(String args[])
 {
	double i,j,dist=0;
	 i=Integer.parseInt(args[0]);
	 j=Integer.parseInt(args[0]);
	 dist=Math.sqrt(Math.pow(i, 2)+Math.pow(j, 2));
	 System.out.println(dist);
 }
}
