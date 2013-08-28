import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA. User: lo Date: 8/28/13 Time: 10:07 AM To change this template use
 * File | Settings | File Templates.
 */
public class ArrayListTest {
    public static void main(String[] argc) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        int n = 0;
        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (Integer i : arrayList) {
            System.out.println(i);
        }
        //TODO: ILLEGAL CASE DEALING
        //AnalyzerForPinyin.analyzerForPinyin("pinyinmeinvyingxiongdian");
        AnalyzerForPinyin.analyzerForPinyin("diandianshichang");
        AnalyzerForPinyin.analyzerForPinyin("zhiwudazhanjiangshi");
        //AnalyzerForPinyin.analyzerForPinyin("ai");
    }

}