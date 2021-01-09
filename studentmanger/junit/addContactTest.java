package junit;



import DAO.addContact;

public class addContactTest {


    public void testAddblacklist() {
        addContact a =new addContact();a.addblacklist("");
    }


    /*public void add() {

        for(int i=0;i<1000;i++)
        {
            addContact a =new addContact();
            a.add("sbz"+i);
        }
    }*/



    public void testPanduanblacklist() {
        addContact a =new addContact();a.panduanblacklist("fa");

    }


    public void testDelete() {
        addContact a =new addContact();a.delete("fas");
    }


    public void testLookblacklist() {
        addContact a =new addContact();a.lookblacklist("bca");
    }

}
