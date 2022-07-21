
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;


public class TesteCampoTreinamento {
	
	@Test
	public void testeTextoFiel() {
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");		
		driver.findElement(By.id("elementosForm:nome")).sendKeys("teste de escrita");
		Assert.assertEquals("teste de escrita", driver.findElement(By.id("elementosForm:nome")).getAttribute("value"));
	
		
	//	driver.quit();
	}
	
	@Test
	public void deveinteragirComTextoArea() {
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("teste");
		Assert.assertEquals("teste", driver.findElement(By.id("elementosForm:sugestoes")).getAttribute("value"));
			
		driver.quit();
	}
	
	@Test
	public void deveinteragirComRadioButton() {
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		driver.findElement(By.id("elementosForm:sexo:1")).click();
		Assert.assertTrue(driver.findElement(By.id("elementosForm:sexo:1")).isSelected());
		
		driver.quit();

}
	
	@Test
	public void deveinteragirComcheckBox() {
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		driver.findElement(By.id("elementosForm:comidaFavorita:2")).click();
		Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:2")).isSelected());
		
		driver.quit();

}
	
	@Test
	public void deveinteragirComCombo() {
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		WebElement element = driver.findElement(By.id("elementosForm:escolaridade"));
		Select combo = new Select(element);
	//	combo.selectByIndex(2); pelo número da palavra ex 0,1, 2
	//	combo.selectByValue("superior"); pelo nome especifico no código
		combo.selectByVisibleText("Mestrado"); // ele produra ou digita o nome
		
		Assert.assertEquals("Mestrado",combo.getFirstSelectedOption().getText());
	
		driver.quit();
}
	
	@Test
	public void deveinteragircomobotao() {
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
	//	driver.findElement(By.id("buttonSimple")).click();
		WebElement botao = driver.findElement(By.id("buttonSimple"));
		botao.click();
		
		Assert.assertEquals("Obrigado!", botao.getAttribute("Value"));
		
	}
	
	@Test
	public void deveinteragircomlink() {
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		driver.findElement(By.linkText("Voltar")).click();
	
	}
	
	@Test
	public void deveBuscarTextoNaPagina() {
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		
	//	Assert.assertTrue(driver.findElement(By.tagName("body"))
	//			.getText().contains("Campo de Treinamento"));
		
		Assert.assertEquals("Campo de Treinamento", 
				driver.findElement(By.tagName("h3")).getText());
		
		Assert.assertEquals("Cuidado onde clica, muitas armadilhas...", 
				driver.findElement(By.tagName("span")).getText());
		
		
		driver.quit();
	}
}
