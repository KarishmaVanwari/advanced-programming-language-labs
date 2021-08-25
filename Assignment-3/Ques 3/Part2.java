
interface Pages{
    public void numberOfPages();
}

interface Books extends Pages{
    public void bookName();
    public void author();

}

class Library implements Books{
    public void bookName(){
        System.out.println("Book: Dear Stranger, I know how you feel");
    }

    public void author(){
        System.out.println("Author: Ashish Bagrecha");
    }

    public void numberOfPages(){
        System.out.println("Number of pages: 150");

    }
} 

public class Part2 {

    public static void main(String[] args) {
        Library lib = new Library();
        lib.bookName();
        lib.author();
        lib.numberOfPages();
    }
    
}
