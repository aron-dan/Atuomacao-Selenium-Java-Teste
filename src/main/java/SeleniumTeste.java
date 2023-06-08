import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Scanner;
public class SeleniumTeste {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\GitRepo\\Automatização Selenium Java Teste\\chromedriver.exe");
	    ChromeOptions chromeOptions = new ChromeOptions();
	    chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
	    WebDriver driver = new ChromeDriver(chromeOptions);
	    Scanner sc = new Scanner(System.in);
	    DadosUsuario dadosUsuario = new  DadosUsuario();
	    String email, senha;
	    
	    
	    System.out.println("Digite o seu email do OTRS");
	    email = dadosUsuario.coletadados();
	    
	    System.out.println("Digite o sua senha do OTRS");
	    senha = dadosUsuario.coletadados();
	    
	    

	    try {
	    	driver.get("https://google.com");
	    	Thread.sleep(5000);
	    }
	    catch (Exception e){
	    	System.out.println("Deu ruim");
	    }
	    finally {
	    	
	    	driver.quit();
	    }
	    sc.close();
	}
	

}

