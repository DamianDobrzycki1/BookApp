package ie.atu.productv3;

public class Music extends Product{

    private String Artist;
    private String Label;

    public Music(){
        super();
        Artist = " ";
        Label = " ";
        count++;
    }

    public void setArtist(String Artist) {
        this.Artist = Artist;
    }

    public void setLabel(String Label) {
        Label = Label;
    }

    public String getArtist() {
        return Artist;
    }

    public String getLabel() {
        return Label;
    }

    @Override
    public String toString() {
        return super.toString() + "  by  "+ Artist + "\n" + "Label";

    }
}
