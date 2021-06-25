package CS102.Lab02;
import java.util.ArrayList;
public class MySimpleURLReader extends cs1.SimpleURLReader {

    private static String url;

    public MySimpleURLReader(String url){
        super(url);
        this.url = url;
    }

    public String getURL(){
        return url;
    }

    public String getName(){
        String name = "";
        for (int i = getURL().length()-1; i > 0; i-- ){
            if(url.charAt(i) == '/'){
                name = url.substring(i+1, getURL().length());
                i = 1;
            }
        }
        return name;
    }

    @Override
    public String getPageContents(){
        return super.getPageContents().substring( 4 );
    }

    public int getNumberOfCSSLinks(){
        int count = 0;
        for(int i = 0; i < getPageContents().length()-5; i++){
            if(getPageContents().substring(i,i+5).equals("<link")){
                count++;
            }
        }
        return count;
    }
}
