angular.module('mavenGuide').service('GreetingService', ['Restangular', function(Restangular) {

    this.getGreeting = function(){
        return Restangular.one("ws/greeting").get();
    }

}]);