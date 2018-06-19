echo 'Setting up Mongo Docker...'
docker run --name reactive-mongo -d -p 27017:27017 mongo:3.4 --auth
sleep 5s

echo 'Creating Mongo admin user...'
docker exec -it reactive-mongo mongo admin --eval 'db.createUser({user:"admin",pwd:"admin",roles:[{role:"userAdminAnyDatabase",db:"admin"}]})'

echo 'Creating Mongo database...'
docker exec -it reactive-mongo mongo admin -u admin -p admin --eval 'db.getSiblingDB("demoDB").createUser({user:"user",pwd:"pwd", roles:[{role:"readWrite",db:"demoDB"}]})'

echo 'Setting up Kafka Docker...'
docker-compose -f kafka.yml up -d

