package librarycentre_package;

public class Magazine extends Item{
    private int issueNumber;
    private String publicationFrequency;
    private String editor;

    //constructor
    public Magazine(String title,String ISBN) {
        super(title,ISBN);
    }

    //getters and setters
    public String getPublicationFrequency() {
        return publicationFrequency;
    }
    public void setPublicationFrequency(String publicationFrequency) {
        this.publicationFrequency = publicationFrequency;
    }

    public int getIssueNumber() {
        return issueNumber;
    }
    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getEditor() {
        return editor;
    }
    public void setEditor(String editor) {
        this.editor = editor;
    }

    @Override
    public String toString() {
        return super.toString() + "Issue Number: " + issueNumber
                + " publication frequency: " + publicationFrequency
                + " editor: " + editor;
    }
}
