package web.servis;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class ServisCarsImpl implements ServisCars {
	private List<Car> car = Arrays.asList(
			new Car("Lada","Baclajan",99),
			new Car("BMW","SLC",5),
			new Car("Honda","Cevic",7),
			new Car("Opel","Corsa",-1),
			new Car("kIA","Soliaris",2),
			new Car("Acura","MDX",2));

	@Override
	public List<Car> getCarCount(int count) {
		if (count >= car.size()) {
			return car;
		}
		return car.subList(0, count);
	}
}
