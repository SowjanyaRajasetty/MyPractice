


import java.io.*;
import java.util.*;

//Wissen
public class WissenTestClass {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        PrintWriter wr = new PrintWriter(System.out);
//         String S = br.readLine();
         String S="xyz abc mnp \"asdf dfaa asdf\" asd \"fdas asdsdafF\"";

         String[] out_ = tokenize_string(S);
         for (int i_out_ = 0; i_out_ < out_.length; i_out_++)
         {
         	System.out.println(out_[i_out_]);
         }

//         wr.close();
//         br.close();
    }
 static String[] tokenize_string(String S){
String[] out;
char[] c=S.toCharArray();

for(int i=0;i<c.length;i++)
{
    if(c[i]==' ')
    {
    	c[i]='$';
    }
    if(c[i]=='"')
    {        
        while(i<c.length)
        {
            i++;
        if(c[i]=='"')
        {
            break;
        }
        }

    }
}
String output=new String(c);
out=output.split("\\$");
return out;


    
    }
}
