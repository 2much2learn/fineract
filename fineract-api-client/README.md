## Steps

### Install localhost:8443 certificate - Didnt work

Without proper certificate, Java will throw `Caused by: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target` Exception.

Follow the below steps to install the certificate

* Run 'InstallCertForLocalHost.java' and when prompted for input give 1 and enter
* Copy generated jssecacerts file - `cp jssecacerts /usr/lib/jvm/jre/lib/security`. Create `jre/lib/security` folder under jvm if not available.

## Install localhost:8443 - Didnt work

https://blog.arkey.fr/2017/10/19/self-signed-certificates-in-java.en/

* echo -n | openssl s_client -prexit -connect localhost:8443 2>&1 | openssl x509 -outform pem > certificate-localhost8443.pem
* /home/madan/.jdks/azul-11.0.8/bin/keytool -printcert -file certificate-localhost8443.pem
* openssl x509 -inform pem -in certificate-localhost8443.pem -text

* /home/madan/.jdks/azul-11.0.8/bin/keytool -import -alias localhost8443 -file certificate-localhost8443.pem -keystore /home/madan/.jdks/azul-11.0.8/jre/lib/security/cacerts
* /home/madan/.jdks/azul-11.0.8/bin/keytool -list -keystore /home/madan/.jdks/azul-11.0.8/jre/lib/security/cacerts

###########

## Prestep

* Install mysql client on host
```
$ sudo apt install mysql-client-core-8.0
```

## Run Docker Compose commands from root to provision fineract

```
$ docker-compose build

$ docker-compose up --force-recreate -d
```

Wait for minimum of an hour or two for the databases to be created and all migration scripts to be executed on the created databases.

This is onetime activity and doesn't require to be recreated unless the container is shutdown with `docker-compose down`. Always use `docker-compose stop`.

Keep running the logs to see the progress of the migration and check of the logs to stop with below message indicating server started successfully.

```
$ docker-compose logs -f

fineract-server_1  | Sep 19, 2020 11:48:47 PM com.sun.jersey.server.impl.application.WebApplicationImpl _initiate
fineract-server_1  | INFO: Initiating Jersey application, version 'Jersey: 1.19.4 05/24/2017 03:20 PM'
fineract-server_1  | 2020-09-19 23:48:48.589  INFO 1 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) 8443 (https) with context path '/fineract-provider'
fineract-server_1  | 2020-09-19 23:48:48.784 ERROR 1 --- [           main] o.a.f.n.config.MessagingConfiguration    : Network Error: ActiveMQ Broker Unavailable.
fineract-server_1  | 2020-09-19 23:48:48.793  INFO 1 --- [           main] o.s.s.quartz.SchedulerFactoryBean        : Starting Quartz Scheduler now
fineract-server_1  | 2020-09-19 23:48:48.793  INFO 1 --- [           main] org.quartz.core.QuartzScheduler          : Scheduler quartzScheduler_$_NON_CLUSTERED started.
fineract-server_1  | 2020-09-19 23:48:48.809  INFO 1 --- [           main] org.apache.fineract.ServerApplication    : Started ServerApplication in 4743.103 seconds (JVM running for 4743.709)
```

Access `http://localhost:9090/?baseApiUrl=https://localhost:8443/fineract-provider&tenantIdentifier=default` and login with `mifos/password` credentials.

If logged in successfully, we are all set with Apache Fineract + Mifos Web Application

Use the below commands to stop & start the services

```
$ docker-compose stop

$ docker-compose start
```

## Using Adminer

Adminer is provisioned as part of the service. Use it to login and query database without the need to install sql client.

* Access `http://localhost:9088` 
* set server to `fineractmysql`
* use credentials `root` and `skdcnwauicn2ucnaecasdsajdnizucawencascdca`
* Click on `fineract_default` or `fineract_tenants` to explore the tables created by fineract database scripts

## Using Mysql Client

Login to mysql cli using below command

```
$ mysql -uroot -h 0.0.0.0 -P 3306 --protocol=tcp -pskdcnwauicn2ucnaecasdsajdnizucawencascdca
```

## Backup & Restore mysql data

Run the below command to dump fineract databases and import them if needed.

```
$ mysqldump \
    -h 0.0.0.0 -P 3306 -uroot -pskdcnwauicn2ucnaecasdsajdnizucawencascdca \
    --default-character-set=utf8 \
    --column-statistics=0 \
    --add-drop-database \
    --protocol=tcp \
    --databases fineract_default  fineract_tenants \
    > fineract-db/fineract_db_initial_base_dump.sql
```

backup if needed:
```
--add-drop-database --add-drop-table --add-drop-trigger --allow-keywords --comments --compact --complete-insert --disable-keys --extended-insert --quick --routines --tz-utc
```

Run the below command to restore fineract databases which will drop the databases and create them

```
$ mysql \
    -h 0.0.0.0 -P 3306 -uroot -pskdcnwauicn2ucnaecasdsajdnizucawencascdca \
    < fineract-db/fineract_db_initial_base_dump.sql
```

__Note__: Dump takes a minute or two, but restore often takes more 15-25 minutes.

## Cleanup