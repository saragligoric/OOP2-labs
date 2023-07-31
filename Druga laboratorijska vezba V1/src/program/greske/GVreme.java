package program.greske;

public class GVreme extends Exception {
	public GVreme() {
		super("Uneli ste brojeve van opsega ili minute koji nisu deljivi sa 15");
	}
}
