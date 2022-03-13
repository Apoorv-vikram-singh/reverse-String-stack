import java.util.*;
public class reverseStackString 
{
    public String revertseString(String str)
    {
        Stack<Character> stac=new Stack<>();
        char[] ss=str.toCharArray();
       
        for(int i=0;i<str.length();i++)
        {
            stac.push(ss[i]);
        }
        int k=0;
        while(!stac.isEmpty())
        {
            ss[k]=stac.pop();
            k++;
        }
        return String.copyValueOf(ss);
    }
    public static void main(String args[])
    {
        reverseStackString obj=new reverseStackString();
        String str="hellow";
        String result=obj.revertseString(str);
        System.out.println(result);
    }

    }