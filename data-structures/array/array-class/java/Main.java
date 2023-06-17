public class Main {

    public static void main(String args[]) {
        Array myArray = new Array(2);
        myArray.append(0);
        myArray.append(4);
        myArray.append(5);

        Main main = new Main();
        main.printArray(myArray);

        System.out.println("=====================");
        myArray.append(6);
        myArray.append(9);
        main.printArray(myArray);

        System.out.println("=====================");
        myArray.removeAt(0);
        main.printArray(myArray);
    }

    public void printArray(Array array) {
        for (int i = 0; i < array.getSize(); i++) {
            System.out.println("Value at index " + i + ": " + array.get(i));
        }
    }

}
