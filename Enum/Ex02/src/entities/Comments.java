package entities;

public class Comments {
    private String text;

    public Comments(String text){
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
