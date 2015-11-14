import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        GraphInt start = new GraphInt();

        try {
            start.Calc();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
// http://www.objectsbydesign.com/projects/calc/overview.html