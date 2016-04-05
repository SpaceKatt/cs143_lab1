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

import java.util.Objects;

/**
 *
 * @author thomas.kercheval
 */
class City {
    
    //
    private String city_name;
    private double population;
    private double median;
    private double local;
    private double degree;
    
    // Default constructor
    City() {
        this.city_name = "";
        this.population = 0;
        this.median = 0;
        this.local = 0;
        this.degree = 0;
    }
    
    // Overloaded constructor
    City(String name, double pop, double median_income,
         double local_pop, double degree_per) {
        this.city_name = name;
        this.population = pop;
        this.median = median_income;
        this.local = local_pop;
        this.degree = degree_per;
    }
    
    // Array constructor
    City(String[] city_info) {
        this.city_name = city_info[0];
        this.population = Double.parseDouble(city_info[1]);
        this.median = Double.parseDouble(city_info[2]);
        this.local = Double.parseDouble(city_info[3]);
        this.degree = Double.parseDouble(city_info[4]);
    }
    
    // Copy constructor
    City(City city) {
        this.city_name = city.city_name;
        this.population = city.population;
        this.median = city.median;
        this.local = city.local;
        this.degree = city.degree;
    }
    
    public String getName() {
        return this.city_name;
    }
    
    public double getPopulation() {
        return this.population;
    }
    
    public double getMedian() {
        return this.median;
    }
    
    public double getLocal() {
        return this.local;
    }
    
    public double getDegree() {
        return this.degree;
    }
    
    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public void setMedian(double median) {
        this.median = median;
    }

    public void setLocal(double local) {
        this.local = local;
    }

    public void setDegree(double degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "City{" + "city_name=" + city_name + ", population=" + population + ", median=" + median + ", local=" + local + ", degree=" + degree + '}';
    }

    public boolean equals(City city) {
        if (this.getName().equalsIgnoreCase(city.getName()) &&
                closeEnough(this.getPopulation(), city.getPopulation())) {
            return true;
        }
        return false;
    }
    
    private boolean closeEnough(double one, double two) {
        final double EPLSILON = 1E-9;
        if (Math.abs(two - one) < EPLSILON) {
            return true;
        }
        return false;
    }
    
}
