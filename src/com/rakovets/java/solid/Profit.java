public class Profit {
	private double profit;

	public Profit(double profit) {
		this.profit = profit;
	}

	public double getProfit() {
		return profit;
	}

	public void setProfit(double profit) {
		this.profit = this.profit + profit;
	}
}
