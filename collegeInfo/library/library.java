package collegeInfo.library;

public class library {
    private int numOfBooks;

    public library(int numOfBooks) {
        this.numOfBooks = numOfBooks;
    }

    public int displayNumOfBooksAfter_2_booksIssued() {
        return this.numOfBooks - 2;
    }
}
