import java.util.ArrayList;
import java.util.List;

public class TextJustification {
    public static void main(String[] args) {
        String[] sample = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;
        System.out.println(fullJustify(sample, maxWidth));
    }

    public static List<String> fullJustify(String[] words, int maxWidth){
        List<String> list = new ArrayList<>();
        List<String> lineList = new ArrayList<>();
        String[] sample = {};
        int lineCharacters = 0;
        int lastLineCharacters = 0;
        for (String word: words) {
            lineCharacters += word.length() + 1;
            if(lineCharacters > maxWidth){
                System.out.println("lastLineCharacters " + lastLineCharacters);
                System.out.println( "lineList " + lineList);
                double spaces = (maxWidth - lastLineCharacters) / (lineList.size() - 1);
                System.out.println("Spaces " + spaces);
                lineList.clear();

                lastLineCharacters = 0;
                lineCharacters = 0;

            } else {


            }
            lastLineCharacters += word.length();
            lineList.add(word);
        }

        return list;
    }
}
