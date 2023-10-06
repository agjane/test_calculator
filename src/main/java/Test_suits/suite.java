package Test_suits;

import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages("org.example")
@ExcludeTags({"Сумма", "Вычитание", "Умножение", "Деление"})
public class suite {
}
