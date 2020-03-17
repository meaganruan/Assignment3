package cisc3130a3;
public class Movie {
  private String title;
  private int releaseYear;
  Movie leftchild;
  Movie rightchild;
  //constructor for the Movie class
  public Movie(String t, int ry){
    title=t;
    releaseYear=ry;
  
}
  //getter and setter methods for the private fields.
    public String getTitle(){
        //only takes the title from the beginning of the String to the empty space before the parenthesis of the year
        return title.substring(0, ')'-1);
    }
    public Integer getReleaseYear(){
        //parsed the year of the title into int to work with integers.
        return releaseYear=Integer.parseInt(title.substring('('+1,')'));
    }
    public Movie getLeftChild(){
        return leftchild;
    }
    public Movie getRightChild(){
        return rightchild;
    }
    public void setTitle(String d){
        title=d;
    }
    public void setReleaseYear(Integer ry){
        releaseYear=ry;
    }
    public void setLeftChild (Movie lc){
        leftchild=lc;
    }
    public void setRightChild(Movie rc){
        rightchild=rc;
    }
}
