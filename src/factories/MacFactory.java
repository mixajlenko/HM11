package factories;

import checkboxes.Checkbox;
import checkboxes.MacOSCheckbox;

public class MacFactory implements AbstractFactory{

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
