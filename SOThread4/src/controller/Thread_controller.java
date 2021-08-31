package controller;

public class Thread_controller extends Thread {
	private int dist_max; 
	private int dist_falt;
	public int dist_perco = 0;
	private double temp_inicial;
	private double temp_final;
	public double temp_exec;
	/*DISTANCIA MAXIMA, DISTANCIA FALTANTE, DISTANCIA PERCORRIDA,
	TEMPO INICIAL, TEMPO FINAL, TEMPO DE EXECUCAO */
	
	public Thread_controller(int dist_max) {
		this.dist_max = dist_max;
	}
	
	@Override
	public void run() {
		temp_inicial = System.nanoTime();
		
		do {
			salto();
			try {
				sleep(4000);
			} catch (Exception error) {
				
			}
		} while (dist_perco < dist_max);
		
		temp_final = System.nanoTime();
		temp_exec = (temp_final - temp_inicial) / (10 ^ 9);
		
		System.out.println("CORRIDA FINALIZADA! O sapo nº: " + getId() + " terminou em:  " + 
		temp_exec  + " ns e percorreu um total de: " + dist_perco + "metros");
	}

	private void salto() {
		int salto = (int) ((Math.random() * dist_max) + 1);
		dist_perco += salto;
		dist_falt = dist_max - dist_perco;
		
		System.out.println("O sapo nº:" + getId() + ", saltou " + salto + "metros. "
				+ "Agora restam " + dist_falt + " metros. Foram percorridos =  " 
				+  dist_perco + " metros");	
	}
}