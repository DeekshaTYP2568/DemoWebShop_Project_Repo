package shoppingcart;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.tricentis.genericutility.BaseClass;

public class TC_DWS_004_Test extends BaseClass{
	@Test
	public void removeFromCart() {
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
		driver.findElement(By.xpath("//input[@name='updatecart']")).click();
		driver.findElement(By.xpath("//div[@class='order-summary-content']"));
	}

}
