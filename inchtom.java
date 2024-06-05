import java.util.*;
class inch
{
  public static void main(String a[])
{
	Scanner s = new Scanner(System.in);
	Double i,n;
	System.out.println("Enter the Inches:");
	n = s.nextDouble();    
	i = n*0.0254;
	System.out.println("Meters:"+i);
}
}
