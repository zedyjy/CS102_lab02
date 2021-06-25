package CS102.Lab02;

public class WordSearch extends HTMLFilteredReader {
    String wordToSearch;

    public WordSearch(String url, String wordToSearch){
        super(url);
        this.wordToSearch = wordToSearch;
    }

    public void search(){
        int locationOfTheWord = 0;
        int length = wordToSearch.length();
        boolean includes = false;

        for(int i = 0; i < super.getPageContents().length()-wordToSearch.length(); i++){
            //System.out.println(super.getPageContents().substring(i,i+length));
            if(super.getPageContents().substring(i,i + length).equals(wordToSearch)){
                locationOfTheWord = i;
                includes = true;
            }
        }
        if(includes) {
            System.out.println(wordToSearch + " is in the text and it's index is: " + locationOfTheWord );
        }
        else{
            System.out.println("This word is not in the text.");
        }
    }
}
