pipeline {
    agent any

    environment {
        JAVA_HOME = '/usr/lib/jvm/java-11-openjdk'
        PATH = "${JAVA_HOME}/bin:${env.PATH}"
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout the source code from the GitHub repository
                git 'https://github.com/KavithaBharathiraja/jenkins-cicd-project-.git
'  // Replace with your repo URL
            }
        }

        stage('Build') {
            steps {
                // Compile and package the application using Maven
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                // Run unit tests using Maven
                sh 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                // Deploy your application (example: print a message)
                echo 'Deploying the application...'
            }
        }
    }

    post {
        success {
            echo 'Build and tests passed!'
        }
        failure {
            echo 'Build failed!'
        }
    }
}
