package ArrToInt;

public class Test {

        private static int i;

        public static final class Account {
            private float money;
            private String name;

            public float getMoney() {
                return money;
            }

            public void setMoney(float money) {
                this.money = money;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

        }

        public static void main(String[] args) {
            Account[] accounts = new Account[5];//создали и заполнили 5 елементов массива

            accounts[0] = new Account();
            accounts[0].setMoney(100f);
            accounts[0].setName("Gen Ivanov");

            accounts[1] = new Account();
            accounts[1].setMoney(200f);
            accounts[1].setName("Gen Petrov");

            accounts[2] = new Account();
            accounts[2].setMoney(300f);
            accounts[2].setName("Ivan Sidorov");

            accounts[3] = new Account();
            accounts[3].setMoney(400f);
            accounts[3].setName("Den  Podov");

            accounts[4] = new Account();
            accounts[4].setMoney(500f);
            accounts[4].setName("Stan Ovva");

            for (i = 0; i < accounts.length; i++) {// в цикле переменная будет принимать значение от 0 до длинны масива (до 5)

                float currentMoney = accounts[i].getMoney();//берем текущее количество денег на счетую. Обрашкние к елементу массива через переменную i
                currentMoney = currentMoney + currentMoney * 0.1f;//увеличение переменную currentMoney - текущего количества денег на 10%
                //присвоим это значение переменной которая обозначает счет
                accounts[i].setMoney(currentMoney);
            }
            //для того чтобы убедиться что тденьги начисленны правильно создаем еше один цыкл в котором пройдемся по массиву и выведем имена и количество денег которые в данный момент лежат на счету
            for (i = 0; i < accounts.length; i++) {
                System.out.println("Name " + accounts[i].getName() + "money : " + accounts[i].getMoney());
            /*Name Gen Ivanovmoney : 110.0
Name Gen Petrovmoney : 220.0
Name Ivan Sidorovmoney : 330.0
Name Den  Podovmoney : 440.0
Name Stan Ovvamoney : 550.0*/

            }


        }
    }

