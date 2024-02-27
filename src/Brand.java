public class Brand implements Comparable<Brand>{
    int brandID;
    String title;

    public Brand(int brandID, String title) {
        this.brandID = brandID;
        this.title = title;
    }

    public int compareTo(Brand b1) {
        return this.getTitle().compareTo(b1.title);
    }

    public int getBrandID() {
        return this.brandID;
    }

    public String getTitle() {
        return title;
    }
}
