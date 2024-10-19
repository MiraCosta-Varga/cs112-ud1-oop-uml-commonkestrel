import java.time.LocalDate;

/**
 * Represents an individual todo list item
 * 
 * @author Jett Bergthold
 */
public abstract class ListItem {
    protected String title;
    protected LocalDate date;

    /**
     * Constructs a list item with the given name and date
     * @param title The title of the item
     * @param date The date the item is due
     */
    public ListItem(String title, LocalDate date) {
        this.title = title;
        this.date = date;
    }

    //--- Abstract methods used by subclasses ---//

    /**
     * Displays the item to {@code stdout}
     */
    public abstract void display();
    /**
     * Gets a pretty formatted representation of the item
     * @return A formatted representation of the item
     */
    public abstract String prettyPrint();
    /**
     * Gets a human readable version of the item
     * @return A human readable version of the item
     */
    public abstract String toString();

    /**
     * Gets the item's title
     * @return
     */
    public String getTitle() {
        return title;
    }
}
