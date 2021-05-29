# Spring Boot Angular Keycloak Oauth2 PKCE Example

This repository contains source code to demonstrate how to implement Authorization Code Flow (PKCE) using Spring Boot, Angular and Keycloak.

## Instructions to run the project

- ### Run Keycloak
    - Download Keycloak from https://www.keycloak.org/downloads
    - If you are using standalone version, run the following command, by making sure you are inside the bin directory
      `standalone.bat -Djboss.http.port=<port>`, you can provide whatever port number you like.

- ### Importing Realm
    - Instead of creating the realm, you can make use of the `realm-export.json` file to import all the realm details into your Keycloak instance.

- ### Spring Boot Project
    - Pre-Requisite: Make sure the Keycloak server is running.
    - Run `mvn clean verify`
    - Run `Oauth2PKCEDemoApplication` class.

- ### Running Angular Project
    - Go to the `src/main/resources/frontend` and run `npm install`
    - Start the server using `npm start` command.
    - Open `http://localhost:4200`
