import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestAutomate {

	public static void main(String[] args) {
			
		System.setProperty("webdriver.chrome.driver","C:\\Users\\2903347281\\Desktop\\Chrome Driver\\chromedriver.exe");
		
		ChromeDriver browser = new ChromeDriver();
		browser.get("https://www.casasbahia.com.br/");
		
		WebElement Entreoucadastre = browser.findElement(By.id("lnkCadastreSe"));
		Entreoucadastre.click();
		
		WebElement DigiteCPF = browser.findElement(By.id("CpfCnpj"));
		DigiteCPF.sendKeys("446.763.328-66");
		
		WebElement Continuar = browser.findElement(By.id("btnContinuarLogin"));
		Continuar.click();
		
		browser.get("https://www.casasbahia.com.br/");
							
		WebElement Entreoucadastre1 = browser.findElement(By.id("lnkCadastreSe"));
		Entreoucadastre1.click();
			
		WebElement DigiteCPF1 = browser.findElement(By.id("CpfCnpj"));
		DigiteCPF1.sendKeys("555.555.555-55");
			
		WebElement Continuar1 = browser.findElement(By.id("btnContinuarLogin"));
		Continuar1.click();
		
		browser.get("https://www.casasbahia.com.br/");
			
		WebElement Entreoucadastre11 = browser.findElement(By.id("lnkCadastreSe"));
		Entreoucadastre11.click();
			
		WebElement DigiteCPF11 = browser.findElement(By.id("CpfCnpj"));
		DigiteCPF11.sendKeys("444.226.058-36");
			
		WebElement Continuar11 = browser.findElement(By.id("btnContinuarLogin"));
		Continuar11.click();
			
		WebElement Nomecomp = browser.findElement(By.className("sc-fzXfOX bKdHqA"));
		Nomecomp.sendKeys("Alexandre");
			
		WebElement Celular = browser.findElement(By.id("input-phone"));
		Celular.sendKeys("11111111111");
			
		WebElement Nascimento = browser.findElement(By.id("input-date"));
		Nascimento.sendKeys("01012020");
			
		WebElement Email = browser.findElement(By.id("input-email"));
		Email.sendKeys("alexandre.santi.com");
		
		
		browser.close();
		
		
		
	}}
			
		

			

		
		
					
						


