# Getting Started


## Local Environment Setup

You must set up your local environment before running it up.

1. Create a file .env at the root of the project. Take a look at Google Drive's team setup folder to get an example of some env vars.
2. Download [EnvFile](https://github.com/Ashald/EnvFile) plugin for IntellijIdea. This plugin will allow you to configure very easy your env vars.
3. Once the .env file is configured be aware of the init configuration file in ```/src/main/resources/db/init/01_init_db.sql```. There you should set your username and password. When you run the docker-compose, that file will be transfered to a postgres initialization folder which is going to execute the script.
