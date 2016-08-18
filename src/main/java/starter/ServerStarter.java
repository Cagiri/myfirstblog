package starter;

import ninja.standalone.NinjaJetty;
import ninja.utils.NinjaMode;

public class ServerStarter {
	public static void main(String[] args) {
		new NinjaJetty().ninjaMode(NinjaMode.dev).run();
	}
}
