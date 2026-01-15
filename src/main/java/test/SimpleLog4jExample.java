//package test;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//
//public class SimpleLog4jExample {
//
//	private static final Logger logger = LogManager.getLogger(SimpleLog4jExample.class);
//
//	public static void main(String[] args) {
//
//		logger.info("Application started");
//
//		int a = 10;
//		int b = 2;
//
//		try {
//			int result = a / b;
//			logger.info("Result is: " + result);
//		} catch (Exception e) {
//			logger.error("Exception occurred while dividing numbers", e);
//		}
//
//		logger.info("Application finished");
//	}
//}