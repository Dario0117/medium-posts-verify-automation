package medium.posts.verify.automation.models;

/**
 * Post
 */
public class Post {

    private String title;
    private String author;
    private String date;
    private String readingTime;

    public Post(
        String title, 
        String author,
        String date,
        String readingTime
    ) {
        this.title = title;
        this.author = author;
        this.date = date;
        this.readingTime = readingTime;
    }

    @Override
    public String toString(){
        return String.format(
            "Title: %s%nAuthor: %s%nDate: %s%nReading Time: %s%n", 
            this.title, this.author, this.date, this.readingTime
        );
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getDate() {
        return this.date;
    }

    public String getReadingTime() {
        return this.readingTime;
    }

    public void setTitle(String v) {
        this.title = v;
    }

    public void setAuthor(String v) {
        this.author = v;
    }

    public void setDate(String v) {
        this.date = v;
    }

    public void setReadingTime(String v) {
        this.readingTime = v;
    }
}