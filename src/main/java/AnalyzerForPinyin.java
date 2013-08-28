import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * Created with IntelliJ IDEA. User: lo Date: 8/28/13 Time: 11:47 AM To change this template use
 * File | Settings | File Templates.
 */
class AnalyzerForPinyin {
    AnalyzerForPinyin() {

    }
    static String pinyinPrefixOfAll = "b p m f d t n l g k h j q x zh ch sh r z c s y w";
    static String pinyinSuffixOfAll = "a o e i u u: v ai ei ui ao ou iu ie ue an en in un ang eng ing ong iong iao ian uan iang";
    static String pinyinTermOfAll = "a o e ai ao ou er an ang";
    private static HashSet<String> prefixPinyinSet = new HashSet<String>();
    private static HashSet<String> suffixPinyinSet = new HashSet<String>();
    private static HashSet<String> termPinyinSet = new HashSet<String>();
    static {
        Collections.addAll(prefixPinyinSet, pinyinPrefixOfAll.split(" "));
        Collections.addAll(suffixPinyinSet, pinyinSuffixOfAll.split(" "));
        Collections.addAll(termPinyinSet, pinyinTermOfAll.split(" "));
    }

    public static String[] analyzerForPinyin(String originalString) {
        ArrayList<String> arrayList = new ArrayList<String>();
        boolean first = true;
        for (int i = originalString.length() - 1, end = originalString.length(); i >= 0; i--) {
            char ch = originalString.charAt(i);
            String suffixString = null;
            if (prefixPinyinSet.contains(String.valueOf(ch)) && i != end-1) {
                if (ch == 'z' || ch == 'c' || ch == 's') {
                    if (originalString.charAt(i+1) == 'h') {
                        suffixString = originalString.substring(i+2, end);
                    }
                } else {
                    suffixString = originalString.substring(i+1, end);
                }
                if (ch == 'h') {
                    if (i != 0 && (originalString.charAt(i-1) == 'c' || originalString.charAt(i-1) == 'z' ||
                                   originalString.charAt(i-1) == 's'))
                        continue;
                }
                if (suffixPinyinSet.contains(suffixString)) {
                    String subString = originalString.substring(i, end);
                    end -= subString.length();
                    arrayList.add(subString);
                    System.out.println(subString);
                }
            } else if (termPinyinSet.contains(String.valueOf(ch))) {
            }

        }
        return arrayList.toArray(new String[arrayList.size()]);
    }

}
