package StackQueues;

public class QueueUsingArray {
    private int data[];
    private int rear=-1; 
    private int front=-1;
    private int size=0;

    public QueueUsingArray(){
        data=new int[10];
    }

    public QueueUsingArray(int capacity){

    }

    public boolean isEmpty(){
        return size==0;
    }

    public void Enqueue(int element){
        if(size==data.length){

        }

        if(size==0){
            front=0;
        }
        rear++;
        size++;
        data[rear]=element;
    }

    public int DeQueue(){
        if(front==data.length){

        }
        
        int temp=data[front];
        front++;
        size--;
        return temp;
    }
}
