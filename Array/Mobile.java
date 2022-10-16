package Array;

public class Mobile {
	
	 String Model_name;
	 int Price;
	 String Storage;


	public Mobile(String model_name, int price, String storage) {
		super();
		Model_name = model_name;
		Price = price;
		Storage = storage;
	}


	public String getModel_name() {
		return Model_name;
	}


	public void setModel_name(String model_name) {
		Model_name = model_name;
	}


	public int getPrice() {
		return Price;
	}


	public void setPrice(int price) {
		Price = price;
	}


	public String getStorage() {
		return Storage;
	}


	public void setStorage(String storage) {
		Storage = storage;
	}


	@Override
	public String toString() {
		return "Mobile [Model_name=" + Model_name + ", Price=" + Price + ", Storage=" + Storage + "]";
	}
	

	

}
