package lbs;

/**
 * Base class for library items
 */
public class LibraryItem {
    protected String title;
    protected String itemId;
    protected boolean isAvailable;

    // Constructor
    public LibraryItem(String title, String itemId) {
        this.title = title;
        this.itemId = itemId;
        this.isAvailable = true;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    /**
     * Check out the item
     */
    public boolean checkOut() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    /**
     * Return the item
     */
    public void returnItem() {
        isAvailable = true;
    }

    @Override
    public String toString() {
        return "LibraryItem{" +
                "title='" + title + '\'' +
                ", itemId='" + itemId + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}