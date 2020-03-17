package cisc3130a3;

import java.util.*;

public class MovieBST {
  private Movie first;

  public void subSet(String start, String end){
    // Selects movie titles that fall alphabetically between start and end.
    
  }

  // more methods
  public void addMovieNode(String t, int ry){
      Movie newNode = new Movie(t, ry);
      
      if (first == null){
          first = newNode;
      }
      else{
          Movie root = first;
          
          Movie parent;
          while(true){
              parent = root;
              //divide nodes into left and right child
                  
              
          }
      }
  }

}