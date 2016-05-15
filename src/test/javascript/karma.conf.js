module.exports = function(config) {
    config.set({
        basePath: '../../',
        files: [
            'main/webapp/static/node_modules/underscore/underscore.js',
            'main/webapp/static/node_modules/angular/angular.js',
            'main/webapp/static/node_modules/restangular/dist/restangular.js',
            'main/webapp/static/node_modules/angular-mocks/angular-mocks.js',
            'main/webapp/static/node_modules/phantomjs-polyfill/bind-polyfill.js',

            'test/javascript/mocks/modules.js',

            'main/webapp/static/js/**/*.js',
            'test/javascript/services/*.js'

        ],
        frameworks: ['jasmine'],
        port: 9876,
        runnerPort: 9100,
        autoWatch: true,
        browsers: ['PhantomJS']
    });
};
