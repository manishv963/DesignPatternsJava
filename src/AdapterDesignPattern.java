
interface WebDriver{
	public void getElement();
	public void selectElement();
}

class ChromeDriver implements WebDriver{

	@Override
	public void getElement() {
		// TODO Auto-generated method stub
		System.out.println("chrome get");	
	}

	@Override
	public void selectElement() {
	System.out.println("chrome select");	
	}
	
}

class IEDriver{
	public void findElement() {
		// TODO Auto-generated method stub
		System.out.println("internet explorer find");	
	}

	public void clickElement() {
	System.out.println("click select in ie");	
	}

	
}

class WebDriverAdapter implements WebDriver{

	IEDriver ieDriver;
	
	public WebDriverAdapter(IEDriver ieDriver) {
		this.ieDriver = ieDriver;
	}
	@Override
	public void getElement() {
		// TODO Auto-generated method stub
		ieDriver.findElement();
	}

	@Override
	public void selectElement() {
		// TODO Auto-generated method stub
		ieDriver.clickElement();
	}
	
}

public class AdapterDesignPattern {
	public static void main(String[] args) {

	IEDriver ie = new IEDriver();
	
	WebDriverAdapter aa = new WebDriverAdapter(ie);
	aa.getElement();
	aa.selectElement();
	}	
	

}
