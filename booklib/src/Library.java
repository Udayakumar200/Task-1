class Library {
    private Book[] books;

    public Library(int capacity) {
        this.books = new Book[capacity];
    }

    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                System.out.println("Book added successfully!");
                return;
            }
        }
        System.out.println("Library is full. Cannot add more books.");
    }

    public void removeBook(int bookID) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getBookID() == bookID) {
                books[i] = null;
                System.out.println("Book removed successfully!");
                return;
            }
        }
        System.out.println("Book not found in the library.");
    }

    public void searchBook(int bookID) {
        for (Book book : books) {
            if (book != null && book.getBookID() == bookID) {
                book.displayBook();
                return;
            }
        }
        System.out.println("Book not found in the library.");
    }

    public void displayBooks() {
        System.out.println("Library Books:");
        for (Book book : books) {
            if (book != null) {
                book.displayBook();
            }
        }
    }
}
