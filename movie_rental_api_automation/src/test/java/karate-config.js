function() {

var sessionId;
    var env = karate.env; // get system property 'karate.env'
    if (!env) {
        env = 'dev';
    }
    var config = {
        baseUrl: 'https://autothon-nagarro-backend-e07.azurewebsites.net',
    }
    // 'callSingle' is guaranteed to run only once even across all threads
    var result = karate.callSingle('classpath:login.feature', config);
    config.sessionId = result.sessionId;
    karate.configure('connectTimeout', 30000);
    karate.configure('readTimeout', 100000);

    return config;
}