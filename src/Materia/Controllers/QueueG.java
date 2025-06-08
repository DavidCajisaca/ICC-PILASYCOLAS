package Materia.Controllers;



import java.util.EmptyStackException;

import Materia.Model.NodeGeneric;

public class QueueG<T> {
  private NodeGeneric<T> head;
private NodeGeneric<T> tail;
public QueueG () {
    this.head = null;
    this.tail = null;
}
public void add (T value){
    NodeGeneric<T> newNode =  new NodeGeneric<>(value);
    if(isEmpty()){
        head = newNode;
        tail = newNode;
    }else{
        tail.setNext(newNode);
        tail = newNode;
    }
}
public T remove(){
    if(isEmpty()){
        throw new EmptyStackException();
    }
    T aux = head.getValue();
    head = head.getNext();
    return aux;
}
public T peek(){
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
    NodeGeneric<T> current = head;
    while (current != null) {
        count++;
        current = current.getNext();
    }
    return count;

}
public void printQueue() {
    NodeGeneric<T> current = head;
    while (current != null) {
        System.out.print(current.getValue() + " ");
        current = current.getNext();
    }
    System.out.println();
}
public Persona findByname(String string) {
    NodeGeneric<T> current = head;
    while (current != null) {
        if (current.getValue() instanceof Persona) {
            Persona persona = (Persona) current.getValue();
            if (persona.getNombre().equals(string)) {
                return persona; 
            }
        }
        current = current.getNext();
    }
    return null; 
}


}


