import com.sun.glass.ui.Size;
import com.sun.xml.internal.ws.wsdl.writer.document.Import;
import java.util.*;
public class PersonalArray {
    static Personal[] iden = new Personal[100];
    static int i = 0;

    public static void main(String[] args) {
        callMenu();
    }
    public static void callMenu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int select;
            System.out.println("1. Add Personal Record");
            System.out.println("2. View Personal Record");
            System.out.println("3. Update Personal Record");
            System.out.println("4. Delete Personal Record");
            System.out.println("0. Exit");
            select = sc.nextInt();
            switch (select) {
                case 1:
                    addPersonal(iden);
                    break;
                case 2:
                    viewPersonal(iden);
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Please enter Full name");
                    Scanner reader = new Scanner(System.in);
                   reader.nextLine();
                    find(reader.nextLine());
                case 0:
                    return;
                default:
                    System.out.println("Invalid Option");
            }
        }

    }
    public static int getSize()
    {
      return getSize();//* int lengthArray= Size(Personal[] iden);*/

    }

    public static String find(final String fullName)
    {

        if(fullName.indexOf("") == -1) {
            System.out.println("String not Found!");
        }
        else {
            System.out.println("fullName found at: " + fullName.indexOf("String"));
        }
        /*Returns name if found and null if not found.*/
        return find(fullName);
    }

    public static String[] findAll()
    {
        /*Returns all names in a new array*/
        return findAll();
    }

public static boolean update(final String original, final String updatedName) {
/*Should find a name and replace it with new fullName if available. Returns true if name was found and updated
with the new name. False if name could not be updated because name wasn’t found or name was found but an
existing name matching the updatedName already exists.*/
    return update(original,updatedName);
}

    public static String[] findByFirstName(final String firstName) {
      /*  Searches the array trying to find all names that has passed in first name.Returns a String array containing all
        matches.*/
        return findByFirstName(firstName);
    }

    public static String[] findByLastName(final String lastName) {
   /* Searches the array trying to find all names that has passed in last name. Returns a String array containing all
    matches.   (Optional because of difficulty)
*/
        return findByLastName(lastName);
    }

    public static boolean remove(final String fullName) {
    /*Should remove a name from the array. Returns true if name was removed and false if the name was not
    removed for some reaso*/
        return remove(fullName);
    }


    public static void clear()
    {
/*Should completely empty the array.*/

    }

    public static boolean add(final String fullName)
    {
        //Should add a new name to the array. Returns true when name was added and false when the array contains
        // the name.
        return add(fullName);
    }



    public static void addPersonal( Personal[] iden) {
        Scanner sc = new Scanner(System.in);

        String firstName, lastName;

        int addMore;

        do {
            System.out.println(" Enter FirstName");
            firstName = sc.nextLine();

            System.out.println(" Enter LastName ");
            lastName = sc.nextLine();
            System.out.println(firstName + " " + lastName );

            iden[i] = new Personal(firstName, lastName);
            ++i;
            System.out.println("To add another personal name Record Press 1");
            addMore = sc.nextInt();
        } while (addMore == 1);

    }

    public static void viewPersonal(Personal[] iden) {

        for (Personal element : iden) {
            if (null != element) {
                System.out.println("First Name : " + element.getFirstName());
                System.out.println("Last Name : " + element.getLastName());

            }
        }
    }
}

