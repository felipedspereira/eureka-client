# eureka-client
eureka service discovery client

This project is a client that register itself to a eureka server (see the application.yml)

## How to build

Just run `mvn clean package dockerfile:build` and a image will be generated in your machine.
Ps: it requires docker installed in the target machine.


## How to run

Just run `docker-compose up -d` to start the app
Ps: it requires docker-compose installed in the target machine.


## Available Endpoints

* `http://<HOST>:8888/ola`(prints a string)
