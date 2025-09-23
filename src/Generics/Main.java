package Generics;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }

        Print<Integer> printObj = new Print<>();
        printObj.setPrintValue(1);
        Integer value = printObj.getPrintValue();
        System.out.println(value);


        ColorPrint colorPrintObj = new ColorPrint();
        colorPrintObj.setPrintValue("2");
        System.out.println(colorPrintObj.getPrintValue());

        BlackPrint<String> blackPrintObj = new BlackPrint<>();
        blackPrintObj.setPrintValue("3");
        System.out.println(blackPrintObj.getPrintValue());

        Pair<String, Integer> pairObj = new Pair<>();
        pairObj.put("Hello", 1234);
        System.out.println(pairObj.getKey() + " => " + pairObj.getValue());

       GenericMethod genericMethodObj = new GenericMethod();
       genericMethodObj.setValue(new Print());
       genericMethodObj.setValue(new ColorPrint());

       List<Vehicle> vehicleList = new ArrayList<>();
       List<Bus> busList = new ArrayList<>();
       vehicleList.add(new Car());
       vehicleList.add(new Bus());
//       vehicleList = busList; // not allowed
        Wildcard wildcardObj = new Wildcard();
        wildcardObj.setPrintValues(vehicleList);
//        wildcardObj.setPrintValues(busList); // err
        wildcardObj.upperbound(busList); // same and below
        List<Object> obj = new ArrayList<>();
        wildcardObj.lowerbound(vehicleList); // same and above
//        wildcardObj.lowerbound(busList); // err busList is below

        List<Integer> wildCardIntegerSourceList = new ArrayList<>();
        List<Float> wildCardIntegerDestinationList = new ArrayList<>();

        wildcardObj.computeList(wildCardIntegerSourceList, wildCardIntegerDestinationList); // Integer, Float
//        wildcardObj.computeList1(wildCardIntegerSourceList, wildCardIntegerDestinationList); // err generic upper bound allows same type







    }
}