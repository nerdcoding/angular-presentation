/*
 * GroceryService.java
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

package org.nerdcoding.example.angular.presentation.business.service;


import org.nerdcoding.example.angular.presentation.business.repository.GroceryRepository;
import org.nerdcoding.example.angular.presentation.domain.Grocery;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@Service("groceryService")
@Transactional
public class GroceryService {

    @Inject
    private GroceryRepository groceryRepository;

    public Grocery createGrocery(Grocery grocery) {
        return groceryRepository.save(grocery);
    }

    public List<Grocery> findAllGroceries() {
        return groceryRepository.findAll();
    }

}
