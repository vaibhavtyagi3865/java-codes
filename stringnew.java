
import java.util.*;

public class stringnew {

public static void main(String[] args){  
    int c=0,l=0,i;
    String s="aaaabbbccddddeeee";
    for( i=0;i<s.length();i=i+l){
       char x=s.charAt(i);
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)==x){
                c++;
            }
        }
        l=c;
        System.out.print(x+""+c);
        c=0;
    }
}
}
