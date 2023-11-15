public class App {
    public static void main(String[] args)  {
        Book book1 = new Book("1984", "George Orwell", 1949);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);

        System.out.println(book1); //OUTPUT Title: 1984, Author: George Orwell, Year Published: 1949, Available: true
                                   //COMMENT: The toString() method is called
        System.out.println(book2); //OUTPUT: Title: To Kill a Mockingbird, Author: Harper Lee, Year Published: 1960, Available: true
                                   //COMMENT: The toString() method is called

        book1.borrowBook(); //OUTPUT: Book borrowed 
                            //COMMENT: The borrowBook() method of book1 is called, changing its availability and printing a message.
        book1.borrowBook(); //OUTPUT: Book is not available 
                            //COMMENT: The borrowBook() method of book1 is called but it has already been checked out, so its status does not change. Then prints a message.
       
        System.out.println(book1); //OUTPUT Title: 1984, Author: George Orwell, Year Published: 1949, Available: false
                                   //COMMENT: The toString() method is called
        System.out.println(book2); //OUTPUT: Title: To Kill a Mockingbird, Author: Harper Lee, Year Published: 1960, Available: true
                                   //COMMENT: The toString() method is called

        book1.returnBook(); //OUTPUT: Book returned 
                            //COMMENT: The returnBook() method of book1 is called, changing its availability and printing a message.
        book2.borrowBook(); //OUTPUT: Book borrowed
                            //COMMENT: The borrowBook() method of book2 is called, changing its availability and printing a message.

        System.out.println(book1); //OUTPUT Title: 1984, Author: George Orwell, Year Published: 1949, Available: true
                                   //COMMENT: The toString() method of book1 shows it is available again after being returned.
        System.out.println(book2); //OUTPUT: Title: To Kill a Mockingbird, Author: Harper Lee, Year Published: 1960, Available: false
                                   //COMMENT: The toString() method of book2 shows it is now unavailable after being borrowed.
    } 
}
