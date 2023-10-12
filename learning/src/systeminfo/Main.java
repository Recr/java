package systeminfo;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		
		Locale currentLocale = Locale.getDefault();
		System.out.print("Your System language is: ");
		System.out.println(currentLocale.getDisplayLanguage());
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		System.out.println("Your screen resolution is: " + width + " x " + height);
		
	}
}
