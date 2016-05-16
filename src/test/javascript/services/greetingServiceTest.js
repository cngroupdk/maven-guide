describe('Greeting Service', function () {

    var greetingService;
    var httpBackend;
    var q;

    beforeEach(module('mavenGuide'));
    beforeEach(inject(['GreetingService', '$httpBackend', '$q', function (service, $httpBackend, $q) {
        greetingService = service;
        httpBackend = $httpBackend;
        q = $q;
    }]));


    it("should retrieve a greeting", function () {
        httpBackend.expectGET('/ws/greeting').respond(200, "xxx");
        var promise = greetingService.getGreeting();

        promise.then(function (data) {
            expect(data).toBe("xxx");
        });

        httpBackend.flush();
    });

    it("should retrieve greeting with parameter", function () {
        httpBackend.expectGET('/ws/greeting/name/foo').respond(200, "xxx foo");
        var promise = greetingService.getGreetingPerson("foo");

        promise.then(function (data) {
            expect(data).toBe("xxx foo");
        });

        httpBackend.flush();
    });
});