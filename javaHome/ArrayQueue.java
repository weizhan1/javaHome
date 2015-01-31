class ArrayQueue
{
 private int front,back;
 private Object[] array;
 public static final int MAX=100;

 public ArrayQueue()
 {
  front=0;
  back=0;
  array = new Object[MAX];
 }

 public Object first()
 {
  return array[front];
 }

 public void leave()
 {
  front++;
  if(front==MAX)
     front=0;
 }

 public void join(Object obj)
 {
  array[back++]=obj;
  if(back==MAX)
     back=0;
 }

 public boolean isEmpty()
 {
  return front==back;
 }

}