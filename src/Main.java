import myList.MyList;

public class Main {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        int maxNumber = 15;

        for (int i = 0; i < maxNumber; i++) {
            myList.add(String.format("Да здравствует %d 23 февраля!", i));
        }

        for (String item : myList) {
            System.out.println(item);
        }

        System.out.println(myList.getHead());
        System.out.println(myList.getTail());


        myList.add("Да здравствует %d 23 февраля!");

        for (String item : myList) {
            System.out.println(item);
        }

        System.out.println(myList.getHead());
        System.out.println(myList.getTail());
    }
}