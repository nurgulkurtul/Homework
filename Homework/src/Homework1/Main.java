package Homework1;

public class Main {

	public static void main(String[] args) {
		

		Metod metod =new Metod();
		
		CalisanBilgileri bilgiler= new CalisanBilgileri("ayşe", 3000, 45, 2000);
		
		metod.bilgileriGoster(bilgiler);
	}

}
