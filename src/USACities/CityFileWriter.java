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

import java.awt.List;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thomas.kercheval
 */
class CityFileWriter {
    
    // File path (relative)
    private final String file;
    // List of lines to be written
    private ArrayList<String> lines;
    
    /**
     * Constructor which stores the relative path of our database and
     * creates the lines to be written in our file.
     * @param file Relative file path of city database
     * @param cities ArrayList of cities to be written
     */
    CityFileWriter(String file, ArrayList<City> cities) {
        this.file = file;
        this.lines = createLines(cities);
    }
    
    private ArrayList<String> createLines(ArrayList<City> cities) {
        ArrayList<City> sortCity = new ArrayList<>(cities);
        InsertionSortCityName sorter = new InsertionSortCityName();
        sorter.sort(sortCity);
        ArrayList<String> newLines = new ArrayList<>();
        for (int i = 0; i < cities.size(); i++) {
            City city = sortCity.get(i);
            String line = city.getName() + ",";
            line += city.getPopulation() + ",";
            line += city.getMedian() + ",";
            line += city.getLocal() + ",";
            line += city.getDegree();
            newLines.add(line);
        }
        newLines.stream().forEach(System.out::println);
        return newLines;
    }
    
    public void writeTheFile() {
        Path filePath = Paths.get(this.file);
        try {
            Files.write(filePath, lines, Charset.forName("UTF-8"));
        } catch (IOException ex) {
            Logger.getLogger(CityFileWriter.class.getName()).log(Level.SEVERE, 
                                                                 null, ex);
        }
    }
}
