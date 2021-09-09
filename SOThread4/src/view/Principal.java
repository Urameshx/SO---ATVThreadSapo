package view;

import controller.ThreadController;

public class Principal {

	public static void main(String[] args) {
		int dist_max = 100;
		
		ThreadController sapo_1 = new ThreadController(dist_max);
			sapo_1.start();
		ThreadController sapo_2 = new ThreadController(dist_max);
			sapo_2.start();
		ThreadController sapo_3 = new ThreadController(dist_max);
			sapo_3.start();
		ThreadController sapo_4 = new ThreadController(dist_max);
			sapo_4.start();
		ThreadController sapo_5 = new ThreadController(dist_max);
			sapo_5.start();
	}
}
