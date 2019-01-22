public class Contact {
    private String name;
    private String phoneNumber;
    private String email;

    public Contact (String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public String getName(){
        return this.name;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public String getEmail(){
        return this.email;
    }
    public void editName(String newName){
        this.name = newName;
    }
    public void editPhoneNumber(String newPhoneNumber){
        this.phoneNumber = newPhoneNumber;
    }
    public void editEmail(String newEmail){
        this.email = newEmail;
    }

}
