public class RotateMain {
    public static void main(String[] args) {
        var myList = new RotatableListImpl();
        myList.rotate(1);
        System.out.println(myList);
    }
}
