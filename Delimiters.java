import java.util.ArrayList;
public class Delimiters {

private String openDel;
private String closeDel;

public Delimiters(String open, String close) {
    openDel = open;
    closeDel = close;
}

public ArrayList<String> getDelimitersList(String[] tokens) {  
    ArrayList<String> result = new ArrayList<String>();
    for (String delimiter : tokens) {
        if (delimiter.equals(openDel) || delimiter.equals(closeDel)) result.add(delimiter);
    }
    return result;
}

public boolean isBalanced(ArrayList<String> delimiters) {  
    int numOpen = 0;
    int numClose = 0;
    for (String s : delimiters) {
        if (s.equals(openDel)) {
            numOpen++;
        }
        if (s.equals(closeDel)) {
            numClose++;
        }
        if (numClose > numOpen) return false;
    }
    if (numOpen != numClose) return false;
    return true;
}

}