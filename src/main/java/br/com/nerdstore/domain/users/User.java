package br.com.nerdstore.domain.users;

public class User {
    private String name;
    private String email;

    public void printInfo() {
        System.out.printf("Nome: %s%nEmail: %s%n", this.name, this.email);
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
