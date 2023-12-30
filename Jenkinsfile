pipeline {
    agent any

    environment {
        // This can be nexus3 or nexus2
        NEXUS_VERSION = "nexus3"
        // This can be http or https
        NEXUS_PROTOCOL = "http"
        // Where your Nexus is running
        NEXUS_URL = "192.168.1.32:9093"
        // Repository where we will upload the artifact
        NEXUS_REPOSITORY = "SpringBootWithDocker"
        // Jenkins credential id to authenticate to Nexus OSS
        NEXUS_CREDENTIAL_ID = "admin"
        ARTIFACT_VERSION = "${BUILD_NUMBER}"
    }

    stages {
        stage ('Compile Stage') {

            steps {
                withMaven(maven : 'maven_3.8.5') {
                    bat 'mvn clean compile'
                }
            }
        }

        stage ('Testing Stage') {

            steps {
                withMaven(maven : 'maven_3.8.5') {
                    bat 'mvn test'
                }
            }
        }


        stage ('Deployment Stage') {
            steps {
                withMaven(maven : 'maven_3.8.5') {
                    bat 'mvn deploy'
                }
            }
        }
    }
}
