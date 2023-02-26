package Homework1;

public class Metod {
	
	public double tax(CalisanBilgileri calisanBilgileri) {
		double vergi=0;
		if (calisanBilgileri.getSalary()>40) {
			vergi=calisanBilgileri.getSalary()*0.5;
		}
		return vergi;
	}
	
	public int bonus(CalisanBilgileri calisanBilgileri) {
		int bns=0;
		if(calisanBilgileri.getWorkHours()>40) {
			bns=(calisanBilgileri.getWorkHours()-40)*30;
		}
		return bns;
	}

	public double raiseSalary(CalisanBilgileri calisanBilgileri) {
		double zam=0;
		int yil=2022-calisanBilgileri.getHireYear();
		if (yil<10 ) {
			zam=calisanBilgileri.getHireYear()*5/100;
		}else if(yil>10 && yil<20) {
			zam=calisanBilgileri.getHireYear()*10/100;
		}else if (yil>20) {
			zam=calisanBilgileri.getHireYear()*15/100;
		}
		return zam;
	}
	
	public void bilgileriGoster(CalisanBilgileri calisanBilgileri) {
		System.out.println("Adı:" + calisanBilgileri.getName() +"\nMaaşı: " + calisanBilgileri.getSalary() + "\nÇalışma Saati" + calisanBilgileri.getWorkHours() 
							+ "\nBaşlangıç Yılı: " + calisanBilgileri.getHireYear() + "\nVergi: " + tax(calisanBilgileri) + "\nBonus:" + bonus(calisanBilgileri) 
							+ "\nMaaş Artışı: " + raiseSalary(calisanBilgileri) + "\nVergi ve bonuslar ile birlikte maaşı" + (calisanBilgileri.getSalary()+tax(calisanBilgileri)+ bonus(calisanBilgileri)) 
							+ "\ntoplam maaşı" + (calisanBilgileri.getSalary()+ tax(calisanBilgileri)+bonus(calisanBilgileri)+ raiseSalary(calisanBilgileri)));
	}
}
