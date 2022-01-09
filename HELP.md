# Getting Started


## Local Environment Setup

You must set up your local environment before running it up.

1. Create a file .env at the root of the project. Take a look at Google Drive's team setup folder to get an example of some env vars.
2. Once the .env file is configured, you must create a database:
   ``` sql
   CREATE DATABASE weirdms;
   CREATE USER youruser WITH ENCRYPTED PASSWORD 'changeme';
   GRANT ALL PRIVILEGES ON DATABASE weirdms to youruser
   ```