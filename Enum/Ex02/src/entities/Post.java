package entities;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import entities.Comments;

public class Post {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private String title;
    private String content;
    private int likes;

    List<Comments> comments =  new ArrayList<>();

    public Post(Date moment, String title, String content, int likes){
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public Date getMoment() {
        return moment;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }


    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public List<Comments> getComments(){
        return comments;
    }

    public void addComments(Comments comment){
        comments.add(comment);
    }

    public void removeComments(Comments comment){
        comments.remove(comment);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(sdf.format(moment) + "\n");
        sb.append(content + "\n");
        sb.append("Comments:\n");
        for (Comments c : comments) {
            sb.append(c.getText() + "\n");
        }
        return sb.toString();
    }

}
