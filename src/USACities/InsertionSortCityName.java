/*
 * Copyright (C) 2016 Thomas
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

import java.util.ArrayList;

/**
 * This class implements a simple insertion sort,
 *     to sort cities by name.
 * @author Thomas
 */
public class InsertionSortCityName {
    /* Compares two values. */
    private boolean less(City one, City two) {
        return one.getName().compareToIgnoreCase(two.getName()) < 0;
    }
    
    /* Checks to make sure the ArrayList is sorted. */ 
    private boolean isSorted(ArrayList<City> list) {
        for (int i = 0; i < list.size(); i++) {
            if(less(list.get(i), list.get(i - 1))) { return false; }
        }
        return true;
    }
    
    /* Swaps two elements in an ArrayList. */
    private void swap(ArrayList list, int indexOne, int indexTwo) {
        Object temp = list.get(indexTwo);
        list.set(indexTwo, list.get(indexOne));
        list.set(indexOne, temp);
    }
    
    /* Uses  insertion sort to sort an ArrayList of Cities by name. */
    public void sort(ArrayList<City> list) {
        int arraySize = list.size();
        for (int i = 0; i < arraySize; i++) {
            for (int j = i; j > 0 && less(list.get(j), list.get(j-1)); j--) {
                swap(list, j, j-1);
            }
        }
        assert isSorted(list);
    }
}
