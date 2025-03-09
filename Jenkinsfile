pipeline {
    agent any

    tools {
        jdk 'OpenJDK 11'  // Replace with your JDK installation name from Jenkins Global Tool Configuration
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout the source code from the GitHub repository
                git branch: 'main', url: 'https://github.com/KavithaBharathiraja/jenkins-cicd-project-.git'
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
  
