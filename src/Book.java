import sun.awt.im.SimpleInputMethodWindow;

import java.util.*;

/**
 * Created by Rayson on 9/22/17.
 */
public class Book {

    public static void main (String[] args){

        System.out.println("<---Your address book--->");

        List<Contact> thecontacts = new ArrayList<Contact>();

        Contact<Contact> Duo = new Contact<>("jerry",3473473470L);
        Contact<Contact> Solo = new Contact<>("Johnny",2463473470L);

        /**
        Use create contact method rather than creating a specific contact.
        This contact is a test.
        after creating the contact, add it to array list then print array
        **/

            thecontacts.add(Duo);
            thecontacts.add(Solo);
            System.out.println(thecontacts.toString());

        ContactWindow createContact = new ContactWindow();



        //thecontacts.remove(Duo);
        //Prints from print C method    Duo.printC();
        //ArrayList.listToString(thecontacts.toArray());
        //Add a GUI for easy addressbook entry



    }
}
