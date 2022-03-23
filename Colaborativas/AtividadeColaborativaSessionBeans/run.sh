mvn clean package
docker image build -t izaquiel/app .
docker container run -p 8082:8080 --name app izaquiel/app
