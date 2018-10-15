public class PublicPrivateProtectedClass {
	public String publicvar;
	private String privatevar;
	protected String protectedvar;

	public PublicPrivateProtectedClass() {
		publicvar = "this is public";
		privatevar = "this is private";
		protectedvar = "this is protected";
	}

	public String getPrivateVar() {
		return privatevar;
	}
}