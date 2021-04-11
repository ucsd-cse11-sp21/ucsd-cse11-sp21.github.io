class Author {
    String name;
    String fullName;

    Author(String name, String fullName) {
        this.name = name;
        this.fullName = fullName;
    }

    String toText() {
        return this.fullName;
    }
    
}


class Book {
    String title;
    Author author;
    int price;

    Book(String title, Author author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    String truncateTitle(int length) {
        if (this.title.length() <= length) {
            return this.title;
        } else {
            return this.title.substring(0, length) + "...";
        }
    }

    String toText() {
        return this.author.toText() + ": " + this.truncateTitle(12);
    }
}

class ExampleBooks {
    Author tolkien = new Author("JRR Tolkien", "John Ronald Reuel Tolkien");
    Book theTwoTowers = new Book("The Two Towers", tolkien, 8);
}