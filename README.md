# Spring Security OAuth2 Keycloak Demo

This repository contains source code to demonstrate OAuth2 features using Spring Security and KeyCloak Authorization Server

After you checked out the project, run the following command:

`mvn clean verify`

This project contains examples for 3 OAuth2 Grant Types

- Authorization Code Flow (oauth2-authorization-code-demo)
- PKCE Authorization Code Flow (oauth2-pkce-demo)
- Client Credentials Flow (oauth2-client-credentials-demo)

- ### Run Keycloak
    - Download Keycloak from https://www.keycloak.org/downloads
    - If you are using standalone version, run the following command, by making sure you are inside the bin directory
      `standalone.bat -Djboss.http.port=<port>`, you can provide whatever port number you like.

- ### Importing Realm
    - Instead of creating the realm, you can make use of the `realm-export.json` file to import all the realm details into your Keycloak instance.
