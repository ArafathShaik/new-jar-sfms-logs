 package test;

import java.util.List;
import com.beust.jcommander.internal.Lists;
import org.testng.TestNG;
import org.testng.TestListenerAdapter;

public class DarazSearchTest {
	public static void main(String[] args) throws InterruptedException {
		maincode();
	}

	public static void maincode() {
		TestListenerAdapter tla = new TestListenerAdapter();
		TestNG testng = new TestNG();
		List<String> suites = Lists.newArrayList();
		suites.add(System.getProperty("user.dir") + "//testng.xml");
		testng.setTestSuites(suites);
		testng.addListener(tla);
		testng.run();
	}
}
