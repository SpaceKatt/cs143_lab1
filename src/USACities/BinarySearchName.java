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

/**
 *
 * @author thomas.kercheval
 */
public class BinarySearchName {
    
    private boolean lessThan(String one, String two) {
        return one.compareTo(two) < 0;
    }
            
    private int binarySearcher(String[] names, String target,
                               int min, int high) {
        int key = (min + high) / 2;
        int result = -1;
        if (names[key].equals(target)) {
            return key;
        } else if (min == high) {
            return -1;
        } else if (lessThan(names[key], target)) {
            result = binarySearcher(names, target, key + 1, high);
            return result;
        } else if (lessThan(target, names[key])) {
            result = binarySearcher(names, target, min, key - 1);
            return result;
        }
        return result;
    }
    
    public int binarySearch(String[] names, String target) {
        int result = -1;
        int sizeArray = names.length;
        result = binarySearcher(names, target, 0, sizeArray);
        return result;
    }


}
