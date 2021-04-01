# Spring Cloud Config

In this version, properties files are stored locally (check ```src/main/resources/configs```) instead of using Git repo. 

To override remote properties (```prop-1```) with local property file, additional settings are written to ```src/main/resources/configs/myconfig-client-app-development.properties```

This example failed to work, prop1 override did not happen.

The issue is found in following version:
- spring-boot-starter-parent, version 2.4.4
- spring-cloud-dependencies, version 2020.0.2

Works ok in version:
- spring-boot-starter-parent, version 2.3.9.RELEASE
- spring-cloud-dependencies, version Hoxton.SR10

Utilize REST endpoint: ```localhost:1001/config``` to validate properties, expected response:
```
{
    "prop1": "from app properties - development", <-- not override
    "prop2": "from app properties - development"
}
```
