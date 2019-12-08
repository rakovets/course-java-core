package com.rakovets.java.task.collections.list;

public class GarageDemo {
	public static void main(String[] args) {
		CarJapan carJapan1 = new CarJapan("NISSAN", "Murano", "Orange", 2012, 78523);
		CarJapan carJapan2 = new CarJapan("TOYOTA", "Camry", "White", 2013, 84325);
		CarSouthKorea carSouthKorea1 = new CarSouthKorea("HYUNDAI", "Sonata", "Gray", 2016, 12234);
		CarSouthKorea carSouthKorea2 = new CarSouthKorea("KIA", "Niro", "Green", 2014, 23452);
		CarUSA carUSA1 = new CarUSA("DODGE", "Challenger", "Red", 2017, 12329);
		CarUSA carUSA2 = new CarUSA("DODGE", "Journey", "White", 2019, 87321);
		CarEurope carEurope = new CarEurope("RENAULT", "Alpine", "blue", 2018, 82365);
		Garage garage = new Garage();

		garage.park(carJapan1, 4);
		garage.park(carSouthKorea2, 1);
		garage.park(carEurope, 2);
		garage.park(carUSA1, 8);
		garage.park(carUSA2, 2);
		garage.leave(carUSA1, 3);
		garage.getCountString();
		garage.getCountBrand("DODGE");
		garage.getCountBrandAndModel("NISSAN", "Murano");

	}
}
