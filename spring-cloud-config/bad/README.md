# Spring Cloud Config

In this version, properties files are stored locally (check ```src/main/resources/configs```) instead of using Git repo. 

To override remote properties (```prop-4```) with local property file, additional settings are written to ```src/main/resources/configs/myconfig-client-app-instance01.properties```

This example failed to work, prop4 override did not happen.

The issue is found in following version:
- spring-boot-starter-parent, version 2.4.4
- spring-cloud-dependencies, version 2020.0.2

Works ok in version:
- spring-boot-starter-parent, version 2.3.9.RELEASE
- spring-cloud-dependencies, version Hoxton.SR10

Utilize REST endpoint: ```localhost:1001/config``` to validate properties, expected response:
```
{
    "prop1": "from common properties - default",
    "prop11": "from app properties - instance01",
    "prop2": "from common properties - cluster2",
    "prop21": "from common properties - cluster2",
    "prop3": "from common properties - instance01",
    "prop31": "from common properties - instance01",
    "prop4": "from app properties - default", <-- Prop4 override did not happen 
    "prop41": "from app properties - default",
    "prop5": "from app properties - cluster2",
    "prop51": "from app properties - cluster2",
    "prop6": "from app properties - instance01",
    "prop61": "from app properties - instance01",
    "prop7": null
}
```
