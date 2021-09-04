package manage;


	import java.util.*;
	public class PhoneBook
	{
	    private List<contact1> phoneBook=new ArrayList<contact1>();
	    public void setPhoneBook(List<contact1>obj)
	    {
	        phoneBook=obj;
	    }
	    public List<contact1>getPhoneBook()
	    {
	        return phoneBook;
	    }
	    public void addContact(contact1 contactObj)
	    {
	        phoneBook.add(contactObj);
	    }
	    public List<contact1> viewAllContacts()
	    {
	        return phoneBook;
	    }
	    public contact1 viewContactGivenPhone(long phoneNumber)
	    {
	        contact1 obj=new contact1();
	        for(contact1 obj1:phoneBook)
	        {
	            if(obj1.getPhoneNumber()==phoneNumber)
	            {
	                obj=obj1;
	            }
	        }
	        return obj;
	    }
	    public boolean removeContact(long phoneNumber)
	    {
	        boolean f=false;
	        for(contact1 obj:phoneBook)
	        {
	            if(obj.getPhoneNumber()==phoneNumber)
	            {
	                f=true;
	                phoneBook.remove(obj);
	                break;
	            }
	        }
	        return f;
	    }
	}


