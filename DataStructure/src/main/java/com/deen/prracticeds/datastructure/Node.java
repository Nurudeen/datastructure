/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deen.prracticeds.datastructure;

/**
 *
 * @author n-yusuf
 */
public class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }

    int countNumberOfNodes(Node head) {
        int count = 1;
        Node current = head;
        while (current.next != null) {
            current = current.next;

            count++;

        }

        return count;
    }

    public static void main(String[] args) {
        Node value = new Node(2);
        Node node1 = new Node(4);
        Node node2 = new Node(7);
        Node node3 = new Node(8);
        Node node4 = new Node(9);
        Node node5 = new Node(3);

        node1.next  = node2 ;
        node2.next  = node3 ;
        node3.next  = node4 ;
        node4.next  = node5 ;
        
     //   node3  = node2.next ;
        //node4  = node3.next ;
       // node5  = node4.next ;
        System.out.println("Number of node is " + value.countNumberOfNodes(node3));
    }
}
