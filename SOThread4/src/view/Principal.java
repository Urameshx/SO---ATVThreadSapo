package view;

import controller.Thread_controller;

public class Principal {

	public static void main(String[] args) {
		int dist_max = 100;
		
		Thread_controller sapo_1 = new Thread_controller(dist_max);
			sapo_1.start();
		Thread_controller sapo_2 = new Thread_controller(dist_max);
			sapo_2.start();
		Thread_controller sapo_3 = new Thread_controller(dist_max);
			sapo_3.start();
		Thread_controller sapo_4 = new Thread_controller(dist_max);
			sapo_4.start();
		Thread_controller sapo_5 = new Thread_controller(dist_max);
			sapo_5.start();
	}
}