package br.com.portoseguro.connection;

import io.appium.java_client.android.AndroidDriver;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

public class ConnectionAppium {

	public static AndroidDriver<?> driver;

	private static String app = "C:/Users/yohan/Desktop/WorkSpace/portoseguro.apk";
	private static String platformName = "ANDROID";
	private static String deviceName = "portoseguro";
	private static boolean fullReset = false;
	private static boolean noReset = true;


	private static String appiumServer = "http://127.0.0.1:4723/wd/hub";

	@SuppressWarnings("rawtypes")
	public static AndroidDriver APPConfig() throws Exception {

		DesiredCapabilities capacidade = new DesiredCapabilities();
		capacidade.setCapability("app", app);
		capacidade.setCapability("platformName", platformName);
		capacidade.setCapability("deviceName", deviceName);
		capacidade.setCapability("fullReset", fullReset);
		capacidade.setCapability("noReset", noReset);
		

		driver = new AndroidDriver(new URL(appiumServer), capacidade);
		Thread.sleep(3000);
		
		return driver;
	}

}
