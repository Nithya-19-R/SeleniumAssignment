package week1.week1assgnt;

public class Library {
    public void addBook(String bookTitle)
    {
        System.err.println( bookTitle+":Book added successfully");
    }
    public void issueBook()
    {
        System.out.println("Book issued successfully");
    }
    public static void main(String[] args) {
        Library obj=new Library();
        obj.addBook("I lost the World");
        obj.issueBook();        
    }

}
