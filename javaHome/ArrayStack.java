class ArrayStack
{
 private Object[] array;
 private int count;
 public static final int MAX = 100; 

 public ArrayStack()
 {
  array = new Object[MAX];
  count = 0;
 }

 public Object top()
 {
  return array[count-1];
 }

 public void pop()
 {
  count--;
 }

 public void push(Object obj)
 {
  array[count++]=obj;
 }

 public boolean isEmpty()
 {
  return count==0;
 }

}