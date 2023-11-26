package hust.soict.hedspi.aims.media;
public abstract class Media{
    protected String title;
    protected String category;
    protected float cost;
    protected int id;
    public Media() {
    }

    public boolean equals(Object obj) {
        if (obj instanceof Media) {
            Media media = (Media) obj;
            if (this.title.equals(media.title)) {
                return true;
            }
        }
    }

}