package readFile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.io.*;
 
public class ReadFile {
  public static void main(String[] args){
	    List<String> wordlist = new ArrayList<>();
	    Map<String, Integer> WordMap = new HashMap<String,Integer>();
	    Scanner scanner = null;
	    try {
	    	scanner = new Scanner(new File("words.txt"));
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();  
	    }
	        while (scanner.hasNext()) {
	            String output = scanner.next();
	            wordlist.add(output.replaceAll("\\p{Punct}", "").toLowerCase());
	        }
	        wordlist.forEach(word -> {
	            Integer counts = WordMap.get(word);
	            WordMap.put(word, counts == null ? 1 : ++counts);
	        });
	        System.out.println(WordMap);
	    }   
    }

