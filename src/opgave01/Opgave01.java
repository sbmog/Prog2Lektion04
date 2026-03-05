package opgave01;

import opgave01.models.Vault;

public class Opgave01 {
    public static void main(String[] args) {
        Vault<Integer> vault = new Vault<>(42, "My password");
        int secret = vault.getSecret("My password");

        System.out.println(secret);
    }
}
