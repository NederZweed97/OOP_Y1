package week1.Book;

public class Book{
    private String title;
    private String author;
    private boolean hardcover;
    private double price;
    private int pages;
    private int readCount = 0; // readCount is by default 0, assuming that the user just bought the book

    public Book(String title, String author, boolean hardcover, double price, int pages){
        this.title = title;
        this.author = author;
        this.hardcover = hardcover;
        this.price = price;
        this.pages = pages;
    }

    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getAuthor(){
        return this.author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public boolean getHardcover(){
        return this.hardcover;
    }
    public void setHardcover(boolean hardcover){
        this.hardcover = hardcover;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getPages(){
        return this.pages;
    }
    public void setPages(int pages){
        this.pages = pages;
    }
    public int getReadCount(){
        return this.readCount;
    }
    public void setReadCount(int readCount){
        this.readCount = readCount;
    }

    public int upReadCount(){
        this.readCount++;
        return getReadCount();
    }

    public double getReadingTime(){
        double time = this.pages * 1.25; // 1/0,8 = 1,25 thus one full page takes 1.25 minutes
        return time;
    }

    public String getReadingAdvice(){
        double time = getReadingTime();
        if(time <= 79){
            return "Dit kan je prima lezen";
        } else if(time >= 60 && time <=240){
            return "Weet je zeker dat je dit nu wil lezen?";
        } else if(time > 240){
            return "Dit kun je beter niet meer gaan lezen";
        }
        return "Geen tijd kunnen bekekenen";
    }

    public static void main(String[] args){
        Book boek = new Book("test", "Someone", false, 9.45, 150);
        System.out.println(boek.getTitle());
        System.out.println(boek.getReadingTime());
        System.out.println(boek.getReadingAdvice());
        System.out.println(boek.upReadCount());
    }
}