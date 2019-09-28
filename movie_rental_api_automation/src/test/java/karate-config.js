function() {

var sessionId;
    var env = karate.env; // get system property 'karate.env'
    if (!env) {
        env = 'dev';
    }
    var config = {
        baseUrl: 'http://autothon-nagarro-backend-w07.azurewebsites.net',
    }
    // 'callSingle' is guaranteed to run only once even across all threads
    karate.configure('connectTimeout', 30000);
    karate.configure('readTimeout', 100000);

    return config;
}