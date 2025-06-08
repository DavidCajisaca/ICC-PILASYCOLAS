package Materia.Controllers;

import Materia.Model.NodeGeneric;

public class StackG<T> {
 private NodeGeneric<T> top;
 private int size;
    public StackG() {
        this.top = null;
        this.size = 0;
    }
    public int push (T value) {
        NodeGeneric<T> newNode = new NodeGeneric<>(value);
        if (top == null) {
            top = newNode;
        } else {
            newNode.setNext(top);
            top = newNode;
        }
        size++;
        return size;
    }
    public T pop() {
        if (top == null) {
            return null; 
        }
        T value = top.getValue();
        top = top.getNext();
        size--;
        return value;
    }
    public T peek() {
        if (top == null) {
            return null; 
        }
        return top.getValue();
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public int getSize() {
        return size;
    }
    public void printStack() {
        NodeGeneric<T> current = top;
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}
