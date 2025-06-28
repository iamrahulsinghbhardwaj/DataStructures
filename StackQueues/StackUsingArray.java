package StackQueues;

public class StackUsingArray {
    //Push,Pop,size,isEmpty,topElement
    private int data[];
    private int top=-1;

    StackUsingArray(){
        data=new int[10];
        top=-1;
    }

    StackUsingArray(int capacity){
        data=new int[capacity];
        top=-1;
    }

    public boolean IsEmpty(){
        return (top==-1);
    }

    public int Size(){
        return top+1;
    }

    public int Top(){
        if(Size()<=0){
            return -1;
        }
        return data[top];
    }

    public void Push(int element){
        if(data.length==Size()){
            DoubleCapacity();
        }
        top++;
        data[top]=element;
    }

    public void DoubleCapacity(){
        int temp[]=data;
        data=new int[2*Size()];

        for(int i=0;i<=top;i++){
            data[i]=temp[i];
        }
    }

    public int POP(){
        if(Size()==0){
            return -1;
        }

        int temp=data[top];
        data[top]=0;
        top--;
        return temp;
    }

}
