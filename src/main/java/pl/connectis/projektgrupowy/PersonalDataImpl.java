package pl.connectis.projektgrupowy;

public class PersonalDataImpl implements PersonalData {

    private EPersonalDataTyp type;
    private String name;
    private String surname;
    private String emailLogin;
    private String password;

    public PersonalDataImpl(EPersonalDataTyp type, String name, String surname, String emailLogin, String password) {
        this.type = type;
        this.name = name;
        this.surname = surname;
        this.emailLogin = emailLogin;
        this.password = password;

    }

    @Override
    public EPersonalDataTyp getUsersType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public String getEmailLogin() {
        return emailLogin;
    }

    @Override
    public String getPassword() {
        return password;
    }
}

