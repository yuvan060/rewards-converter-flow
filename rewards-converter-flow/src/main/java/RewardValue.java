
public class RewardValue {
	int milesValue;
	double cashValue;
	public RewardValue(double cashValue) {
		this.cashValue = cashValue;
		this.milesValue = (int) (cashValue / 0.0035);
	}
	RewardValue(int milesValue){
		this.milesValue = milesValue;
		this.cashValue = milesValue * 0.0035;
	}
	public double getCashValue() {
		return cashValue;
	}
	public void setCashValue(double cashValue) {
		this.cashValue = cashValue;
	}
	public int getMilesValue() {
		return milesValue;
	}
	public void setMilesValue(int milesValue) {
		this.milesValue = milesValue;
	}
	
	
}
