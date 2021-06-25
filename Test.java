package CS102.Lab02;

import cs1.SimpleURLReader;

public class Test  {

    public static void main (String [] args) {

        System.out.println("----------------PART A. Test----------------");
        cs1.SimpleURLReader readURL = new SimpleURLReader("http://www.cs.bilkent.edu.tr/~ozturk/cs102/housman.txt");

        System.out.println("This is the number of lines in the file: " + readURL.getLineCount());
        System.out.println("\nThis is the page contents\n\n" + readURL.getPageContents());

        System.out.println("----------------PART B Testing MySimpleURLReader----------------");
        MySimpleURLReader reader = new MySimpleURLReader("https://scrapethissite.com/pages/simple/");
        System.out.println(reader.getName());
        System.out.println(reader.getPageContents());
        System.out.println(reader.getURL());

        System.out.println("----------------PART C Testing getNumberOfCSSLinks()----------------");
        System.out.println(reader.getNumberOfCSSLinks());

        System.out.println("----------------PART D Testing HTMLFilteredReader----------------");
        HTMLFilteredReader read = new HTMLFilteredReader("https://scrapethissite.com/pages/simple/");
        System.out.println(read.getPageContents());

        System.out.println("----------------PART E Testing WordSearch----------------");
        WordSearch searchTurkey = new WordSearch("http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html" ,"Turkey");
        WordSearch searchAnkara = new WordSearch("http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html" ,"Ankara");
        searchTurkey.search();
        searchAnkara.search();
    }
}