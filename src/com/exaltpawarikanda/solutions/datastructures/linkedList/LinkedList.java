package com.exaltpawarikanda.solutions.datastructures.linkedList;

public class LinkedList {

    Node head;

    public void insert(int value){

        Node node = new Node();
        node.value = value;
        node.reference = null;

        if(head == null){
            head = node;
        }
        else{
            Node n = head;
            while(n.reference != null){
                n = n.reference;
            }
            n.reference = node;
        }
    }

    public void insertAtStart(int value){
        Node node = new Node();
        node.value = value;
        node.reference = null;

        node.reference= head;
        head = node;
    }

    public void insertAt(int index, int value) {
        Node node = new Node();
        node.value = value;
        node.reference = null;

        if (index == 0) {
            insertAtStart(value);
        } else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.reference;
            }
            node.reference = n.reference;
            n.reference = node;

        }
    }

    public void deleteAt(int index){
        if (index == 0) {
            head = head.reference;
        } else {
            Node n = head;
            Node n1 = null;
            for (int i = 0; i < index - 1; i++) {
                n = n.reference;
            }
            n1 = n.reference;
            n.reference = n1.reference;
            n1 = null;
        }
        }




    public void show(){
        Node n = head;
            while(n.reference != null){
                System.out.println(n.value);
                n = n.reference;
            }
                 System.out.println(n.value);
        }



    
}
