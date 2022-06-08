package all_java.api.Array_4.Array_4_ToothedArrays;

public class Ex2Array {
    public static void main(String[] args) {
        String[] ejgStr = new String[][] { { null }, new String[] { "a", "b", "c" }, { new String() } }[0];
        String[] ejgStr1 = null;
        String[] ejgStr2 = { null };
        System.out.println(ejgStr[0] + "  " + ejgStr2[0] + "  " + ejgStr1[0]);

    }
}
//NullPointerException
//Исключение NullPointerException возникнет при попытке индексировать массив, инициализированный литералом null. Литерал null не может быть индексирован. Также через него нельзя обратиться к полям и методам любого объекта.