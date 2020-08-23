package projeto2;

public class NoArvore {
	public String por, ing;
	public NoArvore L, R;

	public NoArvore(String i, String p) {
		por = p;
		ing = i;
		L = null;
		R = null;
	}

	public NoArvore() {
		L = null;
		R = null;
	}
}