var app = angular.module("spring", []);
app.controller("AppSpr", function ($scope, $http) {
    $scope.web = [];
    console.log(scope.web);
    $http.get("http://localhost:8090/count").then(function (response) {
        $scope.web = response.data;

    })
});