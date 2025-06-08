package Materia.Controllers;

import Materia.Model.Node;

public class Stack {
private Node top;
private int size;
    public Stack() {
        this.top = null;
        this.size = 0;
    }

    public int push(int value) {
        Node newNode = new Node(value);
        if (top == null) {
            top = newNode;
        } else {
            newNode.setNext(top);
            top = newNode;
        }
        size++;
        return size;
    }

    public int pop() {
        if (top == null) {
            return -1; // or throw an exception
        }
        int value = top.getValue();
        top = top.getNext();
        size--;
        return value;
    }

    public int peek() {
        if (top == null) {
            return -1; // or throw an exception
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
        Node current = top;
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}
