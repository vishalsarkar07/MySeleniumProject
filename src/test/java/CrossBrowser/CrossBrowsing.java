package CrossBrowser;

public class CrossBrowsing extends BaseClass {
public static void main(String[] args) {
	BaseClass.preCondition("EdgeDriver");
	driver.get("https://www.ajio.com/");
}
}
