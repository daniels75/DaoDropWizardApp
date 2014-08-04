Compile
mvn clean install

Export to eclipse:
mvn eclipse:clean eclipse:eclipse -DdownloadSources=true
Then import as a Maven project


Initialize database:
java -jar target\DaoDropWizardApp-1.0.0.jar db migrate example.yml

How to run:
java -jar target\DaoDropWizardApp-1.0.0.jar server example.yml
In the same way you can run it with debug in Eclipse (Run as application and so on...)

Examples:
http://localhost:8080/hello-world

POST (via Advance REST Client)
http://localhost:8080/people/
Payload:
{"fullName":"DanielS", "jobTitle" : "Software developer" }


GET
http://localhost:8080/people/