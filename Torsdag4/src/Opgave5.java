void main(){

    Library library = new Library("Københavns Bibliotek");

    library.addBook(new Book("1984", "George Orwell"));
    library.addBook(new Book("Harry Potter", "J.K. Rowling"));
    library.addBook(new Book("Ringenes Herre", "J.R.R. Tolkien"));
    library.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));
    library.addBook(new Book("Pride and Prejudice", "Jane Austen"));

    library.printAllBooks();

    System.out.println("--- Borrow books ---");
    Book book1 = library.findBookByTitle("1984");
    if(book1 != null){
        book1.borrow();
    }

    Book book2 = library.findBookByTitle("Ringenes Herre");
    if(book2 != null){
        book2.borrow();
    }

    System.out.println();
    System.out.println("--- Available books ---");
    ArrayList<Book> available = library.findAvailableBooks();
    for(Book book : available){
        System.out.println("- " + book);
    }

    System.out.println();
    System.out.println("--- Return books ---");
    if(book1 != null){
        book1.returnBook();
    }

    library.printAllBooks();
}

class Book{
    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void borrow(){
        if(available){
            available = false;
            System.out.println("You have borrowed: " + title + " - " + author);
        }else{
            System.out.println(title + " is not available.");
        }
    }

    public void returnBook(){
        available = true;
        System.out.println("Returned: " + title + " - " + author);

    }

    public String toString(){
        String status = available ? "Available" : "Not available";
        return title + " - Author: " + author + " - Status: " + status;
    }

}

class Library{
    private String libraryName;
    private ArrayList<Book> books;

    Library(String libraryName){
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book){
        if(book != null){
            books.add(book);
            System.out.println("Added: " + book.getTitle() + " to library");
        }
    }

    public ArrayList<Book> findAvailableBooks(){
        ArrayList<Book> available = new ArrayList<>();
        for(Book book : books){
            if(book.isAvailable()){
                available.add(book);
            }
        }
        return available;
    }

    public Book findBookByTitle(String title){
        for(Book book : books){
            if(book.getTitle().equalsIgnoreCase(title)){
                return book;
            }
        }
        return null;
    }

    public void printAllBooks(){
        System.out.println();
        System.out.println("--- " + libraryName + " ---");
        System.out.println("Book List: ");
        for(Book b : books){
            System.out.println("Title: " + b);
        }
        System.out.println();
    }

}