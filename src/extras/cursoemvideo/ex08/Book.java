package extras.cursoemvideo.ex08;

public class Book implements Publication {
    private String title;
    private String author;
    private int totalPages;
    private int currentPage;
    private boolean open;
    private String reader;

    public Book(String title, String author, int totalPages, Person reader) {
        this.title = title;
        this.author = author;
        this.totalPages = totalPages;
        this.currentPage = 0;
        this.open = false;
        this.reader = reader.getName();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public String getReader() {
        return reader;
    }

    public void setReader(String reader) {
        this.reader = reader;
    }

    public void details(){
        if(isOpen()){
            System.out.println("O livro "+this.getTitle()+", escrito por "+this.getAuthor()+", está sendo lido por "+this.getReader()+" que está atualmente na página "+this.getCurrentPage()+" de "+getTotalPages()+" páginas.");
        } else {
            System.out.println("O livro "+this.getTitle()+", escrito por "+this.getAuthor()+", não está sendo lido.");
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    @Override
    public void open() {
        this.setOpen(true);
    }

    @Override
    public void close() {
        this.setOpen(false);
    }

    @Override
    public void browse(int p) {
        this.currentPage = p;
    }

    @Override
    public void nextPage() {
        this.currentPage++;
    }

    @Override
    public void backPage() {
        this.currentPage--;
    }
}