pipeline {

    agent any

    tools {
        jdk 'JDK25'
        maven 'Maven-3.9.16'
    }

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean package -DskipTests'
            }
        }

        stage('Unit Test') {
            steps {
                bat 'mvn test'
            }
        }

         stage('Deploy DEV') {
                    steps {
                        echo 'Deploying to DEV'
                    }
                }

                stage('Deploy UAT') {
                    steps {
                        input message: 'Deploy to UAT?'
                        echo 'Deploying to UAT'
                    }
                }

                stage('Deploy PROD') {
                    steps {
                        input message: 'Deploy to Production?'
                        echo 'Deploying to PROD'
                    }
                }
    }

    post {
        success {
            echo 'Pipeline completed successfully'
        }

        failure {
            echo 'Pipeline failed'
        }
    }
}