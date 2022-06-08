package all_java.api.utils.maching;

import all_java.api.utils.maching.matchers.IsDateFormat;
import all_java.api.utils.maching.matchers.IsNumber;
import org.hamcrest.Matcher;

public class CustomMatchers {
    public static Matcher<String> isNumber(){
        return new IsNumber();
    }

   public static Matcher<String> isDateFormat() {
      return new IsDateFormat();
    }
}
