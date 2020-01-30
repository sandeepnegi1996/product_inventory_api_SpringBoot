package sandy.entity;

public class Product {
	
	private int pid;
	private String pName;
	private int PQuantity;
	public Product(int pid, String pName, int pQuantity) {
		super();
		this.pid = pid;
		this.pName = pName;
		PQuantity = pQuantity;
	}
	
	
	public Product(){
		
	}


	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public String getpName() {
		return pName;
	}


	public void setpName(String pName) {
		this.pName = pName;
	}


	public int getPQuantity() {
		return PQuantity;
	}


	public void setPQuantity(int pQuantity) {
		PQuantity = pQuantity;
	}
	
	

}
