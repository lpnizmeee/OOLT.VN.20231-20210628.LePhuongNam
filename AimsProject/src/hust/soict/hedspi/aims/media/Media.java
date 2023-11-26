package hust.soict.hedspi.aims.media;
public abstract class Media{
    protected String title;
    protected String category;
    protected float cost;
    protected int id;

    private static int nbMedia = 0;
    public Media() {
    }
    public Media(String title) {
        this.title = title;
        nbMedia++;
        this.id = nbMedia;
    }
    public Media(String title, String category) {
        this.title = title;
        this.category = category;
        nbMedia++;
        this.id = nbMedia;
    }
    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        nbMedia++;
        this.id = nbMedia;
    }


    public boolean equals(Object obj) {
        if (obj instanceof Media) {
            Media media = (Media) obj;
            if (this.title.equals(media.title)) {
                return true;
            }
        }
        return false;
    }

}