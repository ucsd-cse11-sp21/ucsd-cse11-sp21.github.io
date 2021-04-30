/*
array of objects of type book
"book1" by "J.T" costing $7
"book2" by "J.T" costing $3
"book3" by "B.A" costing $5
"book4" by "C.D" costing $2

Using this method, write a program that prints the four books


Filtering using arguments --author 
followed by a secondogram prints the total price of all the books 
*/
class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;


    }

    String Totext(){
        return this.title + " by " + this.author + ", $" +this.price;
    }
}


class Discussion05 {

    public static void main(String[] args){

        Book[] books = {
            new Book("book1", "J.T", 7.0),
            new Book("book2", "J.T", 3.0),
            new Book("book3", "B A", 5.0),
            new Book("book4", "C.D", 2.0),
            
        };

        if(args.length == 0){
            for(Book b : books){
                System.out.println(b.Totext());
            }
        }
        else if(args[0].equals("--author")){
            for(Book b :books){
                if(b.author.equals(args[1])){
                    System.out.println(b.Totext());
                }
            }
        }
        else if(args[0].equals("--buy")){
            double total = 0;

            for(int i =1; i<args.length; i++ ){
                for (Book b :books){
                    if(b.title.contains(args[i])){
                        total = total + b.price;
                    }
                }
            }

            System.out.println(total);
        }



    }

}
