package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(1, 2);
        System.out.println(myLinkedList.get(1));
        myLinkedList.deleteAtIndex(1);
        System.out.println(myLinkedList.get(1));

//        myLinkedList.addAtHead(2);
//        myLinkedList.addAtHead(1);
//        myLinkedList.addAtTail(4);
//        myLinkedList.addAtTail(5);
//        //myLinkedList.addAtIndex(2, 6);
//        myLinkedList.deleteAtIndex(1);
//
//        for(int i = 1; i <= myLinkedList.getSize(); i++) {
//            System.out.println(myLinkedList.get(i));
//        }
//
//        System.out.println("Head: " + myLinkedList.getHead().getVal());
//        System.out.println("Tail: " + myLinkedList.getTail().getVal());
////        System.out.println(myLinkedList.getSize());
////        System.out.println(myLinkedList.get(1));
////        myLinkedList.addAtTail(5);
////        System.out.println(myLinkedList.get(5));
////        System.out.println(myLinkedList.get(4));
////        System.out.println(myLinkedList.get(2));
////        System.out.println(myLinkedList.getHead().getVal());
////        System.out.println(myLinkedList.getTail().getVal());
////        System.out.println(myLinkedList.getSize());

    }
}
