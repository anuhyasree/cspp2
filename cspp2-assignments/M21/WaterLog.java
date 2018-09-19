class WaterLog extends Log {
	int quantity;
	WaterLog(int quantity, String date, String time) {
		this.quantity = quantity;
		this.setDate(date);
		this.setTime(time);

	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String toString() {
		System.out.println("Water");
		return "Date:" + this.getDate() + "\n" + "Quantity:" + this.getQuantity() + "ml";
	}
}