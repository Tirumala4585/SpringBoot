
public class ApplicationTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		// TODO Auto-generated method stub
		ApringDemo spring = SpringDemo("springBean");
		System.out.println("springDemo");

	}

}
