package cisc3130a3;

public class MovieBST {
    
    //created the movie object for the root of the tree
    private Movie root;
    
    //create subset method
    public void subSet(String start, String end) {
        // Selects movie titles that fall alphabetically between start and end.
        if (start.charAt(0) < end.charAt(0)) {
            //do something
        } else if (start.charAt(0) > end.charAt(0)) {
            //do something
        } else {//if the character at position 0 are equal for both Strings.
            if (start.length() >= end.length()) {
                for (int i = 1; i < start.length(); i++) {
                    if (start.charAt(i) != end.charAt(i)) {
                        //do something
                    }
                }
            } else if (start.length() <= end.length()) {
                for (int j = 1; j < end.length(); j++) {
                    if (start.charAt(j) != end.charAt(j)) {
                        //do something
                    }
                }
            }

        }
    }

    //takes in the Movie node
    public void addMovieNode(String t, int ry) {
        Movie newNode = new Movie(t, ry);

        //checks if there is already a parent node or  not
        if (root == null) {
            root = newNode;
        } else {
            //if there already is a node, it will be the first (root node)
            Movie first = root;

            //create a nother movie object
            Movie parent;
            //infinite loop
            while (true) {
                parent = first;
                //divide nodes into left and right child
                //left child if t is less than the value of the first node's title's first char  
                if (t.charAt(0) < ((first.title).charAt(0))) {
                    first = first.leftChild;
                    //if there is no root
                    if (first == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else { //right child
                    first = first.rightChild;

                    if (first == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }

        }
    }

}
