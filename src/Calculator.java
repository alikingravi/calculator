public class Calculator {

    // main method
    public static void main(String[] args) {
        CalculatorFrame frame = new CalculatorFrame(420, 550);
        frame.initTextField();
        frame.createButtons();
        frame.createPanel();
        frame.setFrame();
    }
}
