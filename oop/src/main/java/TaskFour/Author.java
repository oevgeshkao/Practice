package TaskFour;

public class Author {
    private String name;
    private String gender;
    private String email;

    public Author(String name, String gender, String email) {
        this.name = name;
        this.gender = gender;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Name: " + name + " \nGender: " + gender + " \nEmail: " + email;
    }
}
