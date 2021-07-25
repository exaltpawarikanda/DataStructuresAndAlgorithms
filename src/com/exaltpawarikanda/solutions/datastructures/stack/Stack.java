package com.exaltpawarikanda.solutions.datastructures.stack;

public class Stack {

   int stack[]  = new  int[5];
   int top = 0;

    public void push(int value){
        if(top==5){
            System.out.println(" The stack is full");
        }else {
            stack[top] = value;
            top++;
        }
    }

    public int pop(){
        int data=0;
        if(isEmpty()){
            System.out.println("The Stack is empty");
        }else {
            top--;
            data = stack[top];
            stack[top] = 0;
        }
        return data;
    }

    public int peek(){
        int data=0;
        if(isEmpty()){
            System.out.println("The Stack is empty");
        }else {
            data = stack[top - 1];
        }
        return data;
    }

    public int size(){
        if(top == 0){
          return   top;
        }else
            return top;
    }

    public boolean isEmpty(){
        return top <= 0;
    }


    public void show(){
        for(int n : stack) {
            System.out.print(n + "  ");
        }
    }
}
