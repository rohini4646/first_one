import java.util.Scanner;
public class PriorityQueue
{
private IntQueueItem[] elements;
privateint size;
public PriorityQUeue(int capacity)
{
elements = new IntQueueItem[capacity];
size = 0;
}
public void enqueue(int item, int priority)
{
if(size == elements.length)
{
System.out.println("Priority queue is full.")
return;
}
else
{
int index = size;
while(index >0 && priority < elements[index -1].priority)
{
elements[index] = elements[index -1];
index--;
}
elements[index] = new IntQueueItem(item, priority);
size++;
}
}
public int dequeue()
{
if (size == 0)
{
System.out.println("Priority queue is empty.");
return 0;
}
else
{
int item = elements[0].item;
for(int i=1; i<size; i++)
{
elements[i-1] = elmenets[i];
}
size--;
return item;
}
}
public void display()
{
if(size == 0)
{
System.out.println("Priority Queue Contents: );
for(int i=0; i<size; i++)
{
System.out.println(elements[i].item + " (Priority : "  + elements[i].priority + " )" );
}
}
private class IntQUeueItem
{
int item;
int priority;
IntQueueItem(int item,int priority)
{
this.item = item;
this.priority = priority;



