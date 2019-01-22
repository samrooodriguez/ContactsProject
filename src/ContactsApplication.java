
public class ContactsApplication {
    public static void main(String[] args) {
        Contact jim = new Contact("jim","541-601-1169", "jimbo365@yahoo.com");


    }
    public static void showPrompt(){
        System.out.println("1.Display all contacts");
        System.out.println("2.Add a contact");
        System.out.println("3.Search a contact by name");
        System.out.println("4.Delete a contact");
    }

}
