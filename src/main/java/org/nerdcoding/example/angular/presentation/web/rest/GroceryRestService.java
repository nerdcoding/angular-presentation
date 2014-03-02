/*
 * GroceryRestService.java
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

package org.nerdcoding.example.angular.presentation.web.rest;

import org.nerdcoding.example.angular.presentation.business.service.GroceryService;
import org.nerdcoding.example.angular.presentation.domain.Grocery;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.ws.rs.*;
import java.util.List;

@Component
@Path("/grocery")
@Consumes("application/json")
@Produces("application/json")
public class GroceryRestService {

    @Inject
    private GroceryService groceryService;

    @GET
    // @Path("/{name}")
    public List<Grocery> findAllGroceries() {
        return groceryService.findAllGroceries();
    }

    @POST
    public Grocery createGrocery(Grocery grocery) {
        return groceryService.createGrocery(grocery);
    }

}
