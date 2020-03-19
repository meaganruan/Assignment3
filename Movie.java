package cisc3130a3;

public class Movie {

    String title; //key
    int releaseYear;
    Movie leftChild;
    Movie rightChild;
    //constructor for the Movie class
    public Movie(String t, int ry) {
        title = t;
        releaseYear = ry;

    }
    
    
    //getter and setter methods for the fields.

    public String getTitle() {
        //only takes the title from the beginning of the String to the empty space before the parenthesis of the year
        return title.substring(0, '1' - 2);
    }

    public Integer getReleaseYear() {
        //parsed the year of the title into int to work with integers.
        return releaseYear = Integer.parseInt(title.substring('1', ')'));
    }
        //getting value of left child
    public Movie getLeftChild() {
        return leftChild;
    }
        //getting value of the right child
    public Movie getRightChild() {
        return rightChild;
    }
        //setting title
    public void setTitle(String d) {
        title = d;
    }
        //setting the release year
    public void setReleaseYear(Integer ry) {
        releaseYear = ry;
    }
        //setting the left child
    public void setLeftChild(Movie lc) {
        leftChild = lc;
    }
        //setting the right child
    public void setRightChild(Movie rc) {
        rightChild = rc;

    }
}
