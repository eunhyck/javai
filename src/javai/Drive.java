package javai;

import javai.model.Benz;
import javai.model.Car;
import javai.model.Gemesis;
import javai.model.Lambor;
import javai.model.Porche;

public class Drive {
	public static void main(String[] args) {
		extracted(new Lambor());
		extracted(new Porche());
		extracted(new Benz());
		extracted(new Gemesis());
	}

	private static void extracted(Car car) {
		car.speedUp(100);
		System.out.println(car.getSpeed());
	}
}
