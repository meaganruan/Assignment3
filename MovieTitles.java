package cisc3130a3;
import java.io.*;
import java.util.*;
public class MovieTitles {
  
     public static void main(String[] args) throws IOException {
        //store each file path into an array list
		File movieFile = new File("src/movies.csv");
		
		// to store multiple input files
		ArrayList<File> files = new ArrayList<File>();
		files.add(movieFile);
		String row;
		//store movie column
		LinkedList<String> movies = new LinkedList<>();
                    //create a for loop to loop through (multiple) files if needed
			for (int i = 0; i < files.size(); i++) {
				if (files.get(i) != null) {
				BufferedReader reader = new BufferedReader(new FileReader(files.get(i)));
					while ((row = reader.readLine()) != null) {
                                            //store movies in a  temporary array 
						String[] data = row.split(",");
						String title = data[1];
                                                //add items in temp array to a list
						movies.add(title);
						//remove column name
                                                movies.remove("title");
					}

					reader.close();
				}
			}
                        System.out.println(movies);
                        
                     
		}
    }
    

