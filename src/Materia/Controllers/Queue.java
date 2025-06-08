package Materia.Controllers;

import java.util.EmptyStackException;

import Materia.Model.Node;

public class Queue {
private Node head;
private Node tail;
public Queue () {
    this.head = null;
    this.tail = null;
}
public void add (int value){
    Node newNode = new Node(value);
    if(isEmpty()){
        head= newNode;
        tail= newNode;
    }else{
        tail.setNext(newNode);
        tail = newNode;
    }
    }
public int remove(){
    if(isEmpty()){
        throw new EmptyStackException();
    }
    int aux = head.getValue();
    head = head.getNext();
    return aux;
}
public int peek(){
    if(isEmpty()){
        throw new EmptyStackException();
    }
    return head.getValue();
}
public boolean isEmpty() {
    return head == null;
}
public int size(){
    int count = 0;
    Node current = head;
    while (current != null) {
        count++;
        current = current.getNext();
    }
    return count;

}
}
