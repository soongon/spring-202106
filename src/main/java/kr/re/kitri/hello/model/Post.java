package kr.re.kitri.hello.model;

public class Post {
    private long postId;
    private String title;
    private String author;
    private String body;
    private long likes;

    public Post() {}
    public Post(long postId, String title, String author, String body, long likes) {
        this.postId = postId;
        this.title = title;
        this.author = author;
        this.body = body;
        this.likes = likes;
    }
    public long getPostId() {
        return postId;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getBody() {
        return body;
    }
    public long getLikes() {
        return likes;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postId=" + postId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", body='" + body + '\'' +
                ", likes=" + likes +
                '}';
    }
}
