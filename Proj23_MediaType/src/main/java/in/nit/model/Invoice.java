package in.nit.model;
public class Invoice{
	private Integer code;
	private String vender;
	private double cost;
	
	public Invoice(Integer code, String vender, double cost) {
		super();
		this.code = code;
		this.vender = vender;
		this.cost = cost;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getVender() {
		return vender;
	}
	public void setVender(String vender) {
		this.vender = vender;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Invoice [code=" + code + ", vender=" + vender + ", cost=" + cost + "]";
	}
	
}