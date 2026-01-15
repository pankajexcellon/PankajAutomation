
package TNG;

import org.testng.SkipException;

public class Skipexception {

	public Skipexception() {
		boolean serverDown = true;

		if (serverDown) {
			throw new SkipException("Skipping because server is down");
		}
	}
}