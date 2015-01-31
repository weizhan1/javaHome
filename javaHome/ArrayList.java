import java.util.*;

class ArrayList
{
 private int count;
 private int[] array;

 public static ArrayList empty()
 {
  return new ArrayList(null,0);
 }

 private ArrayList(int[] a,int s)
 {
  array=a;
  count=s;
 }

 public int head()
 {
  return array[count-1];
 }

 public ArrayList tail()
 {
  return new ArrayList(array,count-1);
 }

 public ArrayList cons(int n)
 {
  int[] array1 = new int[count+1];
  for(int i=0; i<count; i++)
     array1[i]=array[i];
  array1[count]=n;
  return new ArrayList(array1,count+1);
 }

 public boolean isEmpty()
 {
  return count==0;
 }

 public String toString()
 {
  if(count==0)
     return "[]";
  else
     {
      String str="["+array[count-1];
      for(int i=count-2; i>=0; i--)
         str+=","+array[i];
      return str+"]";
     }
 }
 
 public static ArrayList fromString(String str)
 {
  str=str.trim();
  if(str.charAt(0)!='['||str.charAt(str.length()-1)!=']')
     return empty();
  str = str.substring(1,str.length()-1);
  StringTokenizer toks = new StringTokenizer(str,",");
  try {
       int[] array1 = new int[toks.countTokens()];
       for(int i=array1.length-1; i>=0; i--)
          {
           String num = toks.nextToken().trim();
           array1[i]=Integer.parseInt(num);
          }
       return new ArrayList(array1,array1.length);
      }
  catch(NumberFormatException e)
      {
       return empty();
      }
 }

}