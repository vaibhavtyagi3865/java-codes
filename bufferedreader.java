import java.io.*;
class bufferedreader{

public static void main(String args[]) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter an integer");
int a=Integer.parseInt(br.readLine());
System.out.println("Enter a string");
String s=br.readLine();
System.out.println("Integer="+a+" and string="+s);
}
} 