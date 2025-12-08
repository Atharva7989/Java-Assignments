class Book{
    String title;
    String author;
    Book(String title,String author){
        this.title = title;
        this.author=author;
    }
    public void displayInfo(){
        System.out.println(this.title);
        System.out.println(this.author);
    }
}
    class Assignment_one{
        public static void main(String args[]){
            Book b = new Book("Lord of the rings","Atharva");
            b.displayInfo();
        }
    }
