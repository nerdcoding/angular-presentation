/*
 * StartupListener.java
 *
 * Copyright (c) 2014, Tobias Koltsch. All rights reserved.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/lgpl>.
 */

package org.nerdcoding.example.angular.presentation.web;

import org.nerdcoding.example.angular.presentation.business.service.GroceryService;
import org.nerdcoding.example.angular.presentation.domain.Grocery;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

@Component
public class StartupListener {

    @Inject
    private GroceryService groceryService;

    @PostConstruct
    public void populateMovieCache() {
        groceryService.createGrocery(createTestGrocery("Astra", 10, 0.89));
        groceryService.createGrocery(createTestGrocery("Früh Kölsch", 6, 1.09));
        groceryService.createGrocery(createTestGrocery("Ducksteiner", 4, 1.59));
        groceryService.createGrocery(createTestGrocery("Bitburger Pils", 1, 0.99));
    }

    private Grocery createTestGrocery(String name, Integer quantity, Double price) {
        Grocery grocery = new Grocery();
        grocery.setName(name);
        grocery.setQuantity(quantity);
        grocery.setPrice(price);

        return grocery;
    }

}
