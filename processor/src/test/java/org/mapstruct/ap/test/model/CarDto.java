/**
 *  Copyright 2012-2013 Gunnar Morling (http://www.gunnarmorling.de/)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.mapstruct.ap.test.model;

import java.util.ArrayList;

public class CarDto {

    private String make;
    private int seatCount;
    private String manufacturingYear;
    private PersonDto driver;
    private ArrayList<PersonDto> passengers;
    private Long price;
    private String category;

    public CarDto() {
    }

    public CarDto(String make, int seatCount, String manufacturingYear, PersonDto driver, ArrayList<PersonDto> passengers) {
        this.make = make;
        this.seatCount = seatCount;
        this.manufacturingYear = manufacturingYear;
        this.driver = driver;
        this.passengers = passengers;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public String getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(String manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    public PersonDto getDriver() {
        return driver;
    }

    public void setDriver(PersonDto driver) {
        this.driver = driver;
    }

    public ArrayList<PersonDto> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<PersonDto> passengers) {
        this.passengers = passengers;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
