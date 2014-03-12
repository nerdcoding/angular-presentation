'use strict'


function groceryListCtrl($scope, $http) {

    $scope.groceries = [];
    $http.get('/angular/rest/grocery').success(function(data) {
        $scope.groceries = data;
    });


//    $scope.groceries = [
//        {name: "noodle", quantity: 2, price: 0.99},
//        {name: "juice", quantity: 4, price: 1.99},
//        {name: "milk", quantity: 3, price: 0.49},
//        {name: "cereal", quantity: 1, price: 2.99}
//    ];

    $scope.removeGrocery = function(index) {
        $scope.groceries.splice(index, 1);
    }

    $scope.total = function() {
        var total = 0;
        for (var i=0; i < $scope.filteredGroceries.length; i++ ) {
            total = total + ($scope.filteredGroceries[i].quantity * $scope.filteredGroceries[i].price);
        }
        return total;
    }

    $scope.addGrocery = function() {
        $http.post('/angular/rest/grocery', $scope.grocery).success(function() {
            $http.get('/angular/rest/grocery').success(function(data) {
                $scope.groceries = data;
                $scope.grocery = {};
            });
        });

        //$scope.groceries.push($scope.grocery);
    }

}


