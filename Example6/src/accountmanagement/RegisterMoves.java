package accountmanagement;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class RegisterMoves {
	private String type;
	private Double money;
	private LocalDate date;
	private LocalTime time;
	public RegisterMoves(String type, Double money) {
		this.type = type;
		this.money = money;
		this.date = LocalDate.now();
		this.time = LocalTime.now();
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	
}
