import Stack.Experssion;

import java.util.ArrayList;

public class CheckBracks {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("[{({}())}][");
        arrayList.add("{{}(){{}}(");
        arrayList.add("[[(){}[{{(){}}}]]]");
        arrayList.add("{{{(())}{}[[(())]}");


        Experssion obj=new Experssion();

        for(String str: arrayList){
            if (obj.isBalanceExpression(str))
                System.out.println("Matched");
            else
                System.out.println("not matched");
        }

    }
}
