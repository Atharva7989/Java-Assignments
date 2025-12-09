class Book{
    private String authorName;
    private String bookName;
    public void Setter(String authorName,String bookName){
        this.authorName = authorName;
        this.bookName = bookName;
    }
   public String getTitle() {
        return bookName;
    }
    public String getAuthor() {
        return authorName;
    }
}
class Assignment_three{
        public static void main(String args[]){
            Book b = new Book();
            b.Setter("Atharva","Temp");
            System.out.println(b.getTitle());
            System.out.println(b.getAuthor());
        }
}