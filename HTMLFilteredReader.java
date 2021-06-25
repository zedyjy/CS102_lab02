package CS102.Lab02;

public class HTMLFilteredReader extends MySimpleURLReader {

    public HTMLFilteredReader(String url){
        super(url);
    }

    public String getUnfilteredPageContents(){
        return super.getPageContents().substring( 4 );
    }


    public String getPageContents() {
        int startIndex = 0;
        int endIndex = 0;
        String filteredContent = "";


        for (int i = 0; i < getUnfilteredPageContents().length(); i++){
            if (getUnfilteredPageContents().charAt(i) == '<'){
                startIndex = i;
            }

            if (getUnfilteredPageContents().charAt(i) == '>'){
                endIndex = i;
            }

            if (startIndex != 0 && endIndex != 0){
                filteredContent = filteredContent + getUnfilteredPageContents().substring(endIndex + 1, startIndex);
                startIndex = 0;
                endIndex = 0;
            }
        }
        return filteredContent;
    }
}
