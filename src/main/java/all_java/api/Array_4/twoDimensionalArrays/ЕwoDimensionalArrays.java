package all_java.api.Array_4.twoDimensionalArrays;

public class ЕwoDimensionalArrays {
    public static void main(String[] args) {


        //Создается массив массивов размерностью на 5 элементов.
        int[][] multiplicationTable = new int[5][];
        //Массив отображается в консоль.
        System.out.println("multiplicationTable = " + multiplicationTable);
        for (int i = 0; i < multiplicationTable.length; i++) {
            System.out.println("multiplicationTable[" + i + "] = " + multiplicationTable[i]);
        }
        //multiplicationTable = [[I@cc285f4
        //multiplicationTable[0] = null
        //multiplicationTable[1] = null
        //multiplicationTable[2] = null
        //multiplicationTable[3] = null
        //multiplicationTable[4] = null
        //Создаются одномерные массивы, ссылки на которые сохраняются в первом массиве.
        System.out.println("\nCreate array");
        for (int i = 0; i < multiplicationTable.length; i++) {
            multiplicationTable[i] = new int[5];//вделен
            System.out.println("multiplicationTable[" + i + "] = " + multiplicationTable[i]);
//Create array -> инициализация массива
//multiplicationTable[0] = [I@42d80b78 //значение по умолчанию для елементов массива
//multiplicationTable[1] = [I@3bfdc050
//multiplicationTable[2] = [I@1bce4f0a
//multiplicationTable[3] = [I@5e3a8624
//multiplicationTable[4] = [I@5c3bd550



           /* System.out.println("\nInitialization array");//Содержание Двумерного массива).
            for (int i = 0; i < multiplicationTable.length; i++) {
                for (int j = 0; j < multiplicationTable[i].length; j++) {
                    System.out.print(" " + multiplicationTable[i][j]);
                }
                System.out.println();*/
            //nitialize array
            //
            //0 0 0 0 0
            //0 0 0 0 0
            //0 0 0 0 0
            //0 0 0 0 0
            //0 0 0 0 0
        }
    }
}


//Важно понимать, что в многомерных массивах только последний уровень индексации (самый правый индекс) указывает непосредственно на элемент заявленного типа данных массива. Остальные индексы содержат только ссылки на массивы.