pipeline {
    agent any

    stages {
        stage ('Compile Stage') {

            steps {
                withMaven(maven : 'maven_3.8.3') {
                    bat 'mvn clean compile'
                }
            }
        }

        stage ('Testing Stage') {

            steps {
                withMaven(maven : 'maven_3.8.3') {
                    bat 'mvn test'
                }
            }
        }


        stage ('Deployment Stage') {
            steps {
                withMaven(maven : 'maven_3.8.3') {
                    bat 'mvn deploy'
                }
            }
        }
    }
}
