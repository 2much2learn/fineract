## Steps

### Install localhost:8443 certificate

Without proper certificate, Java will throw `Caused by: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target` Exception.

Follow the below steps to install the certificate

* Run 'InstallCertForLocalHost.java' and when prompted for input give 1 and enter
* Copy generated jssecacerts file - `cp jssecacerts /usr/lib/jvm/jre/lib/security`. Create `jre/lib/security` folder under jvm if not available.

## Install localhost:8443

https://blog.arkey.fr/2017/10/19/self-signed-certificates-in-java.en/

* echo -n | openssl s_client -prexit -connect localhost:8443 2>&1 | openssl x509 -outform pem > certificate-localhost8443.pem
* /home/madan/.jdks/azul-11.0.8/bin/keytool -printcert -file certificate-localhost8443.pem
* openssl x509 -inform pem -in certificate-localhost8443.pem -text

* /home/madan/.jdks/azul-11.0.8/bin/keytool -import -alias localhost8443 -file certificate-localhost8443.pem -keystore /home/madan/.jdks/azul-11.0.8/jre/lib/security/cacerts
* /home/madan/.jdks/azul-11.0.8/bin/keytool -list -keystore /home/madan/.jdks/azul-11.0.8/jre/lib/security/cacerts

