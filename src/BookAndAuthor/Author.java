package BookAndAuthor;

/**
 * Created by admin on 21.08.2017.
 */
public class Author {
    private String _name;
    private String _email;
    private char _gender;

    public Author(String name, String email, char gender){
        _name = name;
        _email = email;
        _gender = gender;
    }

    public String getName() {
        return _name;
    }

    public String getEmail() {
        return _email;
    }

    public void set_email(String email) {
        _email = email;
    }

    public Character getGender() {
        return _gender;
    }

    public String toString(){
        return String.format("Author[name =%s, email =%s, gender =%c]", _name, _email, _gender);
    }



}
