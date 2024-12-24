package hibernateEx2;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class car {
	@Id
	int id;
	String carname;
	double carprice;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public double getCarprice() {
		return carprice;
	}
	public void setCarprice(double carprice) {
		this.carprice = carprice;
	}
	public car(int id, String carname, double carprice) {
		super();
		this.id = id;
		this.carname = carname;
		this.carprice = carprice;
	}
	public car() {
		super();
	}
	@Override
	public String toString() {
		return "car [id=" + id + ", carname=" + carname + ", carprice=" + carprice + "]";
	}
	

}
