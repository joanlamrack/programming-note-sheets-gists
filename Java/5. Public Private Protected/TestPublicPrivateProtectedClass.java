public class TestPublicPrivateProtectedClass {
	public static void main(String[] args) {
		PublicPrivateProtectedClass privateAndPublic = new PublicPrivateProtectedClass();

		System.out.println("Public Var is ==>" + privateAndPublic.publicvar);
		System.out.println("Private var is ==>" + privateAndPublic.getPrivateVar());

		SubClassPublicPrivateProtectedClass protectedVar = new SubClassPublicPrivateProtectedClass();
		System.out.println("Protected var is ==>" + protectedVar.protectedvar);
	}
}