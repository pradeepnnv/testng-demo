package org.pradeepnnv;

import java.util.Locale;

public class MyConcatenator {
    public static String concatanate(String ... strings){
        StringBuilder builder = new StringBuilder();

        for (int i=0; i<strings.length; i++){
            if (i > 0){
                builder.append("#");
            }
            builder.append(strings[i]);
        }

        return builder.toString();
    }

    public static String returnUpper(String input) {
        return input.toUpperCase(Locale.ROOT);
    }

}
