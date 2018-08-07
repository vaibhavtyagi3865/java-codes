import java.util.*;

class sum{

public static void main(String args[])
{
int n=10,x,sum=0;

for(int i=0;i<n;i++){
x=Integer.parseInt(args[i]);
sum=sum+x;
}
	System.out.println("Total sum= "+sum);
}

}