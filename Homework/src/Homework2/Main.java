package Homework2;

public class Main {

	public static void main(String[] args) {
		
		Takim[] takim=new Takim[3];
		TakimManager takimm= new TakimManager();
		
		takim[0] = new Takim("Real Madrid", 30, 10000);
		takim[1] = new Takim("Barcelona" , 25 ,7000);
		takim[2] = new Takim("Cadiz" , 19 , 1000);

		 Takim takim1, takim2;
		    for (int i = 0; i < takim.length - 1; i++) {
		        takim1 = takim[i];
		        for (int j = i + 1; j < takim.length; j++) {
		            takim2 = takim[j];
					takimm.macYap(takim1,takim2);
		        }
		    }
		    
		    takimm.kasaGoster(takim[0]);
		    takimm.puanDurumu(takim);
		    takimm.iflasDurumu(takim);
		    takimm.sampiyon(takim);
		    
	}

	
}
