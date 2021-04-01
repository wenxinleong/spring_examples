# Spring Cloud Config

In this version, properties files are stored locally (check ```src/main/resources/configs```) instead of using Git repo. 

To override remote properties (```prop-1```) with local property file, additional settings are written to ```src/main/resources/configs/myconfig-client-app-development.properties```

This example is tested to work as expected.

Utilize REST endpoint: ```localhost:1001/config``` to validate properties, expected response:
```
{
    "prop1": "override with local",
    "prop2": "from app properties - development"
}
```
