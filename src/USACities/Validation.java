/*
 * Copyright (C) 2016 thomas.kercheval
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package USACities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Need lots of Javadocs... read regex
 * @author thomas.kercheval
 */
public class Validation {
    /**
     * Check to see if input is a double type.
     * @param field The item we are validating as a double.
     */
    public static boolean isDouble(String field) {
        Pattern pat = Pattern.compile("\\d+(\\.\\d+)?");
        Matcher mat = pat.matcher(field);
        return mat.matches();
    }
    
    public static boolean isPhone(String field) {
        if (field.matches("\\d{10}")) {
            return true;
        } else if (field.matches("")) {
            
        }
        
        Pattern pat = Pattern.compile("");
        Matcher mat = pat.matcher(field);
        return mat.matches();
    }
}
