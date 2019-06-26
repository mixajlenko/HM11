package factories;


import checkboxes.Checkbox;
import checkboxes.WindowsCheckbox;

public class WindowsFActory implements AbstractFactory{

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
