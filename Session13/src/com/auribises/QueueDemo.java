package com.auribises;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		for(int i=10;i>0;i--){
			queue.add(i);
		}
		
		// (head)10 9 8 7 6 5 4 3 2 1(tail)
		
		// PQ: Sorts the data
		// (head)1 2 3 4 5 6 7 8 9 10(tail)
		
		//System.out.println(queue.peek()); // returns the head
		//System.out.println(queue.peek());
		
		/*System.out.println(queue.size());
		
		System.out.println(queue.poll()); // remove the head and return it back
		System.out.println(queue.poll());
		
		System.out.println(queue.size());*/
		
		for(int i=0;i<queue.size();i++){
			System.out.println(queue.poll());
		}
	}

}
