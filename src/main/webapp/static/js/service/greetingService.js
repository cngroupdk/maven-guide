angular.module('mavenGuide').service('GreetingService', ['Restangular', function(Restangular) {

    this.getGreeting = function(){
        return Restangular.one("ws/greeting").get();
    };

    this.getGreetingPerson = function(name){
        return Restangular.one("ws/greeting/name", name).get();
    };

}]);