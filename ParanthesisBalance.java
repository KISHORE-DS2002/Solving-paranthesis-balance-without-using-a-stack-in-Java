import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {
    public static int getMin(String s)
    {
        int l=0;
        int r=0;
        int a=0;
        int temp1=0;
        int temp2=(s.length())-1;
        int temp3=0;
        char x[] = s.toCharArray();
        int q = (int)Math.pow(10,5);
        if(1<=s.length() && s.length()<=q)
        {
            if(x[0]==')' && x[s.length()-1]!='(')
            {
                while(x[temp1]==')')
                {
                    temp1++;
                }

                for(int i =temp1;i<s.length();i++)
                {
                    if(x[i]==')')
                    {
                        l++;
                    }
                    if(x[i]=='(')
                    {
                        r++;
                    }
                    if(l==r)
                    {

                    }
                }
            }
            if(x[s.length()-1]=='(' && x[0]!=')')
            {
                while(x[temp2]=='(')
                {
                    temp2--;
                    temp3++;
                }
                for(int i =0;i<temp2+1;i++)
                {
                    if(x[i]==')')
                    {
                        l++;
                    }
                    if(x[i]=='(')
                    {
                        r++;
                    }
                }
            }
            if(x[0]==')' && x[s.length()-1]=='(')
            {

                while(x[temp1]==')')
                {
                    temp1++;
                }
                while(x[temp2]=='(')
                {
                    temp2--;
                    temp3++;
                }
                for(int i =temp1;i<temp2+1;i++)
                {
                    if(x[i]==')')
                    {
                        l++;
                    }
                    if(x[i]=='(')
                    {
                        r++;
                    }
                }
            }
            if(x[0]!=')' && x[s.length()-1]!='(')
            {

                for(int i =0;i<s.length();i++)
                {
                    if(x[i]==')')
                    {
                        l++;
                    }
                    if(x[i]=='(')
                    {
                        r++;
                    }
                }
            }
            if(l>r)
            {
                a = l-r;
            }
            if(r>l)
            {
                a = r-l;
            }
        }
        return a + temp1 + temp3;
    }

}

public class ParanthesisBalance {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int result = Result.getMin(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
