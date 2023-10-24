function fn() {
  var env = karate.env; // get system property 'karate.env'
  karate.log("karate.env system property was:", env);
  if (!env) {
    env = "dev";
  }
  var config = {
    env: env,
    myVarName: "someValue",
    url: "https://reqres.in/api/users?page=2",
    job : "tester"
  };
  if (env == "dev") {
    // customize
    // e.g. config.foo = 'bar';
    karate.log("env = dev");
  } else if (env == "e2e") {
    // customize
    karate.log("env = e2e");
  }
  return config;
}
